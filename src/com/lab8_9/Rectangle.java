package com.lab8_9;

import java.awt.*;

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

    public void paintComponents(Graphics gr){
        gr.setColor(randColor);
        gr.drawRect(getX(), getY(), getWidth(), getLength());
    }
}
