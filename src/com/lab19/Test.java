package com.lab19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws MyException{
        Client client = new Client("Ivanov Ivan Ivanovich", "123456789012");
        Matcher matcher = Pattern.compile("^\\d{12}$").matcher(client.getTIN());
        if (!matcher.find()) throw new MyException(true);
    }
}
