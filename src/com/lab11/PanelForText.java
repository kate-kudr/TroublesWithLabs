package com.lab11;

import javax.swing.*;
import java.awt.*;

public class PanelForText extends JPanel {
    JTextArea jTextArea = new JTextArea("Hello world!");
    JMenuBar jMenuBar = new JMenuBar();
    JMenu color = new JMenu("Color");
    JMenu font = new JMenu("Font");

    public PanelForText() {
        jMenuBar.add(color);
        jMenuBar.add(font);

        font.add(new JMenuItem("Times New Roman")).addActionListener(e ->
                jTextArea.setFont(new Font("Times New Roman", Font.BOLD, 20)));
        font.add(new JMenuItem("MS Sans Serif")).addActionListener(e ->
                jTextArea.setFont(new Font("MS Sans Serif", Font.BOLD, 20)));
        font.add(new JMenuItem("Courier New")).addActionListener(e ->
                jTextArea.setFont(new Font("Courier New", Font.BOLD, 20)));;

        color.add(new JMenuItem("Black")).addActionListener(e -> jTextArea.setForeground(Color.BLACK));
        color.add(new JMenuItem("Red")).addActionListener(e -> jTextArea.setForeground(Color.RED));
        color.add(new JMenuItem("Blue")).addActionListener(e -> jTextArea.setForeground(Color.BLUE));

    }
}