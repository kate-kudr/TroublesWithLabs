package com.lab01;

import java.util.Scanner;

public class Task5 {
    public void task5() {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int mult = 1;

        for (int i = 1; i < len + 1; i++)
            mult *= i;

        System.out.println(mult);
    }
}
