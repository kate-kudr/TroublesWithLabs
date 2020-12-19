package com.lab04;

//на диаграмме странное наследование Square от Rectangle
//при таком наследовании возможно поведение квадрата у прямоугольника
//в классе Square по факту объявлено 3 одинаковых сеттера
//по этим причинам Square наследуется от Shape

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "} " + super.toString();
    }
}
