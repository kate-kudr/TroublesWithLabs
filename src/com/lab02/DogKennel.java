package com.lab02;

import java.util.Arrays;

public class DogKennel {
    private Dog d1 = new Dog(1, "Bobik"),
            d2 = new Dog(2, "Sharik");
    private Dog[] kennel = {d1, d2};

    public void test() {
        for (int i = 0; i < kennel.length; i++) {
            System.out.println(kennel[i].toString());
        }
        Dog d = new Dog();
        while (d.getAge() != -1) {
            kennel = addDog(kennel, d);
            for (int i = 0; i < kennel.length; i++) {
                System.out.println(kennel[i].toString());
            }
            d = new Dog();
        }
    }

    private Dog[] addDog(Dog[] kennel, Dog d) {
        kennel = Arrays.copyOf(kennel, kennel.length + 1);
        kennel[kennel.length - 1] = d;
        return kennel;
    }
}