package com.lab02;

public class Book {
    private int str;
    private String title;

    public Book() {
        this.str=0;
        this.title="None";
    }

    public Book(int str, String title) {
        this.str = str;
        this.title = title;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "str=" + str +
                ", title='" + title + '\'' +
                '}';
    }
}
