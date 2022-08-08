/*
 * Copyright 2022 Eric Medvet <eric.medvet@gmail.com> (as eric)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.units.erallab.robotevo.util;

import java.util.*;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author "Eric Medvet" on 2022/08/08 for 2d-robot-evolution
 */
public class NamedParamMap {

  // BNF
  // <e> ::= <n>(<nps>)
  // <nps> ::= <np> | <nps>;<np>
  // <np> ::= <n>=<e> | <n>=<d> | <n>=<s> | <n>=[<es>] | <n>=[<ds>] | <n>=[<ns>]
  // <es> ::= <e> | <es>;<e>
  // <ds> ::= <d> | <ds>;<d>
  // <ns> ::= <n> | <ns>;<s>

  private interface Node {
    Token token();
  }

  private record ENode(Token token, List<NPNode> children, String name) implements Node {}

  private record NPNode(Token token, String name, Node value) implements Node {}

  private record DNode(Token token, Number value) implements Node {}

  private record SNode(Token token, String value) implements Node {}

  private record DSNode(Token token, List<DNode> children) implements Node {}

  private record SSNode(Token token, List<SNode> children) implements Node {}

  private record ESNode(Token token, List<ENode> children) implements Node {}

  private record Token(int start, int end) {}

  private enum TokenType {
    NUM("-?[0-9]+(\\.[0-9]+)?", ""),
    STRING("[A-Za-z][A-Za-z0-9_]*", ""),
    OPEN_CONTENT("\\(", "("),
    CLOSED_CONTENT("\\)", ")"),
    ASSIGN_SEPARATOR("=", "="),
    LIST_SEPARATOR(";", ";"),
    OPEN_LIST("\\[", "["),
    CLOSED_LIST("\\]", "]");
    private final String regex;
    private final String rendered;

    TokenType(String regex, String rendered) {
      this.regex = regex;
      this.rendered = rendered;
    }

    public Optional<Token> next(String s, int i) {
      Matcher matcher = Pattern.compile(regex).matcher(s);
      if (!matcher.find(i)) {
        return Optional.empty();
      }
      if (matcher.start() != i) {
        return Optional.empty();
      }
      return Optional.of(new Token(matcher.start(), matcher.end()));
    }

    public String regex() {
      return regex;
    }

    public String rendered() {
      return rendered;
    }
  }

  private static Supplier<IllegalArgumentException> error(TokenType tokenType, String s, int i) {
    return () -> new IllegalArgumentException(String.format(
        "Cannot find %s token: `%s` does not match %s",
        tokenType.name().toLowerCase(),
        s.substring(i),
        tokenType.regex
    ));
  }

  private static boolean isInt(Double v) {
    return v.intValue() == v;
  }

  private static ENode parseE(String s, int i) {
    Token tName = TokenType.STRING.next(s, i).orElseThrow(error(TokenType.STRING, s, i));
    Token tOpenPar = TokenType.OPEN_CONTENT.next(s, tName.end()).orElseThrow(error(
        TokenType.OPEN_CONTENT,
        s,
        tName.end()
    ));
    List<NPNode> nodes = parseNPS(s, tOpenPar.end());
    Token tClosedPar = TokenType.CLOSED_CONTENT.next(
        s,
        nodes.isEmpty() ? tOpenPar.end() : nodes.get(nodes.size() - 1).token().end()
    ).orElseThrow(error(
        TokenType.CLOSED_CONTENT,
        s,
        nodes.isEmpty() ? tOpenPar.end() : nodes.get(nodes.size() - 1).token().end()
    ));
    return new ENode(new Token(tName.start(), tClosedPar.end()), nodes, s.substring(tName.start(), tName.end()));
  }

