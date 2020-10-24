package com.lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Objects;

public class GuesserGame extends JFrame {
    private final static short numberThatMustNotBeNamed = (short) (Math.random() * 20);
    private final JTextField input = new JTextField("Input the number");
    private final JButton resButton = new JButton("Check the number");
    private static short count = 0;
    private static boolean winner = false;
    private static String greater;

    public GuesserGame(String title) {
        super(title);

        int x = 130, y = 125;
        final int side = 50, gap = 30;

        Font font = new Font("Serif", Font.PLAIN, 25);
        JFrame container = new JFrame(title);

        input.setHorizontalAlignment(JTextField.CENTER);
        input.setBounds(x - gap, y - side - gap - 15, 2 * side + 3 * gap, side);
        input.setFont(font);


        resButton.setHorizontalAlignment(JTextField.CENTER);
        resButton.setBounds(x - 2 * gap + 6, y - gap + 10, 3 * gap + 3 * side, side);
        resButton.addActionListener(new MyAction());
        resButton.setFont(font);

        container.add(resButton);
        container.add(input);

        input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent event) {
                input.setText("");
            }

            @Override
            public void focusLost(FocusEvent event) {
                if (Objects.equals(input.getText(), ""))
                    input.setText("Input the number");
            }
        });

        container.setLayout(null);
        container.setVisible(true);
        container.setBounds(770, 170, 400, 225);
        container.setResizable(false);
    }

    class MyAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            try {
                if (Integer.parseInt(input.getText()) == numberThatMustNotBeNamed)
                    winner = true;
                else count++;
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null,
                        "Incorrect input",
                        "Output", JOptionPane.PLAIN_MESSAGE);
            }

            if (count == 3) {
                JOptionPane.showMessageDialog(null,
                        "You have lost! :c"
                                + "\nThe num you were trying to guess is: "
                                + numberThatMustNotBeNamed,
                        "Output", JOptionPane.PLAIN_MESSAGE);
                System.exit(1);
            }

            if (winner) {
                JOptionPane.showMessageDialog(null,
                        "You won! :D",
                        "Output", JOptionPane.PLAIN_MESSAGE);
                System.exit(1);
            } else {
                if (Integer.parseInt(input.getText()) > numberThatMustNotBeNamed)
                    greater = "greater";
                else greater = "less";

                JOptionPane.showMessageDialog(null,
                        "The number is incorrect\n"
                                + "Your num is " + greater + " than the guessing one.",
                        "Output", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}