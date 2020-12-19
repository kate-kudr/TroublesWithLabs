package com.lab01;

import java.util.Scanner;

public class Task1 {
    public void task1() {
        System.out.println("1 - for\n2 - while\n3 - do while\n");
        int len, choice, sum = 0, i;
        Scanner obj = new Scanner(System.in);
        choice = obj.nextInt();
        len = obj.nextInt();
        int[] arr = new int[len];
        for (i = 0; i < len; i++)
            arr[i] = obj.nextInt();

        switch (choice) {
            case 1:
                for (i = 0; i < len; i++)
                    sum += arr[i];
                break;
            case 2:
                while (i > 0) {
                    i--;
                    sum += arr[i];
                }
                break;
            case 3:
                do {
                    i--;
                    sum += arr[i];
                }
                while (i > 0);
        }
        System.out.println(sum);
    }
}