  private static List<NPNode> parseNPS(String s, int i) {
    List<NPNode> nodes = new ArrayList<>();
    nodes.add(parseNP(s, i));
    while (true) {
      Optional<Token> ot = TokenType.LIST_SEPARATOR.next(s, nodes.get(nodes.size() - 1).token().end());
      if (ot.isEmpty()) {
        break;
      }
      nodes.add(parseNP(s, ot.get().end()));
    }
    return nodes;
  }

  private static NPNode parseNP(String s, int i) {
    Token tName = TokenType.STRING.next(s, i).orElseThrow(error(TokenType.STRING, s, i));
    Token tAssign = TokenType.ASSIGN_SEPARATOR.next(s, tName.end()).orElseThrow(error(
        TokenType.ASSIGN_SEPARATOR,
        s,
        tName.end()
    ));
    Node value = null;
    try {
      value = parseE(s, tAssign.end());
    } catch (IllegalArgumentException e) {
      //ignore
    }
    if (value == null) {
      value = TokenType.NUM.next(s, tAssign.end()).map(t -> new DNode(
          t,
          Double.parseDouble(s.substring(t.start(), t.end()))
      )).orElse(null);
    }
    if (value == null) {
      value = TokenType.STRING.next(s, tAssign.end()).map(t -> new SNode(
          t,
          s.substring(t.start(), t.end())
      )).orElse(null);
    }
    try {
      value = parseDS(s, tAssign.end());
    } catch (IllegalArgumentException e) {
      //ignore
    }
    try {
      value = parseES(s, tAssign.end());
    } catch (IllegalArgumentException e) {
      //ignore
    }
    try {
      value = parseSS(s, tAssign.end());
    } catch (IllegalArgumentException e) {
      //ignore
    }
    if (value == null) {
      throw new IllegalArgumentException(String.format("Cannot find valid token as param value at `%s`", s.substring(
          tAssign.end())));
    }
    return new NPNode(
        new Token(tName.start(), value.token().end()),
        s.substring(tName.start(), tName.end()),
        value
    );
  }

  private static DSNode parseDS(String s, int i) {
    List<DNode> nodes = new ArrayList<>();
    Token openT = TokenType.OPEN_LIST.next(s, i).orElseThrow(error(TokenType.OPEN_LIST, s, i));
    TokenType.NUM.next(s, openT.end())
        .map(t -> new DNode(t, Double.parseDouble(s.substring(t.start(), t.end()))))
        .ifPresent(nodes::add);
    while (!nodes.isEmpty()) {
      Optional<Token> sepT = TokenType.LIST_SEPARATOR.next(s, nodes.get(nodes.size() - 1).token().end());
      if (sepT.isEmpty()) {
        break;
      }
      Token valueT = TokenType.NUM.next(s, sepT.get().end()).orElseThrow(error(TokenType.NUM, s, sepT.get().end()));
      nodes.add(new DNode(valueT, Double.parseDouble(s.substring(valueT.start(), valueT.end()))));
    }
    Token closedT = TokenType.CLOSED_LIST.next(
            s,
            nodes.isEmpty() ? openT.end() : nodes.get(nodes.size() - 1).token().end()
        )
        .orElseThrow(error(
            TokenType.CLOSED_LIST,
            s,
            nodes.isEmpty() ? openT.end() : nodes.get(nodes.size() - 1).token().end()
        ));
    return new DSNode(new Token(openT.start(), closedT.end()), nodes);
  }

