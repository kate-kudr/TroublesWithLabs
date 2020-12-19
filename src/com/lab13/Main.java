package com.lab13;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        ArrayList<Student> group1 = new ArrayList<>();
        ArrayList<Student> group2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            group1.add(new Student());
        }
        for (int i = 0; i < 10; i++) {
            group2.add(new Student());
        }

        student.sortingByID(group1);

        for (int i = 0; i < 10; i++) {
            System.out.println(group1.get(i));
            if (i == group1.size() - 1)
                System.out.println();
        }

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();

        sortingStudentsByGPA.sortByGPA(group2, 0, group2.size() - 1, new CompareByGPA());
        sortingStudentsByGPA.toReverse(group2);

        for (int i = 0; i < 10; i++) {
            System.out.println(group2.get(i));
            if (i == group2.size() - 1)
                System.out.println();
        }

        group1.addAll(group2);
        Collections.sort(group1, new CompareByGPA());

        for (int i = 0; i < 20; i++) {
            System.out.println(group1.get(i));
        }

//        test.mergeGroups(group1, group2);
//
//        for (int i = 0; i < group1.size() + group2.size() - 2; i++) {
//            System.out.println(test.mergeGroups(group1, group2).get(i));
//        }
//    }
//
//    ArrayList<Student> faculty = new ArrayList<>();
//
//    public ArrayList<Student> mergeGroups(ArrayList<Student> group1, ArrayList<Student> group2) {
//
//        int position1 = 0, position2 = 0;
//        for (int i = 0; i < group1.size() + group2.size() - 2; i++) {
//            if (position1 == group1.size()) {
//                faculty.add(group2.get(i - position2));
//                position2++;
//            } else if (position2 == group2.size()) {
//                faculty.add(group1.get(i - position1));
//                position1++;
//            } else if (group1.get(i - position1).getGPA() < group2.get(i - position2).getGPA()) {
//                faculty.add(group1.get(i - position1));
//                position2++;
//            } else {
//                faculty.add(group2.get(i - position2));
//                position1++;
//            }
//        }
//        return faculty;
    }
}
