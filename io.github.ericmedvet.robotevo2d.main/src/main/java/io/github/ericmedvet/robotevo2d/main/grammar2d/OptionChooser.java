package io.github.ericmedvet.robotevo2d.main.grammar2d;

import java.util.List;

public interface OptionChooser<T> {
  ReferencedGrid<T> choose(T t, List<ReferencedGrid<T>> options);
}
