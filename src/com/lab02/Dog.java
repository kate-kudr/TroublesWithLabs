package com.lab02;

import java.util.Scanner;

public class Dog {
    private int age;
    private String name;
    Scanner obj = new Scanner(System.in);
    public Dog() {
        this.age = obj.nextInt();
        this.name = obj.nextLine();
    }

    public Dog(int age) {
        this.name="None";
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void intoHumanAge(){
        System.out.println("Age in human years is "+age*7);
    }
}
