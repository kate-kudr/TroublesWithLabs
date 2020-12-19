package com.lab03;

public class HumanTest {
    public void testHuman(){
        Human man = new Human("Bob", "Smith", 25, new Hand("white", 2),
                new Head("white", "blue", "brown"), new Leg("white", 2));
        Human woman = new Human();
        woman.setAge(20);
        woman.setName("Sarah");
        woman.setSurname("Miller");
        woman.setHand(new Hand("black", 2));
        woman.setHead(new Head("black", "green", "black"));
        woman.setLeg(new Leg("black", 2));
        System.out.println(man);
        System.out.println(woman);
    }
}
