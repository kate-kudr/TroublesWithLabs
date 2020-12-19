package com.lab08_9;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PanelForPicture extends JPanel {
    Image img;
    public PanelForPicture(String fileName){
        try {
            img = ImageIO.read(new File(fileName));
        } catch (IOException e) {System.out.println("NO");}
    }
    public void paintComponent(Graphics gr){
        gr.drawImage(img, 0,0,null);
    }
}
