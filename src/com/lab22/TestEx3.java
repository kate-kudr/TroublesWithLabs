package com.lab22;

import java.util.Scanner;

public class TestEx3 {
    public static void main(String[] args) {
        Task task = new Task();
        Scanner scanner = new Scanner(System.in);
        System.out.println("surname: ");
        String fio = scanner.nextLine();
        System.out.println(fio);
        task.getStart();
        task.getFinish();
    }
}
