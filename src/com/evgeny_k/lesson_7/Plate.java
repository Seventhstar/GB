package com.evgeny_k.lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int part) {
        if (canEat(part)) {
            food -= part;
            return true;
        }
        return false;
    }

    public boolean canEat(int part) {
        return this.food >= part;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int addFood) {
        food += addFood;
    }
}
