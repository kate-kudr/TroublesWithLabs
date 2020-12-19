package com.lab02;

public class Shape {
    private String name;

    public Shape() {
        this.name = "None";
    }

    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
