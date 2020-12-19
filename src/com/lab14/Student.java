package com.lab14;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Student {
    private int iDNumber;
    private double GPA;
    private final static NumberFormat nf = new DecimalFormat("#.00");

    public Student(int iDNumber) {
        String str;
        str = nf.format(5 - Math.random() * 3);
        str = str.replace(",", ".");

        this.GPA = Double.parseDouble(str);
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return iDNumber == student.iDNumber && Double.compare(student.GPA, GPA) == 0;
    }
}
