package com.lab10;

import java.util.Scanner;

public class Task16 {
    private static Scanner scn = new Scanner(System.in);

    public static int maxCounter(int count, int max) {
        int n = scn.nextInt();
        if (n == 0)
            return count;

        if (n == max)
            count++;

        if (n > max) {
            count = 1;
            max = n;
        }

        return maxCounter(count, max);
    }

    public static void main(String[] args) {
        System.out.println(maxCounter(0, 0));
    }
}