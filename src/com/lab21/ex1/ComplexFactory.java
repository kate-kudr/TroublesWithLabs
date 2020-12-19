package com.lab21.ex1;

public class ComplexFactory implements AbstractFactory {
    @Override
    public ComplexNumber create() {
        return new ComplexNumber();
    }

    @Override
    public ComplexNumber create(double re, double im) {
        return new ComplexNumber(re, im);
    }
}
