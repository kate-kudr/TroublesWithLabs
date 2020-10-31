package com.lab8_9;

import java.awt.*;

public class Square extends Shape{
    private int side;

    public Square() {
    }

    public int getSide() {
        return side;
    }

    public void setSide() {
        this.side = (int)(Math.random()*300);
    }

    public void paintComponents(Graphics gr){
        gr.setColor(randColor);
        gr.drawRect(getX(), getY(), getSide(), getSide());
    }
}
