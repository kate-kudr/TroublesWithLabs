package com.lab08_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class MyPanel extends JPanel {
    private static final ArrayList<Shape> arr = new ArrayList<>();

    public MyPanel() {
        Button button = new Button("Добавить фигуру");
        add(button);
        button.addActionListener(new MyPanel.ButtonListener());

        for (int i = 0; i < 20; i++) {
            arr.add(randomShape());
        }

    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arr.add(randomShape());
            repaint();
        }
    }

    public void paintComponent(Graphics gr) {
//        for (int i = 0; i < arr.size(); i++) {
//            arr.get(i).paintComponents(gr);
//        }

        for(Shape shape : arr){
            shape.paintComponents(gr);
        }

//        class ButtonListener implements ActionListener {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                MyPanel myPanel = new MyPanel();
//                randomShape((int) (Math.random() * 3)).paintComponents(gr);
//            }
//        }
    }

    public Shape randomShape() {
        int rand = (int) (Math.random() * 3);
        if (rand == 0) {
            Circle circle = new Circle();
            circle.setX();
            circle.setY();
            circle.setRadius();
            return circle;
        } else if (rand == 1) {
            Square square = new Square();

            square.setX();
            square.setY();
            square.setSide();
            return square;
        } else {
            Rectangle rectangle = new Rectangle();

            rectangle.setX();
            rectangle.setY();
            rectangle.setWidth();
            rectangle.setLength();
            return rectangle;
        }
    }
}
