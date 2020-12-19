package com.lab22;

import java.util.Scanner;

public class TestEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date(scanner.nextLine());
        System.out.println(date.toString());
        Calendar calendar = new Calendar(scanner.nextLine());
        System.out.println(calendar.toString());
    }
}
