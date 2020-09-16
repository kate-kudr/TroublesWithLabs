package com.lab3;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(4, "red");
        c1.setRadius(6);
        c1.setColor("green");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
