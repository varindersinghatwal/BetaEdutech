package com.betaedutech.alogapp;

import android.graphics.Color;

public class Node {
    private String _text;
    private Vertex _vertex;
    private int _color;
    private int _value;

    public Node(){
        _color = Color.RED;
        _text = "N";
        _vertex = new Vertex(0, 0);
    }

    public Node(String text){
        _text = text;
        _color = Color.RED;
        _vertex = new Vertex(0,0);
    }

    public Node(String text, Vertex vertex){
        _text = text;
        _vertex = vertex;
    }

    public Node(String text, Vertex vertex, int color){
        _text = text;
        _vertex = vertex;
        _color = color;
    }

    public void setColor(int color){
        _color = color;
    }

    public int getColor(){
        return _color;
    }

    public void setText(String text){
        _text = text;
    }

    public String getText(){
        return _text;
    }

    public void setPosition(Vertex vertex){
        _vertex = vertex;
    }

    public void setPosition(int x, int y){
        _vertex.setX(x);
        _vertex.setY(y);
    }

    public Vertex getPosition(){
        return _vertex;
    }

    public int getPositionX(){
        return _vertex.getPositionX();
    }

    public int getPositionY(){
        return _vertex.getPositionY();
    }

    public void setValue(int value){
        _value = value;
    }

    public int getValue(){
        return _value;
    }
}

