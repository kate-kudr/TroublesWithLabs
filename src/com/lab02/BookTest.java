package com.lab02;

public class BookTest {
    public void test(){
        Book b1 = new Book();
        Book b2 = new Book(400, "Harry Potter and Goblet of Fire");
        b1.setStr(150);
        b1.setTitle("The Little Prince");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
