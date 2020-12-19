package com.lab13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Student{
    private  int iDNumber;
    private  double GPA;
    private final static NumberFormat nf = new DecimalFormat("#.00");

    public Student() {
        String str;
        str = nf.format(5 - Math.random() * 3);
        str = str.replace(",", ".");

        this.GPA = Double.parseDouble(str);
        this.iDNumber = (int)(Math.random()*100);
    }

    public void sortingByID(ArrayList<Student> arr) {
        for (int j = 0; j < arr.size(); j++)
            for (int i = 0; i < arr.size() - j - 1; i++)
                if (arr.get(i).getIDNumber() > arr.get(i + 1).getIDNumber())
                    Collections.swap(arr, i, i + 1);
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "iD: " + iDNumber +
                ", GPA: " + GPA;
    }
}