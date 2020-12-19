package com.lab23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<City> cities = new ArrayList<>();

        cities.set(0, new City("Moscow", "Russia"));
        cities.set(1, new City("Madrid", "Spain"));
        cities.set(2, new City("St.Petersburg", "Russia"));
        cities.set(3, new City("New York", "USA"));
        cities.set(4, new City("Barcelona", "Spain"));
        cities.set(5, new City("Kazan", "Russia"));

        ArrayList<String> keys = new ArrayList<>();

        for (int i = 0; i < cities.size(); i++) {
            String key = cities.get(i).country;
            if (!keys.contains(key))
                keys.add(key);
        }

        ArrayList<ArrayList<String>> values = new ArrayList<>();

//        for (int i = 0; i < keys.size(); i++) {
//            for (int j = 0; j < cities.size(); j++) {
//                if (cities.get(j).country == keys.get(i))
//
//            }
//        }
    }
}
