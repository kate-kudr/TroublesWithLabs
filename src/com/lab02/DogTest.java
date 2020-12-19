package com.lab02;

public class DogTest {
    public void test(){
        Dog d1 = new Dog(0);
        Dog d2 = new Dog(3, "Belka");
        d1.setAge(1);
        d1.setName("Strelka");
        System.out.println(d1.toString());
        d1.intoHumanAge();
        System.out.println(d2.toString());
        d2.intoHumanAge();
    }
}