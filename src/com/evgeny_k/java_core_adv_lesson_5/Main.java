package com.evgeny_k.java_core_adv_lesson_5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int half = size / 2;

    public static void main(String[] args) {
        firstMethod(); // Метод 1, время: 6547
        secondMethod(); // Метод 2, время: 2537
    }

    private static void secondMethod() {
        float[] arr = new float[size];
        float[] a1 = new float[half];
        float[] a2 = new float[half];

        Arrays.fill(arr, 1);

        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, half);
        System.arraycopy(arr, half, a2, 0, half);

        Thread firstCalculation = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread secondCalculation = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        firstCalculation.start();
        secondCalculation.start();

        try {
            firstCalculation.join();
            secondCalculation.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);

        long end = System.currentTimeMillis();
        System.out.println("Метод 2, время: " + (end - start));
    }

    private static void firstMethod() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);

        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println("Метод 1, время: " + (end - start));
    }
}