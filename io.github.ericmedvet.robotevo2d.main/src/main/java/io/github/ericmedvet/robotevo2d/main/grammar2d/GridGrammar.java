package io.github.ericmedvet.robotevo2d.main.grammar2d;

import java.util.List;
import java.util.Map;

public record GridGrammar<T>(
    T startingSymbol,
    Map<T, List<ReferencedGrid<T>>> rules
) {
}
