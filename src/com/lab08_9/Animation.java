package com.lab08_9;

import javax.swing.*;
import java.awt.*;

public class Animation extends JFrame{
    public Animation (){
        PanelForAnimation np = new PanelForAnimation();
        Container cont = getContentPane();
        cont.add(np);
        setBounds(0, 0, 150, 250);
        setTitle("Picture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
