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

        Node nodeA = new Node();
        nodeA.setPosition(width/2, height/10);
        nodeA.setText("A");
        nodeA.setColor(Color.BLUE);

        createCircleOnCanvas(canvas, nodeA);

        Node nodeB = new Node("B",new Vertex(width/8, height/3),Color.RED);

        createCircleOnCanvas(canvas, nodeB);

        Node nodeC = new Node("C", new Vertex(width/2, height/2), Color.GREEN);
        createCircleOnCanvas(canvas, nodeC);

        Node nodeD = new Node("D", new Vertex(width-width/8,height/3), Color.RED);
        createCircleOnCanvas(canvas, nodeD);

        Node nodeE = new Node("E", new Vertex(width/4,height-height/3), Color.MAGENTA);
        createCircleOnCanvas(canvas, nodeE);

        Node nodeF = new Node("F", new Vertex(width - width / 4, height-height/6), Color.DKGRAY);
        createCircleOnCanvas(canvas, nodeF);

        drawLineOnCanvas(canvas, nodeA, nodeB, Color.BLACK);

        canvas.restore();
    }

    private void createCircleOnCanvas(Canvas canvas, Node node){
        Paint paint = new Paint();
        Paint circlePaint = new Paint();

        paint.setColor(Color.WHITE);
        paint.setTextSize(60f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);

        Rect bounds = new Rect();
        paint.getTextBounds(node.getText(), 0, node.getText().length(), bounds);

        circlePaint.setColor(node.getColor());
        circlePaint.setAntiAlias(true);

        canvas.drawCircle(node.getPositionX(), node.getPositionY() - (bounds.height() / 2), bounds.width() + 30, circlePaint);
        canvas.drawText(node.getText(), node.getPositionX(), node.getPositionY(), paint);
    }

    private void drawLineOnCanvas(Canvas canvas, Node nodeA, Node nodeB, int color){
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(8);
        canvas.drawLine(nodeA.getPositionX(), nodeA.getPositionY(),
                nodeB.getPositionX(), nodeB.getPositionY(), paint);
    }
}