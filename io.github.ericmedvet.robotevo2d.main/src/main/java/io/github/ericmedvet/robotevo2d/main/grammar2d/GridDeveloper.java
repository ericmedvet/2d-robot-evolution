package io.github.ericmedvet.robotevo2d.main.grammar2d;

import java.util.Optional;

import io.github.ericmedvet.mrsim2d.core.util.Grid;

public interface GridDeveloper<T> {

    interface Chooser<T> {
        Optional<ReferencedGrid<T>> choose(T t);
    }

    Optional<Grid<T>> develop(Chooser<T> chooser);

}
