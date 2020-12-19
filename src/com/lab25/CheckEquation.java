package com.lab25;

import java.util.Scanner;

public class CheckEquation {
    public static void main(String[] args) {
        System.out.println(checkEquation());
    }

    private static String checkEquation() {
        String equation = new Scanner(System.in).nextLine();
        int counter = 0;

        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '(')
                counter++;
            else if (equation.charAt(i) == ')')
                counter--;
            if (counter < 0)
                return "You should better check if brackets are correct";
        }
        if (counter == 0) return equation + " is correct";

        return "You should better check if brackets are correct";
    }
}