package com.lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class MyPanel extends JPanel {
    Circle circle = new Circle();
    Square square = new Square();
    Rectangle rectangle = new Rectangle();
    Random rand = new Random();

    public void paintComponent(Graphics gr) {
        for (int i = 0; i < 20; i++)
            switch ((int) (Math.random() * 3)) {
                case 0: {
                    circle.setX();
                    circle.setY();
                    circle.setRadius();
                    gr.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
                    gr.drawOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
                    break;
                }
                case 1: {
                    square.setX();
                    square.setY();
                    square.setSide();
                    gr.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
                    gr.drawRect(square.getX(), square.getY(), square.getSide(), square.getSide());
                    break;
                }
                case 2: {
                    rectangle.setX();
                    rectangle.setY();
                    rectangle.setWidth();
                    rectangle.setLength();
                    gr.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
                    gr.drawRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getLength());
                    break;
                }
            }
    }
}
