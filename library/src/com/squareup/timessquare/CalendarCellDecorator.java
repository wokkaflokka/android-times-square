package com.squareup.timessquare;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Date;

public interface CalendarCellDecorator {
  void paintCell(Canvas canvas, Paint paint, int height, int width);
  Date getDecoratedDay();
}