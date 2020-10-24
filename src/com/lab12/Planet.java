package com.lab12;

import java.text.DecimalFormat;

public enum Planet {
    MERCURY(3.33 * Math.pow(10, 23), 2_420_000, "Mercury"),
    VENUS(4.87 * Math.pow(10, 24), 6_051_000, "Venus"),
    EARTH(6 * Math.pow(10, 24), 6_371_000, "Earth"),
    MARS(6.42 * Math.pow(10, 23), 3_400_000, "Mars"),
    JUPITER(1.9 * Math.pow(10, 27), 70_000_000, "Jupiter"),
    SATURN(5.7 * Math.pow(10, 26), 58_000_000, "Saturn"),
    URANUS(8.7 * Math.pow(10, 25), 25_350_000, "Uranus"),
    NEPTUNE(1 * Math.pow(10, 26), 24_600_000, "Neptune");

    private final double mass, radius;
    private final String name;
    private static final double G = 6.67 * Math.pow(10, -11);


    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    Planet(double mass, double radius, String name) {
        this.radius = radius;
        this.mass = mass;
        this.name = name;
    }

    public String getGravity() {
        double gr;
        String gravity;
        gr = G * this.mass / Math.pow(this.radius, 2);
        gravity = new DecimalFormat("#.####").format(gr);
        return gravity;
    }

    @Override
    public String toString() {
        return this.name
                + "`s gravity force is "
                + getGravity();
    }
}

