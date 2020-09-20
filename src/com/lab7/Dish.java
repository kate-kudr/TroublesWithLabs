package com.lab7;

public abstract class Dish {
    protected double volume, radius;
    protected String color, material, filled;
    protected boolean washed;

    public Dish(double volume, double radius, String color, String material, String filled, boolean washed) {
        this.volume = volume;
        this.radius = radius;
        this.color = color;
        this.material = material;
        this.filled = filled;
        this.washed = washed;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public boolean isWashed() {
        return washed;
    }

    public void setWashed(boolean washed) {
        this.washed = washed;
    }

    public void breakTheDish() {
        if (material == "glass" || material == "ceramic")
            System.out.println("Oops!");
        else
            System.out.println("Whew, that was close...");
    }

    public void dishWasher() {
        if (washed)
            System.out.println("It's already washed!");
        else {
            System.out.println("Starting the dishwasher");
            washed = true;
        }
    }

    public abstract void fill();

    @Override
    public String toString() {
        return "{" +
                "volume=" + volume +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", filled='" + filled + '\'' +
                ", washed=" + washed +
                '}';
    }
}
