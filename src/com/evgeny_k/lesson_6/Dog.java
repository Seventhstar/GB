package com.evgeny_k.lesson_6;

public class Dog extends Animal {
    public Dog() {
        this.maxRunDistance = 500;
        this.maxJumpHeight = 0.5;
        this.maxSwimDistance = 10;
    }

    public Dog(int runDistance, double jumpHeight, int swimDistance) {
        this.maxRunDistance = runDistance;
        this.maxJumpHeight = jumpHeight;
        this.maxSwimDistance = swimDistance;
    }

}
