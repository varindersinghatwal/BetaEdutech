package com.betaedutech.alogapp;

/**
 * Created by varinderatwal on 18/06/16.
 */
public class Vertex {
    private int _x;
    private int _y;

    public Vertex(){};

    public Vertex(int x, int y){
        _x = x;
        _y = y;
    };

    public void setX(int x){
        _x = x;
    }

    public void setY(int y){
        _y = y;
    }

    public int getPositionX(){
        return _x;
    }

    public int getPositionY(){
        return _y;
    }
}
