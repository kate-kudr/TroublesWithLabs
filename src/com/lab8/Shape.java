package com.lab8;

import java.awt.*;

public abstract class Shape {
    protected int x, y;
    Color randColor;
    public Shape() {
    }

    public int getX() {
        return x;
    }

    public void setX() {
        this.x = (int)(Math.random()*1000);
    }

    public int getY() {
        return y;
    }

    public void setY() {
        this.y = (int)(Math.random()*600);
    }

}
