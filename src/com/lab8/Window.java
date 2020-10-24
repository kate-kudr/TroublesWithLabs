package com.lab8;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        MyPanel mp = new MyPanel();
        Container cont = getContentPane();
        cont.add(mp);
        setBounds(0, 0, 1800, 1000);
        setTitle("RandomShapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Window window = new Window();
        window.setVisible(true);
    }
}