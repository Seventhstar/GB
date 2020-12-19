package com.evgeny_k.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int TRY_COUNT = 3;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean win = false;
            int number = new Random().nextInt(10);
            System.out.println("Я загадал число от 0 до 9. Попробуйте угадать!");
            //System.out.println(number);
            for (int i = 0; i < TRY_COUNT; i++) {
                System.out.println("Попытка №" + (i + 1));
                int userNumber = scanner.nextInt();
                if (userNumber == number) {
                    win = true;
                    System.out.println("Вы угадали! Это действительно " + number);
                    break;
                } else if (userNumber > number) {
                    System.out.format("Ваше число %d больше.%n", userNumber);
                } else {
                    System.out.format("Ваше числе %d меньше.%n", userNumber);
                }
            }
            if (!win) System.out.println("Вы проиграли!");
            System.out.format("%nПовторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет)");
            boolean onceAgain = scanner.nextInt() == 1;
            if (!onceAgain) break;
        }
    }
}
