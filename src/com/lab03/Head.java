package com.lab03;

public class Head {
    private String color, eyesColor, hairColor;

    public Head() {
    }

    public Head(String color, String eyesColor, String hairColor) {
        this.color = color;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "color='" + color + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