  private static SSNode parseSS(String s, int i) {
    List<SNode> nodes = new ArrayList<>();
    Token openT = TokenType.OPEN_LIST.next(s, i).orElseThrow(error(TokenType.OPEN_LIST, s, i));
    TokenType.STRING.next(s, openT.end())
        .map(t -> new SNode(t, s.substring(t.start(), t.end())))
        .ifPresent(nodes::add);
    while (!nodes.isEmpty()) {
      Optional<Token> sepT = TokenType.LIST_SEPARATOR.next(s, nodes.get(nodes.size() - 1).token().end());
      if (sepT.isEmpty()) {
        break;
      }
      Token valueT = TokenType.STRING.next(s, sepT.get().end()).orElseThrow(error(
          TokenType.STRING,
          s,
          sepT.get().end()
      ));
      nodes.add(new SNode(valueT, s.substring(valueT.start(), valueT.end())));
    }
    Token closedT = TokenType.CLOSED_LIST.next(
            s,
            nodes.isEmpty() ? openT.end() : nodes.get(nodes.size() - 1).token().end()
        )
        .orElseThrow(error(
            TokenType.CLOSED_LIST,
            s,
            nodes.isEmpty() ? openT.end() : nodes.get(nodes.size() - 1).token().end()
        ));
    return new SSNode(new Token(openT.start(), closedT.end()), nodes);
  }

  private static ESNode parseES(String s, int i) {
    List<ENode> nodes = new ArrayList<>();
    Token openT = TokenType.OPEN_LIST.next(s, i).orElseThrow(error(TokenType.OPEN_LIST, s, i));
    try {
      nodes.add(parseE(s, openT.end()));
    } catch (IllegalArgumentException e) {
      //ignore
    }
    while (!nodes.isEmpty()) {
      Optional<Token> sepT = TokenType.LIST_SEPARATOR.next(s, nodes.get(nodes.size() - 1).token().end());
      if (sepT.isEmpty()) {
        break;
      }
      nodes.add(parseE(s, sepT.get().end()));
    }
    Token closedT = TokenType.CLOSED_LIST.next(
            s,
            nodes.isEmpty() ? openT.end() : nodes.get(nodes.size() - 1).token().end()
        )
        .orElseThrow(error(
            TokenType.CLOSED_LIST,
            s,
            nodes.isEmpty() ? openT.end() : nodes.get(nodes.size() - 1).token().end()
        ));
    return new ESNode(new Token(openT.start(), closedT.end()), nodes);
  }

  public static NamedParamMap parse(String string) throws IllegalArgumentException {
    ENode eNode = parseE(string, 0);
    return new NamedParamMap(eNode);
  }

  private final String name;
  private final Map<String, Double> dMap;
  private final Map<String, String> sMap;
  private final Map<String, NamedParamMap> npmMap;
  private final Map<String, List<Double>> dsMap;
  private final Map<String, List<String>> ssMap;
  private final Map<String, List<NamedParamMap>> npmsMap;

  private NamedParamMap(
      String name,
      Map<String, Double> dMap,
      Map<String, String> sMap,
      Map<String, NamedParamMap> npmMap,
      Map<String, List<Double>> dsMap,
      Map<String, List<String>> ssMap,
      Map<String, List<NamedParamMap>> npmsMap
  ) {
    this.name = name;
    this.dMap = dMap;
    this.sMap = sMap;
    this.npmMap = npmMap;
    this.dsMap = dsMap;
    this.ssMap = ssMap;
    this.npmsMap = npmsMap;
  }

