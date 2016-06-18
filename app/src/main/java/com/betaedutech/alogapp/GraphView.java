package com.betaedutech.alogapp;

/**
 * Created by varinderatwal on 17/06/16.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;

public class GraphView extends View{

    private int width = 0;
    private int height = 0;
    public GraphView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        width = getWidth();
        height = getHeight();
        System.out.println("width: "+width+" height: "+height);

        createCircleOnCanvas(canvas, width/2, height/10, "A");
        createCircleOnCanvas(canvas, width/8, height/3, "B");
        drawLineOnCanvas(canvas,width/2, height/10, width/8, height/3);

        createCircleOnCanvas(canvas, width/2, height/2, "C");
        createCircleOnCanvas(canvas, width-width/8,height/3,"D");
        createCircleOnCanvas(canvas, width/4,height-height/3,"E");
        createCircleOnCanvas(canvas, width-width/4,height-height/6,"F");

        canvas.restore();
    }

    private void createCircleOnCanvas(Canvas canvas, float x, float y, String text){
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

    private void drawLineOnCanvas(Canvas canvas, float startX, float starY, float endX, float endY){
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(8);
        canvas.drawLine(startX, starY, endX, endY, paint);
    }
}