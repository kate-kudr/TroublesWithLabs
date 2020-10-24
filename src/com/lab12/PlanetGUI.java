package com.lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanetGUI extends JFrame {
    private final JButton Mercury = new JButton(Planet.MERCURY.getName());
    private final JButton Ven = new JButton(Planet.VENUS.getName());
    private final JButton Earth = new JButton(Planet.EARTH.getName());
    private final JButton Mars = new JButton(Planet.MARS.getName());
    private final JButton Jup = new JButton(Planet.JUPITER.getName());
    private final JButton Sat = new JButton(Planet.SATURN.getName());
    private final JButton Ur = new JButton(Planet.URANUS.getName());
    private final JButton Nep = new JButton(Planet.NEPTUNE.getName());

    public PlanetGUI(String title) {
        super(title);
        this.setBounds(770, 170, 400, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 2, 0, 0));

        container.add(Mercury);
        container.add(Ven);
        container.add(Earth);
        container.add(Mars);
        container.add(Jup);
        container.add(Sat);
        container.add(Ur);
        container.add(Nep);

        Mercury.addActionListener(new ButtonListener());
        Ven.addActionListener(new ButtonListener());
        Earth.addActionListener(new ButtonListener());
        Mars.addActionListener(new ButtonListener());
        Jup.addActionListener(new ButtonListener());
        Sat.addActionListener(new ButtonListener());
        Ur.addActionListener(new ButtonListener());
        Nep.addActionListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {
        Planet planet;

        @Override
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();

            if (source == Mercury)
                planet = Planet.MERCURY;
            if (source == Ven)
                planet = Planet.VENUS;
            if (source == Earth)
                planet = Planet.EARTH;
            if (source == Mars)
                planet = Planet.MARS;
            if (source == Jup)
                planet = Planet.JUPITER;
            if (source == Sat)
                planet = Planet.SATURN;
            if (source == Ur)
                planet = Planet.URANUS;
            if (source == Nep)
                planet = Planet.NEPTUNE;

            JOptionPane.showMessageDialog(null, planet,
                    "Gravity force", JOptionPane.PLAIN_MESSAGE);
        }
    }
}