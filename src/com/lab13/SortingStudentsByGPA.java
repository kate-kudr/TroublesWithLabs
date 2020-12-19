package com.lab13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA {
    public void sortByGPA(ArrayList<Student> arr, int leftBound, int rightBound, Comparator<Student> comparator) {
        if (arr.size() == 0 || !(leftBound < rightBound))
            return;

        int mid = leftBound + (rightBound - leftBound) / 2;
        Student anchor = arr.get(mid);
        int left = leftBound, right = rightBound;

        while (left <= right) {
            while (comparator.compare(arr.get(left), anchor) < 0)
                left++;

            while (comparator.compare(arr.get(right), anchor) > 0)
                right--;

            if (left <= right) {
                Collections.swap(arr, left, right);
                left++;
                right--;
            }
        }

        if (leftBound > right)
            sortByGPA(arr, leftBound, right, comparator);
        if (rightBound < left)
            sortByGPA(arr, left, rightBound, comparator);
    }

    public void toReverse(ArrayList<Student> arr) {
        Collections.reverse(arr);
    }
}

