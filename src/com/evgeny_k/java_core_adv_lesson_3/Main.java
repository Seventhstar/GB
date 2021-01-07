package com.evgeny_k.java_core_adv_lesson_3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String[] strings = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "One", "Two", "Three"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : strings) {
            Integer count = hashMap.get(str);
            hashMap.put(str, count == null ? 1 : count + 1);
        }
        System.out.println("Unique words and counts: " + hashMap);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Jason Statham", "+79111234567");
        phoneBook.add("Jason Statham", "+79811234567");
        phoneBook.add("John Doe", "+79210000000");
        phoneBook.add("Al Pachino", "+79999999999");

        System.out.println("Al Pachino phones: " + phoneBook.get("Al Pachino"));
        System.out.println("Jason Statham phones: " + phoneBook.get("Jason Statham"));
    }
}
