package com.lab07;

public class DogTest {
    public static void main(String[] args) {
        Corgi corgi = new Corgi("Richard", "red", "short", 2);
        Pug pug = new Pug("Chappy", "cream", "short", 1);
        Shepherd shepherd = new Shepherd("Rex", "brown", "long", 4);
        System.out.println(corgi);
        corgi.sit();
        System.out.println(pug);
        pug.bark();
        System.out.println(shepherd);
        shepherd.down();
        shepherd.findIt();
    }
}
