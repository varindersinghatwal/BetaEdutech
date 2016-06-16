package com.betaedutech.alogapp;

/**
 * Created by varinderatwal on 17/06/16.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class GraphView extends View{

    public GraphView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        createCircleOnCanvas(canvas, 300, 150, "A");
        canvas.restore();
    }

    private void createCircleOnCanvas(Canvas canvas, int x, int y, String text){
        Paint paint = new Paint();
        Paint circlePaint = new Paint();

        paint.setColor(Color.WHITE);
        paint.setTextSize(60f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);

        Rect bounds = new Rect();
        paint.getTextBounds(text, 0, text.length(), bounds);

        circlePaint.setColor(Color.RED);
        circlePaint.setAntiAlias(true);

        canvas.drawCircle(x, y - (bounds.height() / 2), bounds.width() + 30, circlePaint);
        canvas.drawText(text, x, y, paint);
    }
}