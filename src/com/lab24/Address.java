package com.lab24;

import java.util.*;

public class Address {
    private String country, region, city, street, building, housing, apartment;
    private final Scanner scn = new Scanner(System.in);

    public Address() {
    }

    public void processingAddressString(String address) {
        System.out.println("choose the method of split" +
                "\n1 - split by ','" +
                "\n2 - split with usage of 'StringTokenizer' class");

        ArrayList<String> splitAddressList = new ArrayList<>();
        String[] splitAddress = new String[8];
        byte choice;

        try {
            choice = scn.nextByte();
            switch (choice) {
                case 1 -> splitAddress = address.split(", ");
                case 2 -> {
                    StringTokenizer stringTokenizer = new StringTokenizer(address, ",.;- ");

                    while (stringTokenizer.hasMoreTokens()) {
                        splitAddressList.add(stringTokenizer.nextToken());
                    }
                }
                default -> {
                    System.out.println("Fill in correct data next time!");
                    StringTokenizer stringTokenizer = new StringTokenizer(address, ",.;- ");

                    while (stringTokenizer.hasMoreTokens()) {
                        splitAddressList.add(stringTokenizer.nextToken());
                    }
                }
            }

            if (splitAddressList.size() != 0) {
                for (int i = 0; i < splitAddressList.size(); i++) {
                    splitAddress[i] = splitAddressList.get(i);
                }
            }

            setCountry(splitAddress[0]);
            setRegion(splitAddress[1]);
            setCity(splitAddress[2]);
            setStreet(splitAddress[3]);
            setBuilding(splitAddress[4]);
            setHousing(splitAddress[5]);
            setApartment(splitAddress[6]);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            arrayIndexOutOfBoundsException.printStackTrace();
            System.out.println("Wrong choice!");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address {" +
                "country: '" + country + '\'' +
                ", region: '" + region + '\'' +
                ", city: '" + city + '\'' +
                ", street: '" + street + '\'' +
                ", building: '" + building + '\'' +
                ", housing: '" + housing + '\'' +
                ", apartment: '" + apartment + '\'' +
                '}';
    }
}
