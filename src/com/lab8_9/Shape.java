package com.lab8_9;
import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected int x, y;
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randColor = new Color(r, g, b);
    public Shape() {
    }

    public Shape(int x, int y, Color randColor) {
        this.x = x;
        this.y = y;
        this.randColor = randColor;
    }

    public int getX() {
        return x;
    }

    public void setX() {
        this.x = (int)(Math.random()*500);
    }

    public int getY() {
        return y;
    }

    public void setY() {
        this.y = (int)(Math.random()*300);
    }

    abstract void paintComponents(Graphics gr);
}
