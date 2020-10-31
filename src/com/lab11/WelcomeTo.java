package com.lab11;

import javax.swing.*;
import java.awt.*;

public class WelcomeTo extends JFrame {
    public WelcomeTo(String title) {
        PanelWelcomeTo panelWelcomeTo = new PanelWelcomeTo();
        panelWelcomeTo.setLayout(new BorderLayout());
        Container container = getContentPane();
        container.add(panelWelcomeTo);
        container.add(panelWelcomeTo.p1, BorderLayout.NORTH);
        container.add(panelWelcomeTo.p2, BorderLayout.SOUTH);
        container.add(panelWelcomeTo.p3, BorderLayout.EAST);
        container.add(panelWelcomeTo.p4, BorderLayout.WEST);
        container.add(panelWelcomeTo.p5, BorderLayout.CENTER);
        panelWelcomeTo.p1.setBackground(Color.RED);
        panelWelcomeTo.p1.setPreferredSize(new Dimension(100, 100));
        panelWelcomeTo.p2.setBackground(Color.GREEN);
        panelWelcomeTo.p2.setPreferredSize(new Dimension(100, 100));
        panelWelcomeTo.p3.setBackground(Color.BLUE);
        panelWelcomeTo.p3.setPreferredSize(new Dimension(100, 100));
        panelWelcomeTo.p4.setBackground(Color.YELLOW);
        panelWelcomeTo.p4.setPreferredSize(new Dimension(100, 100));
        panelWelcomeTo.p5.setBackground(Color.GRAY);
        panelWelcomeTo.p5.setPreferredSize(new Dimension(100, 100));
        setBounds(0, 0, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        WelcomeTo welcomeTo = new WelcomeTo("WelcomeTo");
        welcomeTo.setVisible(true);
    }
}
