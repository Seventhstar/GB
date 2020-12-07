package com.evgeny_k;

public class Main {
    public static void main(String[] args) {
        // Урок 2.
        int[] numbers = {1, 1, 1, 0, 0, 1, 0, 0, 1, 0};


        System.out.print("Задача 1: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] == 0 ? 1 : 0;
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.print("\nЗадача 2: ");

        int[] intArray = new int[8];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 3 * i;
        }
        for (int n : intArray) {
            System.out.print(n + " ");
        }

        System.out.print("\nЗадача 3: ");
        numbers = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < intArray.length; i++) {
            numbers[i] = numbers[i] < 6 ? numbers[i] * 2 : numbers[i];
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println("\nЗадача 4: ");
        int[][] matrix = new int[8][8];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[matrix.length - i - 1][i] = 1;
        }

        for (int[] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.print("\nЗадача 5: ");
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            if (max < numbers[i]) max = numbers[i];
            if (min > numbers[i]) min = numbers[i];
        }

        System.out.println("max: " + max + ", min: " + min);

        System.out.println("\nЗадача 6: ");
        boolean check1 = checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
        System.out.println("[2, 2, 2, 1, 2, 2, || 10, 1]: " + check1);

        boolean check2 = checkBalance(new int[]{2, 2, 3, 1, 2, 2, 10, 1});
        System.out.println("[2, 2, 3, 1, 2, 2, || 10, 1]: " + check2);

        boolean check3 = checkBalance(new int[]{1, 1, 1, 2, 1});
        System.out.println("[1, 1, 1, || 2, 1]: " + check3);

        System.out.println("\nЗадача 7: ");

        int[] forMoveRight = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        moveArray(forMoveRight, 3);
        System.out.println("[1, 2, 3, 4, 5, 6, 7, 8, 9]: ");
        for (int i : forMoveRight) System.out.print(i + " ");

        int[] forMoveLeft = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        moveArray(forMoveLeft, -5);
        System.out.println("\n[1, 2, 3, 4, 5, 6, 7, 8, 9]: ");
        for (int i : forMoveLeft) System.out.print(i + " ");
    }

    private static boolean checkBalance(int[] array) {
        boolean result = false;

        for (int i = 0; i < array.length - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < i + 1; j++) {
                sumLeft += array[j];
            }

            for (int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }

            if (sumLeft == sumRight) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static void moveArray(int[] array, int move) {
        if (move > 0) {
            for (int j = 0; j < move; j++) {
                int last = array[array.length - 1];
                for (int i = 0; i < array.length - 1; i++) {
                    array[array.length - i - 1] = array[array.length - i - 2];
                }
                array[0] = last;
            }
        } else {
            for (int j = move; j < 0; j++) {
                int first = array[0];
                for (int i = 0; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = first;
            }
        }
    }
}
