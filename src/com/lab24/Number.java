package com.lab24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
    private final StringBuilder number = new StringBuilder();

    public Number getStringNumber(String number) {
        Matcher matcher = Pattern.compile("((\\+\\d{1,3})(\\d{3})(\\d{3})(\\d{4}))|((8)(\\d{3})(\\d{3})(\\d{4}))").matcher(number);

        try {
            if (matcher.find()) {
                try {
                    if (matcher.group(6) != null) {
                        this.number.replace(0, this.number.length(),
                                "+" + (Integer.parseInt(matcher.group(7)) - 1) + matcher.group(8));
                        this.number.append('-').append(matcher.group(9))
                                .append('-').append(matcher.group(10));
                    } else throw new NumberFormatException();
                } catch (NumberFormatException nFe) {
                    this.number.replace(0, this.number.length(),
                            matcher.group(2) + matcher.group(3));
                    this.number.append('-').append(matcher.group(4))
                            .append('-').append(matcher.group(5));
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException iAE) {
            System.out.println("An error has occurred");
        }

        return this;
    }

    public String getNumber() {
        return number.toString();
    }

    public void setNumber(String number) {
        this.number.replace(0, this.number.length(), number);
    }

    @Override
    public String toString() {
        return "Number {" +
                "number: '" + number + '\'' +
                '}';
    }
}
