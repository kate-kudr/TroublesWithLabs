package com.lab25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIP {
    public static void main(String[] args) {
        System.out.println(checkIP());
    }

    private static String checkIP() {
        Matcher matcher = Pattern
                .compile("^(((\\d|[1-9]\\d|1\\d{2}|2[0-5]{2}|2[0-4]\\d)\\.){3}" +
                        "((\\d|[1-9]\\d|1\\d{2}|2[0-5]{2}|2[0-4]\\d)))$")
                .matcher(new Scanner(System.in).nextLine());

        if (matcher.find())
            return matcher.group();

        return "IP is incorrect";
    }
}
