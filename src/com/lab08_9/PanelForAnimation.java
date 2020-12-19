package com.lab08_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

public class PanelForAnimation extends JPanel {
    private int counter;
    private final ArrayList<String> path = new ArrayList<>();
    private String s;

    public PanelForAnimation() {
        for (int i = 1; i < 9; i++) {
            path.add("D:\\" + i + ".jpg");
        }
        counter = 0;
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }

    public void update() {
        counter++;
        if (counter >= path.size()) {
            counter = 0;
        }
        s = path.get(counter);
    }

    public void paintComponent(Graphics gr) {
        gr.drawImage(new ImageIcon(s).getImage(), 0, 0, null);
        update();
    }
}
