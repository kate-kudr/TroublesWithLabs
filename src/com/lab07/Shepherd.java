package com.lab07;

public class Shepherd extends Dog {
    public Shepherd(String name, String color, String hair, int age) {
        super(name, color, hair, age);
    }
    public void findIt(){
        bark();
        System.out.println(name + " found the bomb!");
    }
}
