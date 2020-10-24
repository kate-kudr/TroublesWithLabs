package com.lab8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Picture extends JFrame {
    public Picture() {
        JPanel mp = new JPanel();
        Container cont = getContentPane();
        cont.add(mp);
        setBounds(0, 0, 1800, 1000);
        setTitle("Picture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//    Image img;
//Picture picture;
//    public Image getImg() {
//        return img;
//    }
//
//    public void paintComponent(Graphics gr){
//        gr.drawImage(picture.getImg(), 0, 0, null);
//    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.setVisible(true);
       // for (String str : args)
//            try {
                Toolkit.getDefaultToolkit().getImage("TG0tN9BHaXU.jpg");
                //Image img = ImageIO.read(new URL(str));
         //   } catch (IOException e) {}
    }
}