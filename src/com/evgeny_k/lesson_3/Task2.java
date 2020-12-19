package com.evgeny_k.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SHOW_CHARS = 15;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Я загадал слово. Попробуйте угадать!");
        String word = words[new Random().nextInt(words.length)];

        char[] showChars = new char[SHOW_CHARS];
        for (int i = 0; i < SHOW_CHARS; i++) {
            showChars[i] = '#';
        }

        while (true) {
            System.out.println(showChars);
            String userWord = scanner.nextLine();

            if (word.equals(userWord)) {
                System.out.println("Вы угадали это: " + word);
                break;
            } else {
                int n = Math.min(userWord.length(), word.length());
                for (int i = 0; i < n; i++) {
                    if (word.charAt(i) == userWord.charAt(i)) showChars[i] = word.charAt(i);
                }
            }
        }
    }
}
