package com.lab8;

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
}
