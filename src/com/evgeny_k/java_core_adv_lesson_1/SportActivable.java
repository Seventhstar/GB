package com.evgeny_k.java_core_adv_lesson_1;

public interface SportActivable {

    default String getName() {
        return null;
    }

    default void run() {
        System.out.println(getName() + ": I`m run");
    }

    default void jump() {
        System.out.println(getName() + ": I`m jump");
    }
}
