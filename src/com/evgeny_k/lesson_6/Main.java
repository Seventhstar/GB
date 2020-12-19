package com.evgeny_k.lesson_6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.swim(1);

        Cat cat2 = new Cat(300, 3);
        cat1.run(250);
        cat2.run(250);

        cat2.jump(3);

        Dog dog1 = new Dog();
        dog1.run(400);
        dog1.run(600);

        Dog dog2 = new Dog(600, 0.6, 20);
        dog2.run(600);

    }
}
