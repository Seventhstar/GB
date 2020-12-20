package com.evgeny_k.lesson_7;

public class Main {
    public static void main(String[] args) {
        int CATS_COUNT = 10;
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[CATS_COUNT];

        // initialize cats
        for (int i = 0; i < CATS_COUNT; i++) {
            cats[i] = new Cat("Cat #" + (i + 1), 10 + i * 2);
        }

        // try to eat
        for (int i = 0; i < CATS_COUNT; i++) {
            cats[i].eat(plate);
        }

        // show status
        for (int i = 0; i < CATS_COUNT; i++) {
            cats[i].status();
        }

        plate.info();
        plate.addFood(30);
        plate.info();

        cats[6].eat(plate);
        cats[6].status();

    }
}
