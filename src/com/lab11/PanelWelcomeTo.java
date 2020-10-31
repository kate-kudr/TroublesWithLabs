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
        p1.addMouseListener(new MyMouse());
        p2.addMouseListener(new MyMouse());
        p3.addMouseListener(new MyMouse());
        p4.addMouseListener(new MyMouse());
        p5.addMouseListener(new MyMouse());
    }

    private class MyMouse extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseEntered(e);
            if (p1.getHeight()>e.getYOnScreen())
                JOptionPane.showMessageDialog(null, "Welcome to North!");
            if (p1.getHeight()+p5.getHeight() < e.getYOnScreen())
                JOptionPane.showMessageDialog(null, "Welcome to South!");
            if (p4.getWidth()+p5.getWidth()<e.getXOnScreen()&&
                    p1.getHeight()<e.getYOnScreen()&&
                    p1.getHeight()+p3.getHeight()>e.getYOnScreen())
                JOptionPane.showMessageDialog(null, "Welcome to East!");
            if (p4.getWidth()>e.getXOnScreen()&&
                    p1.getHeight()<e.getYOnScreen()&&
                    p1.getHeight()+p3.getHeight()>e.getYOnScreen())
                JOptionPane.showMessageDialog(null, "Welcome to West!");
            if(p4.getWidth()<e.getXOnScreen()&&
                    p4.getWidth()+p5.getWidth()>e.getXOnScreen()&&
                    p1.getHeight()<e.getYOnScreen()&&
                    p1.getHeight()+p3.getHeight()>e.getYOnScreen())
                JOptionPane.showMessageDialog(null, "Welcome to Center!");
        }
    }
}
