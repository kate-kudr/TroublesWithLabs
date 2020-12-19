package com.lab15;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(6);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Add:");
            String s = in.next();
            list.add(s);
        }

        list.add(2, "Hello");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);

        System.out.println("First list: " + list + "\n");
        System.out.println("Second list with addAll: " + list2 + "\n");

        ArrayList<String> copyOfList = (ArrayList<String>) list.clone();
        list.clear();
        System.out.println("Copy of list: " + copyOfList + "\n");

        System.out.println("Is \"Hello\" in the list: " + list2.contains("Hello") + "\n");

        System.out.println("Input for each: ");
        for (String s : copyOfList) {
            System.out.println(s);
        }

        System.out.println("Third item: " + list2.get(2) + "\n");
        System.out.println("Is list empty? " + list.isEmpty() + "\n");
        list2.remove(2);
        System.out.println("List after deleting 3 item: " + list2 + "\n");
        list2.remove("Hello");
        System.out.println("List after deleting \"Hello\" " + list2 + "\n");
        System.out.println("List size: " + copyOfList.size() + "\n");

        String[] array = new String[copyOfList.size()];
        copyOfList.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
