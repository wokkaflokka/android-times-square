package com.squareup.timessquare;

/**
 * A {@link CalendarCellDecorator} that can be filtered and sorted.
 */
public interface WeightedCellDecorator extends CalendarCellDecorator {
    /**
     * @return an integer representing the weight at which this decorator
     * applies to a given cell, where larger numbers have higher priority
     */
    Integer getPriority();
}