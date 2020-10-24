package com.lab8;

public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = (int)(Math.random()*300);
    }

}
