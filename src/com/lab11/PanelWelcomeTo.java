package com.lab11;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelWelcomeTo extends JPanel {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();

    public PanelWelcomeTo() {
        p1.addMouseListener(new MyMouse("Welcome to North!"));
        p2.addMouseListener(new MyMouse("Welcome to South!"));
        p3.addMouseListener(new MyMouse("Welcome to East!"));
        p4.addMouseListener(new MyMouse("Welcome to West!"));
        p5.addMouseListener(new MyMouse("Welcome to Center!"));
    }

    private class MyMouse extends MouseAdapter {
        private final String welcome;
        public MyMouse(String welcome){
            this.welcome = welcome;
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, welcome);
        }
    }
}
