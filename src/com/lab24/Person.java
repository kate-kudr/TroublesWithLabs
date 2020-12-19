package com.lab24;

public class Person {
    private String surname, name, secondName;
    private final Address address = new Address();

    public Person() {
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname, String name, String secondName) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPersonFIO() {
        try {
            return surname + " "
                    + name.charAt(0) + ". "
                    + secondName.charAt(0) + ".";
        } catch (NullPointerException | StringIndexOutOfBoundsException nPtr) {
            try {
                return surname + " " + name.charAt(0) + ".";
            } catch (NullPointerException | StringIndexOutOfBoundsException nullPtr) {
                return surname;
            }
        }
    }

    public void setAddress(String address) {
        this.address.processingAddressString(address);
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person {" +
                getPersonFIO() +
                "}\n" + address;
    }
}