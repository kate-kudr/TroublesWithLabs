package com.lab8_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyPanel extends JPanel {
    private final Circle circle = new Circle();
    private final Square square = new Square();
    private final Rectangle rectangle = new Rectangle();
    private static final Shape[] arr = new Shape[20];
    public MyPanel() {
        Button button = new Button("Добавить фигуру");
        add(button);
        button.addActionListener(new MyPanel.ButtonListener());
    }
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MyPanel myPanel = new MyPanel();
            myPanel.randomShape((int) (Math.random() * 3)).paintComponents(getGraphics());
        }
    }

    public void paintComponent(Graphics gr) {
        for (int i = 0; i < 20; i++) {
            arr[i] = randomShape((int) (Math.random() * 3));
            arr[i].paintComponents(gr);
        }
//        class ButtonListener implements ActionListener {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                MyPanel myPanel = new MyPanel();
//                randomShape((int) (Math.random() * 3)).paintComponents(gr);
//            }
//        }
    }

    public Shape randomShape(int rand) {
        if (rand == 0) {
            circle.setX();
            circle.setY();
            circle.setRadius();
            return circle;
        } else if (rand == 1) {
            square.setX();
            square.setY();
            square.setSide();
            return square;
        } else {
            rectangle.setX();
            rectangle.setY();
            rectangle.setWidth();
            rectangle.setLength();
            return rectangle;
        }
    }
}
