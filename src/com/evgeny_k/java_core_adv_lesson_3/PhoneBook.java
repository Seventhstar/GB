package com.evgeny_k.java_core_adv_lesson_3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        ArrayList<String> phonesList = get(name);
        if (phonesList == null) phonesList = new ArrayList<>();
        phonesList.add(number);
        phoneBook.put(name, phonesList);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }
}
