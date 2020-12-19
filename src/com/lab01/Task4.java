package com.lab01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void mathRand() {
        int quantity;
        quantity = 2 + (int) (Math.random() * 15);

        int[] arr = new int[quantity];

        for (short i = 0; i < quantity; i++) {
            arr[i] = -100 + (int) (Math.random() * 200);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n");

        Arrays.sort(arr);

        for (short i = 0; i < quantity; i++)
            System.out.print(arr[i] + " ");
    }

    public static void rand() {
        Random random = new Random();

        int num = random.nextInt(15 + 1);

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = random.nextInt(200) - 100;
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n");

        Arrays.sort(arr);

        for (short i = 0; i < num; i++)
            System.out.print(arr[i] + " ");
    }

    public void task4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the sort method:\n1 - Math.random\n2 - Random\n");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                mathRand();
                break;
            case 2:
                rand();
                break;
        }
    }
}
