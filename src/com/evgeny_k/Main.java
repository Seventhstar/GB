package com.evgeny_k;

public class Main {

    public static void main(String[] args) {

        boolean bool = true;
        byte myByte = 1;
        short myShort = 2;
        int myInt = 3;
        float e = 2.71828f;
        double pi = 3.141592;
        long maxLong = Long.MAX_VALUE;

        try {
            double result = calcFormula(1, 2, 3, 0);
            System.out.println("calcFormula: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("calcFormula: " + exception);
        }

        double result2 = calcFormula(2, 10, 10, 2);
        System.out.println("calcFormula: " + result2);

        System.out.println("checkBetween10And20 (10+10): " + checkBetween10And20(10, 10));
        System.out.println("isPositiveNumber (-5): " + isPositiveNumber(-5));

        sayHello("Женя");

        System.out.println("complexYear (400): " + complexYear(400));
        System.out.println("complexYear (100): " + complexYear(100));
        System.out.println("complexYear (24): " + complexYear(24));
        System.out.println("complexYear (25): " + complexYear(25));
    }

    private static double calcFormula(int a, int b, int c, int d) {
        if (d == 0) throw new ArithmeticException("Нельзя делить на ноль");
        return a * (b + ((double) c / d));
    }

    private static boolean checkBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static boolean isPositiveNumber(int a) {
        return a > -1;
    }

    private static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static boolean complexYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}
