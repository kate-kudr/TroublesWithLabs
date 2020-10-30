package com.lab8_9;

public class Main {
    public static void main(String[] args) {
        Picture picture = new Picture(args[0]);
        picture.setVisible(true);
        Animation animation = new Animation();
        animation.setVisible(true);
    }
}
