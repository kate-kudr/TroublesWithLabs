package com.lab03;

public class Human {
    private String name, surname;
    private int age;
    private Hand hand;
    private Head head;
    private Leg leg;

    public Human() {}

    public Human(String name, String surname, int age, Hand hand, Head head, Leg leg) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "}\n" + hand +
                "\n" + head +
                "\n" + leg;
    }
}