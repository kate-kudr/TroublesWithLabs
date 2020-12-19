package com.lab08_9;

import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame {
    public Picture(String fileName) {
        PanelForPicture mp = new PanelForPicture(fileName);
        Container cont = getContentPane();
        cont.add(mp);
        setBounds(151, 0, 900, 1000);
        setTitle("Picture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
