package com.lab03;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(1836, "Pushkin", "The captain's daughter");
        book1.setYear(1839);
        book1.setAuthor("Lermontov");
        book1.setTitle("A hero of our time");
        System.out.println(book1);
        System.out.println(book2);
    }
}
