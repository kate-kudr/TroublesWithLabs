package com.lab11;

import javax.swing.*;
import java.awt.*;

public class Text extends JFrame {
    public Text(String title) {
        setTitle(title);
        PanelForText panelForText = new PanelForText();
        Container container = getContentPane();
        container.add(panelForText.jTextArea);
        setBounds(200, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(panelForText.jMenuBar);
    }

    public static void main(String[] args) {
        Text text = new Text("TextAndMenu");
        text.setVisible(true);
    }
}
