package com.lab02;

public class ShapeTest {
    public void test() {
        Shape sh1 = new Shape();
        Shape sh2 = new Shape("Triangle");
        sh1.setName("Square");
        System.out.println(sh1.toString());
        System.out.println(sh2.toString());
    }
}
