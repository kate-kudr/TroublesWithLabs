package com.lab8_9;

import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = (int)(Math.random()*300);
    }

    public void paintComponents(Graphics gr){
        gr.setColor(randColor);
        gr.drawOval(getX(), getY(), getRadius(), getRadius());
     }
}
