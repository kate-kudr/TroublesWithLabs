package com.lab7;

public class Pan extends Dish{

    public Pan(double volume, double radius, String color, String material, String filled, boolean washed) {
        super(volume, radius, color, material, filled, washed);
    }

    @Override
    public void fill() {
        if(filled=="not filled")
            System.out.println("There's nothing in the pan");
        else
        System.out.println(filled + " in the pan. Cook!");
        washed=false;
    }

    @Override
    public String toString() {
        return "Pan"+super.toString();
    }
}
