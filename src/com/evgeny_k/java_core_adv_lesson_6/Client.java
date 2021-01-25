package com.evgeny_k.java_core_adv_lesson_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final int SERVER_PORT = 1234;
    private static final String SERVER_ADDRESS = "localhost";

    public static void main(String[] args) {
        new Client();
    }

    public Client() {
        Socket socket = null;

        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("Подключился к серверу");


            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner fromSocket = new Scanner(socket.getInputStream());
            new Thread(() -> {
                while (true) {
                    String message = fromSocket.nextLine();
                    System.out.println("Сервер: " + message);
                }
            }).start();

            Scanner fromConsole = new Scanner(System.in);
            while (true) {
                System.out.print("Введите сообщение: ");
                String msg = fromConsole.nextLine();
                out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
