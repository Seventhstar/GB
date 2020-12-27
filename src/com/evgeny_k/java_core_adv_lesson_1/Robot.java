package com.evgeny_k.java_core_adv_lesson_1;

public class Robot implements SportActivable {
    private String name;

    @Override
    public String GetName() {
        return this.name;
    }

    public Robot(String name) {
        this.name = name;
    }
}
