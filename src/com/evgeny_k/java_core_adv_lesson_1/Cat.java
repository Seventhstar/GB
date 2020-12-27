package com.evgeny_k.java_core_adv_lesson_1;

public class Cat implements SportActivable{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String GetName() {
        return this.name;
    }
}
