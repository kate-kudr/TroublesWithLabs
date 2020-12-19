package com.lab06;

import com.lab05.Movable;
import com.lab05.MovablePoint;

public class MovableRectangle extends Rectangle implements Movable {
    protected int x, y, xSpeed, ySpeed;
    private MovablePoint a;
    private MovablePoint b;

    public MovableRectangle() {
        this.a = new MovablePoint(x, y, xSpeed, ySpeed);
        this.b = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableRectangle(double width, double length, int x, int y, int xSpeed, int ySpeed) {
        super(width, length);
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
            this.a = new MovablePoint(x, y, xSpeed, ySpeed);
            this.b = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableRectangle(MovablePoint a, MovablePoint b) {
        if(!speedometer(a,b)) {
            throw new IllegalArgumentException("bad speed");
        }
        this.a = a;
        this.b = b;
    }

    public boolean speedometer(MovablePoint a, MovablePoint b) {
        if (a.getxSpeed() == b.getxSpeed() && a.getySpeed() == b.getySpeed())
            return true;
        else return false;
    }

    @Override
    public void moveUp() {
        a.moveUp();
        b.moveUp();
    }

    @Override
    public void moveDown() {
        a.moveDown();
        b.moveDown();
    }

    @Override
    public void moveLeft() {
        a.moveLeft();
        b.moveLeft();
    }

    @Override
    public void moveRight() {
        a.moveRight();
        b.moveRight();
    }

    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(10, 20, 1, 2, 20, 10);
        System.out.println(movableRectangle);
        System.out.println(movableRectangle.a);
        System.out.println(movableRectangle.b);
    }
}
