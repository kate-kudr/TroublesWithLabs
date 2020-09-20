package com.lab7;

public class Chair extends Furniture{
    private boolean chairBack;

    public Chair(String material, String color, double height, boolean condition, boolean build, boolean chairBack) {
        super(material, color, height, condition, build);
        this.chairBack = chairBack;
    }

    @Override
    public void setPrice(double height) {
        if (height < 40)
            price = 1000;
        else if (height > 100)
            price = 3000;
        else price = 2000;
        if(chairBack)
            price+=500;
    }

    @Override
    public String toString() {
        return "Chair" + super.toString() +
                ", chairBack=" + chairBack +
                '}';
    }
}
