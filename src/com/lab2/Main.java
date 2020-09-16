package com.lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - Shape\n" +
                "2 - Ball\n" +
                "3 - Book\n" +
                "4 - Dog\n" +
                "5 - DogKennel\n" +
                "0 - exit\n");
        int choice;
        Scanner obj = new Scanner(System.in);
        choice = obj.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1: {
                    System.out.println("Testing class Shape");
                    ShapeTest shtest = new ShapeTest();
                    shtest.test();
                    break;
                }
                case 2: {
                    System.out.println("Testing class Ball");
                    BallTest btest = new BallTest();
                    btest.test();
                    break;
                }
                case 3: {
                    System.out.println("Testing class Book");
                    BookTest booktest = new BookTest();
                    booktest.test();
                    break;
                }
                case 4: {
                    System.out.println("Testing class Dog");
                    DogTest dtest = new DogTest();
                    dtest.test();
                    break;
                }
                case 5: {
                    System.out.println("Testing class DogKennel");
                    DogKennel dktest = new DogKennel();
                    dktest.test();
                    break;
                }
            }
            choice = obj.nextInt();
        }
    }
}