package com.lab8;

public class Rectangle extends Shape{
    private int width, length;

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth() {
        this.width = (int)(Math.random()*300);
    }

    public int getLength() {
        return length;
    }

    public void setLength() {
        this.length = (int)(Math.random()*300);
    }
}