  private NamedParamMap(ENode eNode) {
    this(
        eNode.name(),
        eNode.children.stream()
            .filter(n -> n.value() instanceof DNode)
            .collect(Collectors.toMap(NPNode::name, n -> ((DNode) n.value()).value().doubleValue())),
        eNode.children.stream()
            .filter(n -> n.value() instanceof SNode)
            .collect(Collectors.toMap(NPNode::name, n -> ((SNode) n.value()).value())),
        eNode.children.stream()
            .filter(n -> n.value() instanceof ENode)
            .collect(Collectors.toMap(NPNode::name, n -> new NamedParamMap((ENode) n.value))),
        eNode.children.stream()
            .filter(n -> n.value() instanceof DSNode)
            .collect(Collectors.toMap(
                NPNode::name,
                n -> ((DSNode) n.value()).children().stream().map(c -> c.value().doubleValue()).toList()
            )),
        eNode.children.stream()
            .filter(n -> n.value() instanceof SSNode)
            .collect(Collectors.toMap(
                NPNode::name,
                n -> ((SSNode) n.value()).children().stream().map(SNode::value).toList()
            )),
        eNode.children.stream()
            .filter(n -> n.value() instanceof ESNode)
            .collect(Collectors.toMap(
                NPNode::name,
                n -> ((ESNode) n.value()).children().stream().map(NamedParamMap::new).toList()
            ))
    );
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append(TokenType.OPEN_CONTENT.rendered());
    Map<String, String> content = new HashMap<>();
    dMap.forEach((key, value) -> content.put(key, value.toString()));
    npmMap.forEach((key, value) -> content.put(key, value.toString()));
    content.putAll(sMap);
    dsMap.forEach((key, value) -> content.put(
        key,
        TokenType.OPEN_LIST.rendered() +
            value.stream()
                .map(Object::toString)
                .collect(Collectors.joining(TokenType.LIST_SEPARATOR.rendered)) +
            TokenType.CLOSED_LIST.rendered()
    ));
    ssMap.forEach((key, value) -> content.put(
        key,
        TokenType.OPEN_LIST.rendered() +
            value.stream()
                .map(Object::toString)
                .collect(Collectors.joining(TokenType.LIST_SEPARATOR.rendered)) +
            TokenType.CLOSED_LIST.rendered()
    ));
    npmsMap.forEach((key, value) -> content.put(
        key,
        TokenType.OPEN_LIST.rendered() +
            value.stream()
                .map(Object::toString)
                .collect(Collectors.joining(TokenType.LIST_SEPARATOR.rendered)) +
            TokenType.CLOSED_LIST.rendered()
    ));
    sb.append(content.entrySet().stream()
        .map(e -> e.getKey() + TokenType.ASSIGN_SEPARATOR.rendered() + e.getValue())
        .collect(Collectors.joining(TokenType.LIST_SEPARATOR.rendered())));
    sb.append(TokenType.CLOSED_CONTENT.rendered());
    return sb.toString();
  }

  public Integer i(String n) {
    if (!dMap.containsKey(n)) {
      return null;
    }
    double v = dMap.get(n);
    return isInt(v) ? (int) v : null;
  }

  public Double d(String n) {
    return dMap.get(n);
  }

  public String s(String n) {
    return sMap.get(n);
  }

  public boolean b(String n) {
    return sMap.getOrDefault(n, "false").equalsIgnoreCase(Boolean.TRUE.toString());
  }

  public NamedParamMap npm(String n) {
    return npmMap.get(n);
  }

  public List<Integer> is(String n) {
    if (!dsMap.containsKey(n)) {
      return null;
    }
    List<Double> vs = dsMap.get(n);
    List<Integer> is = vs.stream().filter(NamedParamMap::isInt).map(Double::intValue).toList();
    if (is.size() == vs.size()) {
      return is;
    }
    return null;
  }

  public List<String> ss(String n) {
    return ssMap.get(n);
  }

  public List<Double> ds(String n) {
    return dsMap.get(n);
  }

  public List<Boolean> bs(String n) {
    if (!ssMap.containsKey(n)) {
      return null;
    }
    return ssMap.get(n).stream().map(s -> s.equalsIgnoreCase(Boolean.TRUE.toString())).toList();
  }

  public List<NamedParamMap> npms(String n) {
    return npmsMap.get(n);
  }

  public static void main(String[] args) {
    NamedParamMap m = NamedParamMap.parse(
        "name(cs=[a(i=1.0);b(i=2.1)];x=ciao;y=3.0;z=ailo(r=-12.0;z=-1.55;names=[caino;abele]);xs=[1.0;2.0;3.0;5.0];" +
            "flag=true)");
    System.out.println(m.npm("z").i("r"));
    System.out.println(m.npm("z").d("z"));
    System.out.println(m.b("flag"));
  }
}
