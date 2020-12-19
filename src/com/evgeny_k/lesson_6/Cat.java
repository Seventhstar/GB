package com.evgeny_k.lesson_6;

public class Cat extends Animal {
    public Cat() {
        this.maxRunDistance = 200;
        this.maxJumpHeight = 2.0;
        this.maxSwimDistance = 0;
    }

    public Cat(int runDistance, double jumpHeight) {
        this.maxRunDistance = runDistance;
        this.maxJumpHeight = jumpHeight;
        this.maxSwimDistance = 0;
    }

}
