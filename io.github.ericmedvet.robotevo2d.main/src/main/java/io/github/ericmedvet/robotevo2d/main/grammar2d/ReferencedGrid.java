package io.github.ericmedvet.robotevo2d.main.grammar2d;

import io.github.ericmedvet.mrsim2d.core.util.Grid;

public record ReferencedGrid<T>(
    Grid.Key referenceKey,
    Grid<T> grid
) {
}
