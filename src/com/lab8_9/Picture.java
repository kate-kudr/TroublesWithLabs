package com.lab8_9;

import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame {
    public Picture(String fileName) {
        PanelForPicture mp = new PanelForPicture(fileName);
        Container cont = getContentPane();
        cont.add(mp);
        setBounds(0, 0, 1800, 1000);
        setTitle("Picture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
