package com.lab15;

import com.lab13.Student;

import java.util.Arrays;

public class MyList {
    private static final int defaultCapacity = 10;
    private int size;
    private Student[] group;

    public MyList() {
        group = new Student[defaultCapacity];
    }

    public void increaseCapacity(int minCapacity) {
        int currentCapacity = group.length;
        if (minCapacity > currentCapacity) {
            Student[] newGroup = new Student[Math.max(currentCapacity * 2, minCapacity)];
            System.arraycopy(group, 0, newGroup, 0, size);
            group = newGroup;
        }
    }

    public void add(int i, Student student) {
        if (size == group.length)
            increaseCapacity(size + 1);
        if (i != size)
            System.arraycopy(group, i, group, i + 1, size - i);
        group[i] = student;
        size++;
    }

    public void delete(int i) {
        System.arraycopy(group, i + 1, group, i, size - i - 1);
        size--;
    }

    public void clear() {
        Arrays.fill(group, null);
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Student get(int i) {
        if (i >= size) {
            throw new ArrayIndexOutOfBoundsException("unavailable index");
        }
        return group[i];
    }

    public int size() {
        return size;
    }

    public void reverse() {
        Student[] reverseGroup = new Student[size];
        for (int i = size - 1; i >= 0; i--) {
            reverseGroup[i] = group[size - 1 - i];
        }
        group = reverseGroup;
    }
}
