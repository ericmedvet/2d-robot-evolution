package io.github.ericmedvet.robotevo2d.main.grammar2d;

import io.github.ericmedvet.mrsim2d.core.util.Grid;

import java.util.List;

public class GridProducer {

  public enum SortingCriterion {LEAST_RECENT, MOST_RECENT, LEAST_FREE_SIDES, MOST_FREE_SIDE, LOWEST_X, LOWEST_Y}

  private final boolean overwriting;
  private final List<SortingCriterion> criteria;

  public GridProducer(boolean overwriting, List<SortingCriterion> criteria) {
    this.overwriting = overwriting;
    this.criteria = criteria;
  }

  public <T> Grid<T> produce(GridGrammar<T> gridGrammar, OptionChooser<T> optionChooser) {
    //build a 1x1 grid with the starting symbol
    //iterate
    //  0. find the non-terminal t* to be replaced (using criteria)
    //  1. find productions for t* in the grammar
    //  [NO: possibly discard productions based on overwriting (if 0 remaining, go back to 0)]
    //  2. choose one p* calling optionChooser
    //  3. if !overwriting && p* is not applicable, go back to 0
    //  4. modify (possibly enlarging it) the grid using p*
    return null;
  }
}
