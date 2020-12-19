package com.lab07;

public abstract class Dog {
    protected String name, color, hair;
    protected int age;

    public Dog(String name, String color, String hair, int age) {
        this.name = name;
        this.color = color;
        this.hair = hair;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sit(){
        System.out.println(name + " is sitting");
    }

    public void down(){
        System.out.println(name + " is lying down");
    }

    public void bark(){
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", hair='" + hair + '\'' +
                ", age=" + age +
                '}';
    }
}
