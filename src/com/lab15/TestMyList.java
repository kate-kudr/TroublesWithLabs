package com.lab15;

import com.lab13.Student;

public class TestMyList {
    public static void main(String[] args) {
        MyList myList = new MyList();

        for (int i = 0; i < 9; i++) {
            myList.add(i, new Student());
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        myList.add(9, new Student());
        myList.add(10, new Student());

        System.out.println("\n" + myList.size() + "\n");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        myList.delete(5);
        System.out.println("\n" + myList.size() + "\n");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        myList.reverse();

        System.out.println();
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
