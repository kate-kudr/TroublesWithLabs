package com.lab10;

import java.util.Scanner;

public class Task15 {
    private void recursion(int n) {
        if (n == 0)
            return;
        System.out.print(n % 10 + " ");
        recursion(n / 10);
    }

    public static void main(String[] args) {
        Task15 task15 = new Task15();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        task15.recursion(n);
    }
}
