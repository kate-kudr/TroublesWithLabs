package com.lab07;

public class Plate extends Dish {

    public Plate(double volume, double radius, String color, String material, String filled, boolean washed) {
        super(volume, radius, color, material, filled, washed);
    }

    @Override
    public void fill() {
        if (filled == "not filled")
            System.out.println("There's nothing in the plate");
        else
            System.out.println(filled + " in the plate. Eat!");
        washed = false;
    }

    @Override
    public String toString() {
        return "Plate" + super.toString();
    }
}
