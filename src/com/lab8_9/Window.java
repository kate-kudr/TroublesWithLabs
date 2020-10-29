package com.lab8_9;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        MyPanel mp = new MyPanel();
        Container cont = getContentPane();
        cont.add(mp);
        setBounds(0, 0, 900, 500);
        setTitle("RandomShapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Window window = new Window();
        window.setResizable(false);
        window.setVisible(true);
    }
}