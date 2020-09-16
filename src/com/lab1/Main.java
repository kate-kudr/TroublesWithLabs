package com.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - sum of array elements\n" +
                "2 - command line argument\n" +
                "3 - harmonic series\n" +
                "4 - Random and MathRandom\n" +
                "5 - factorial\n" +
                "0 - exit");
        int choice;
        Scanner obj = new Scanner(System.in);
        choice = obj.nextInt();
        while (choice!=0) {
            switch (choice) {
                case 1: {
                    System.out.println("Testing Task1");
                    Task1 test1 = new Task1();
                    test1.task1();
                    break;
                }
                case 2: {
                    System.out.println("Testing Task2");
                    Task2 test2 = new Task2();
                    test2.task2(args);
                    break;
                }
                case 3: {
                    System.out.println("Testing Task3");
                    Task3 test3 = new Task3();
                    test3.task3();
                    break;
                }
                case 4: {
                    System.out.println("Testing Task4");
                    Task4 test4 = new Task4();
                    test4.task4();
                    break;
                }
                case 5: {
                    System.out.println("Testing Task5");
                    Task5 test5 = new Task5();
                    test5.task5();
                    break;
                }
            }
            choice = obj.nextInt();
        }
    }
}
