package com.lab07;

public class Wardrobe extends Furniture{
    private boolean doors;

    public Wardrobe(String material, String color, double height, boolean condition, boolean build, boolean doors) {
        super(material, color, height, condition, build);
        this.doors = doors;
    }

    @Override
    public void setPrice(double height) {
        if (height < 100)
            price = 2000;
        else if (height > 200)
            price = 10000;
        else price = 5000;
        if(doors)
            price+=1000;
    }

    public void openTheDoor(){
        if(doors)
            System.out.println("You opened the door");
        else System.out.println("No doors!");
    }

    @Override
    public String toString() {
        return "Wardrobe" + super.toString() +
                ", doors=" + doors +
                '}';
    }
}
