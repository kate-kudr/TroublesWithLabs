package com.lab07;

public class DishTest {
    public static void main(String[] args) {
        Pan pan = new Pan(3,24.0, "grey", "steel", "pasta", true);
        Plate plate = new Plate(0.5, 15, "white", "glass", "not filled", false);
        Cup cup = new Cup(0.3, 4, "rose", "ceramic", "Coffee", true);
        System.out.println(pan);
        pan.breakTheDish();
        System.out.println(plate);
        plate.fill();
        plate.dishWasher();
        plate.setFilled("Lasagne");
        plate.fill();
        System.out.println(cup);
        cup.fill();
        cup.dishWasher();
        cup.breakTheDish();
    }
}
