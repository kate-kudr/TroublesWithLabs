package com.lab24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        testPersonAndAddress();

        testShirts();

        testNumber();

        testWordProcessing();
    }

    /**
     * Testing word replacement in designed order
     */
    private static void testWordProcessing() {
        StringBuilder stringBuilder;
        String fileName = new Scanner(System.in).nextLine();

        try (BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
            List<String> list = Arrays.stream(bf.readLine().split(" ")).collect(Collectors.toList());
            while (list.size() != 0) {
                System.out.println(list);
                stringBuilder = getLine(list);
                System.out.println(stringBuilder.toString());
                list = Arrays.stream(bf.readLine().split(" ")).collect(Collectors.toList());
            }
        } catch (IOException ex) {
            System.out.println("An error occurred");
        } catch (NullPointerException nPtr) {
            System.exit(1);
        }
    }

    /**
     * Assistant function for a testWordProcessing
     * @param line List<></>
     * @return StringBuilder
     */
    public static StringBuilder getLine(List<String> line) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> words;

        if (line == null || line.size() == 0)
            return stringBuilder;
        else words = line;

        stringBuilder.append(words.get(0));

        for (int j = 0; j < words.size(); j++) {
            for (int i = 1; i < words.size(); i++) {
                String buffString = words.get(i);

                if (buffString.length() == 0) continue;

                if (stringBuilder.toString().toLowerCase().charAt(0) == buffString.toLowerCase().charAt(buffString.length() - 1)) {
                    stringBuilder.insert(0, words.get(i) + " ");
                    words.set(i, "");
                } else if (stringBuilder.toString().toLowerCase().charAt(stringBuilder.length() - 1) == buffString.toLowerCase().charAt(0)) {
                    stringBuilder.append(" ").append(buffString);
                    words.set(i, "");
                }
            }
        }
        return stringBuilder;
    }

    /**
     * Testing number formatting
     */
    private static void testNumber() {
        Number number = new Number();
        System.out.println(number.getStringNumber("+109175655655"));
        System.out.println(number.getStringNumber("+8999175655655"));
        System.out.println(number.getStringNumber("89175655655"));
    }

    /**
     * Testing filling shirt list
     */
    private static void testShirts() {
        String[] shirts = new String[11];
        List<Shirt> shirtList = new ArrayList<>();

        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        for (String shirt : shirts) {
            shirtList.add(new Shirt().makeShirtOutOfString(shirt));
        }

        System.out.println(shirtList);
    }

    /**
     * Testing return of Person`s stats such as Surname N.S. and it`s address
     */
    private static void testPersonAndAddress() {
        System.out.println("You better choose Tokenizer on the first and second example");

        Person person = new Person("Ivanov", "Ivan", "Ivanovich");
        person.setAddress("Russia; Moscow; Moscow; Molodejnaya_street, 2b, 6, 66");
        System.out.println(person);

        person = new Person("Petrov", "Petr");
        person.setAddress("Russia, Moscow, Moscow, Vernadskiy_propect, 7, 4, -");
        System.out.println(person);

        person = new Person("White House");
        person.setAddress("USA, Columbia, Washington_DC, Pennsylvania_Avenue_NW, 1600, -, -");
        System.out.println(person);

        person = new Person("Sydney", "Opera", "House");
        person.setAddress("Australia, Sydney, New_West_Wales, Circular_Quay_East, 2, -, -");
        System.out.println(person);
    }
}