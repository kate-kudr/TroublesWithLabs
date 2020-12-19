package com.lab15;

import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Add:");
            String s = in.next();
            linkedlist.add(s);
        }
        linkedlist.add(2, "Hello");
        System.out.println(linkedlist + "\n");

        System.out.println("Index \"Hello\": " + linkedlist.indexOf("Hello") + "\n");
        System.out.println("Is \"Hello\" in the list: " + linkedlist.contains("Hello") + "\n");
        System.out.println("List size: " + linkedlist.size() + "\n");

        linkedlist.remove("Hello");
        System.out.println(linkedlist + "\n");

        linkedlist.addLast("Hi");
        linkedlist.addFirst("Hi");
        System.out.println(linkedlist + "\n");

        System.out.println("First item: " + linkedlist.peekFirst());
        System.out.println("Last item: " + linkedlist.peekLast() + "\n");

        System.out.println(linkedlist.pollFirst());
        System.out.println(linkedlist.pollLast());
        System.out.println(linkedlist);
    }
}
