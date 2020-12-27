package com.evgeny_k.java_core_adv_lesson_1;

public class Human implements SportActivable {
    private String name;

    @Override
    public String GetName() {
        return this.name;
    }

    public Human(String name) {
        this.name = name;
    }
}
