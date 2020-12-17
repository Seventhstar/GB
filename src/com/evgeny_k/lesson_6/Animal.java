package com.evgeny_k.lesson_6;

public class Animal {
    int maxRunDistance;
    int maxSwimDistance;
    double maxJumpHeight;

    void run(int distance) {
        System.out.println("run: " + (distance > 0 && distance <= maxRunDistance));
    }

    void swim(int distance) {
        System.out.println("swim: " + (distance > 0 && distance <= maxSwimDistance));
    }

    void jump(double height) {
        System.out.println("jump: " + (height > 0 && height <= maxJumpHeight));
    }
}
