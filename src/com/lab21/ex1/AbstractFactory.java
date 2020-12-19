package com.lab21.ex1;

public interface AbstractFactory {
    ComplexNumber create();
    ComplexNumber create(double re, double im);
}
