package com.lab6;

import com.lab5.Movable;
import com.lab5.MovablePoint;

public class MovableRectangle extends Rectangle implements Movable {
    protected int x, y, xSpeed, ySpeed;
    private final MovablePoint a = new MovablePoint(x, y, xSpeed, ySpeed);
    private final MovablePoint b = new MovablePoint(x, y, xSpeed, ySpeed);

    public boolean speedometer(MovablePoint a, MovablePoint b){
        if (a.getxSpeed()==b.getySpeed())
            return true;
        else return false;
    }

    @Override
    public void moveUp() {
        if(speedometer(a, b)){
            a.moveUp();
            b.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if(speedometer(a, b)){
            a.moveDown();
            b.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if(speedometer(a, b)){
            a.moveLeft();
            b.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if(speedometer(a, b)){
            a.moveRight();
            b.moveRight();
        }
    }
}
