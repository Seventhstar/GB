package com.evgeny_k.lesson_7;


public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) this.fullness = true;
    }

    public void status() {
        System.out.println("Name: " + this.name + ", fulness: " + fullness);
    }
}

