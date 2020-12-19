package com.lab07;

public abstract class Furniture {
    protected String material, color;
    protected double height, price;
    protected boolean condition, build;

    public Furniture(String material, String color, double height, boolean condition, boolean build) {
        this.material = material;
        this.color = color;
        this.height = height;
        this.condition = condition;
        this.build = build;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice(double height);

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public boolean isBuild() {
        return build;
    }

    public void setBuild(boolean build) {
        this.build = build;
    }

    public void furnitureRepair() {
        if (condition == false) {
            System.out.println("Repairing!");
            condition = true;
        }
        else System.out.println("Doesn't need to be repaired");
    }

    public void furnitureBuild() {
        if (build == false) {
            System.out.println("Building!");
            build = true;
        }
        else System.out.println("It's already built");
    }

    @Override
    public String toString() {
        return "{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", price=" + price +
                ", condition=" + condition +
                ", build=" + build;
    }
}
