package com.lab23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Notebook {
    public static void main(String[] args){
        Map<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("Ivanov", "Ivan");
        dictionary.put("Sokolov", "Dmitri");
        dictionary.put("Petrova", "Elena");
        dictionary.put("Romanov", "Sergey");
        dictionary.put("Ivanova", "Olga");
        dictionary.put("Sidorov", "Alexey");
        dictionary.put("Kazakova", "Anna");
        dictionary.put("Stepanova", "Olga");
        dictionary.put("Smirnov", "Oleg");
        dictionary.put("Voronin", "Dmitri");

        Map<String, String> dictionary2 = new HashMap<>();
        Map<String, String> keys = new HashMap<>();

        for (String key : dictionary.keySet()) {
            String value = dictionary.get(key);
            if (!dictionary2.containsValue(value))
                dictionary2.put(key, value);
            else keys.put(key, value);
        }

        for (String key : keys.keySet()) {
            String value = keys.get(key);
            if (dictionary2.containsValue(value))
                dictionary2.remove(key, value);
        }

        System.out.println("without the same name: " + dictionary2);
    }
}