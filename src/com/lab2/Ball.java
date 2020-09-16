package com.lab2;

public class Ball {
    private int size, weight;

    public Ball() {
        this.size = 0;
        this.weight = 0;
    }

    public Ball(int size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }
}
