package com.lab11;

import javax.swing.*;

public class GuesserMain {
    public static void main(String[] args) {
        GuesserGame game = new GuesserGame("Guess the num!");
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
