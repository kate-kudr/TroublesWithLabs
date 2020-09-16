package com.lab3;

public class Leg {
    private String color;
    private int quantity;

    public Leg(String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
