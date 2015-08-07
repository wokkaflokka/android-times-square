package com.squareup.timessquare;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.LinkedList;
import java.util.List;

public class CellDecorationView extends View {

    private List<CalendarCellDecorator> decorators = new LinkedList<CalendarCellDecorator>();
    private Paint paint = new Paint();

    public CellDecorationView(Context context) {
        super(context);
    }

    public CellDecorationView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CellDecorationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * Add a decorator to be drawn
     * @param decorator
     */
    public void addDecorator(CalendarCellDecorator decorator) {
        decorators.add(decorator);
        invalidate();
    }

    public void clearDecorators() {
        decorators.clear();
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getMeasuredHeight();
        int width = getMeasuredWidth();
        for (CalendarCellDecorator decorator : decorators) {
            decorator.paintCell(canvas, paint, height, width);
        }
    }
}