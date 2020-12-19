package com.lab02;

public class BallTest {
    public void test() {
        Ball b1 = new Ball();
        Ball b2 = new Ball(3, 340);
        b1.setSize(4);
        b1.setWeight(400);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
