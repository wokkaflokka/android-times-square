// Copyright 2012 Square, Inc.

package com.squareup.timessquare;

import java.util.Date;
import java.util.List;

/** Describes the state of a particular date cell in a {@link MonthView}. */
class MonthCellDescriptor {
  public enum RangeState {
    NONE, FIRST, MIDDLE, LAST
  }

  private final Date date;
  private final int value;
  private final boolean isCurrentMonth;
  private boolean isSelected;
  private final boolean isToday;
  private final boolean isSelectable;
  private final boolean isDecoratable;
  private boolean isHighlighted;
  private RangeState rangeState;
  private List<CalendarCellDecorator> decorators;


  MonthCellDescriptor(Date date, boolean currentMonth, boolean selectable, boolean decoratable,
      boolean selected, boolean today, boolean highlighted, int value, RangeState rangeState) {
    this.date = date;
    isCurrentMonth = currentMonth;
    isSelectable = selectable;
    isDecoratable = decoratable;
    isHighlighted = highlighted;
    isSelected = selected;
    isToday = today;
    this.value = value;
    this.rangeState = rangeState;
  }

  public Date getDate() {
    return date;
  }

  public boolean isCurrentMonth() {
    return isCurrentMonth;
  }

  public boolean isSelectable() {
    return isSelectable;
  }

  public boolean isSelected() {
    return isSelected;
  }

  public boolean isDecoratable() {
      return isDecoratable;
  }

  public void setSelected(boolean selected) {
    isSelected = selected;
  }

  boolean isHighlighted() {
    return isHighlighted;
  }

  void setHighlighted(boolean highlighted) {
    isHighlighted = highlighted;
  }

  public boolean isToday() {
    return isToday;
  }

  public RangeState getRangeState() {
    return rangeState;
  }

  public void setRangeState(RangeState rangeState) {
    this.rangeState = rangeState;
  }

  public int getValue() {
    return value;
  }

  public List<CalendarCellDecorator> getDecorators() {
      return decorators;
  }

  public void setDecorators(List<CalendarCellDecorator> decorators) {
      this.decorators = decorators;
  }

  @Override public String toString() {
    return "MonthCellDescriptor{"
        + "date="
        + date
        + ", value="
        + value
        + ", isCurrentMonth="
        + isCurrentMonth
        + ", isSelected="
        + isSelected
        + ", isToday="
        + isToday
        + ", isSelectable="
        + isSelectable
        + ", isHighlighted="
        + isHighlighted
        + ", rangeState="
        + rangeState
        + '}';
  }
}
