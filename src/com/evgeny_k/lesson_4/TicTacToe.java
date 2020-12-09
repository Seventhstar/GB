package com.evgeny_k.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int FIELD_SIZE = 3;

    static final char EMPTY_CHAR = '·';
    static final char HUMAN_CHAR = 'X';
    static final char PC_CHAR = 'O';

    static final Scanner scanner = new Scanner(System.in);

    static char[][] cells = new char[FIELD_SIZE][FIELD_SIZE];

    public static void main(String[] args) {
        initGame();
        drawCurrentState();

        boolean gameInProgress = true;
        while (gameInProgress) {
            humanTurn();
            drawCurrentState();
            gameInProgress = !checkGameIsOver(HUMAN_CHAR);
            if (!gameInProgress) break;

            aITurn();
            drawCurrentState();
            gameInProgress = !checkGameIsOver(PC_CHAR);
        }
    }

    private static boolean checkGameIsOver(char symbol) {
        boolean x_win;
        boolean y_win;
        boolean diagonal_win = true;
        boolean back_diagonal_win = true;

        for (int i = 0; i < FIELD_SIZE; i++) {
            x_win = true;
            y_win = true;

            for (int j = 0; j < FIELD_SIZE; j++) {
                if (cells[i][j] != symbol) x_win = false;
                if (cells[j][i] != symbol) y_win = false;
            }

            if (cells[i][i] != symbol) diagonal_win = false;
            if (cells[FIELD_SIZE - 1 - i][i] != symbol) back_diagonal_win = false;

            if (x_win || y_win) {
                showWin(symbol);
                return true;
            }
        }

        if (diagonal_win || back_diagonal_win) {
            showWin(symbol);
            return true;
        }

        return false;
    }

    private static void showWin(char symbol) {
        if (symbol == HUMAN_CHAR)
            System.out.println("Вы подедили! поздравляю!");
        else
            System.out.println("Хаха! я победил!");
    }

    private static boolean cellIsBusy(int x, int y) {
        return cells[y][x] != EMPTY_CHAR;
    }

    private static void initGame() {
        System.out.println("Новая игра!");
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                cells[i][j] = EMPTY_CHAR;
            }
        }
    }

    public static void drawCurrentState() {
        System.out.print("#");
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(" " + cells[i][j]);
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        System.out.println("\nВаш ход");

        while (true) {
            System.out.println("Введите 2 числа через пробел ('X Y' = номер ячейки по горизонтали и по вертикали)");
            String line = scanner.nextLine();
            String[] pos = line.split(" ");
            if (pos.length < 2) continue;
            int x = Integer.parseInt(pos[0]);
            int y = Integer.parseInt(pos[1]);
            if (x < 1 || x > FIELD_SIZE) {
                System.out.println("Не правильная координата X.");
            } else if (y < 1 || y > FIELD_SIZE) {
                System.out.println("Не правильная координата Y.");
            } else if (cellIsBusy(x - 1, y - 1)) {
                System.out.println("Эта ячейка занята");
            } else {
                cells[y - 1][x - 1] = HUMAN_CHAR;
                break;
            }
        }
    }

    private static void aITurn() {
        System.out.println("\nМой ход");
        while (true) {
            int x = new Random().nextInt(FIELD_SIZE);
            int y = new Random().nextInt(FIELD_SIZE);
            if (!cellIsBusy(x, y)) {
                cells[y][x] = PC_CHAR;
                break;
            }
        }
    }
}
