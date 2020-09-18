package com.lab5;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        center.y++;
    }

    @Override
    public void moveDown() {
        center.y--;
    }

    @Override
    public void moveLeft() {
        center.x--;
    }

    @Override
    public void moveRight() {
        center.x++;
    }
}
