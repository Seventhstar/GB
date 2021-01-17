package com.evgeny_k.java_core_adv_lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        List<String> phonesList = get(name);
        if (phonesList == null) phonesList = new ArrayList<>();
        phonesList.add(number);
        phoneBook.put(name, phonesList);
    }

    public List<String> get(String name) {
        return phoneBook.get(name);
    }
}
