package com.lab7;

public class Cup extends Dish {

    public Cup(double volume, double radius, String color, String material, String filled, boolean washed) {
        super(volume, radius, color, material, filled, washed);
    }

    @Override
    public void fill() {
        if (filled == "not filled")
            System.out.println("There's nothing in the cup");
        else
            System.out.println(filled + " in the cup. Drink!");
        washed = false;
    }

    @Override
    public String toString() {
        return "Cup" + super.toString();
    }
}
