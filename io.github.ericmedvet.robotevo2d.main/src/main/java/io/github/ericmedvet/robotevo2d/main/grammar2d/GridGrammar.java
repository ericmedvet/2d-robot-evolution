package io.github.ericmedvet.robotevo2d.main.grammar2d;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import io.github.ericmedvet.mrsim2d.core.util.Grid;
import io.github.ericmedvet.mrsim2d.core.util.Grid.Key;

public class GridGrammar<T> implements Serializable {

    public static final String RULE_ASSIGNMENT_STRING = "::=";
    public static final String RULE_OPTION_SEPARATOR_STRING = "|";
    Map<T, List<ReferencedGrid<T>>> rules;
    private T startingSymbol;

    public GridGrammar() {
        rules = new LinkedHashMap<>();
    }

    public static GridGrammar<String> fromFile(File file) throws FileNotFoundException, IOException {
        return fromFile(file, "UTF-8");
    }

    public static GridGrammar<String> fromFile(File file, String charset) throws FileNotFoundException, IOException {
        GridGrammar<String> grammar = new GridGrammar<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        String line;
        while ((line = br.readLine()) != null) {
            String[] components = line.split(Pattern.quote(RULE_ASSIGNMENT_STRING));
            String toReplaceSymbol = components[0].trim();
            String[] optionStrings = components[1].split(Pattern.quote(RULE_OPTION_SEPARATOR_STRING));
            if (grammar.getStartingSymbol() == null) {
                grammar.setStartingSymbol(toReplaceSymbol);
            }
            List<ReferencedGrid<String>> options = new ArrayList<>();
            for (String optionString : optionStrings) {

                String[] rule = optionString.replaceAll("\\s+", "").split(";");
                String coordReference = rule[0].replaceAll("[()]", "");

                Key referencePoint = new Key(Integer.parseInt(coordReference.split(",")[0]),
                        Integer.parseInt(coordReference.split(",")[1]));
                String[] gridRows = Arrays.copyOfRange(rule, 1, rule.length);

                int height = gridRows.length;
                int width = gridRows[0].split(",", -1).length;
                Grid<String> polyomino = Grid.create(width, height);
                int ycoord = 0;
                for (String gridRow : gridRows) {
                    
                    int xcoord = 0;
                    for (String element : gridRow.split(",", -1)) {
                        if (!element.isEmpty()) {
                            polyomino.set(xcoord, ycoord, element);
                        }
                        xcoord += 1;
                    }                    
                    ycoord += 1;
                }
                ReferencedGrid<String> productionRule = new ReferencedGrid<>(referencePoint, polyomino);
                options.add(productionRule);
            }
            grammar.getRules().put(toReplaceSymbol, options);
        }
        br.close();

        return grammar;
    }

    public Map<T, List<ReferencedGrid<T>>> getRules() {
        return rules;
    }

    public T getStartingSymbol() {
        return startingSymbol;
    }

    public void setStartingSymbol(T startingSymbol) {
        this.startingSymbol = startingSymbol;
    }

}
