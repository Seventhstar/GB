package com.evgeny_k.java_core_adv_lesson_7.client;

import com.evgeny_k.java_core_adv_lesson_7.server.Message;
import java.io.IOException;

public interface ServerService {

    boolean isConnected();
    void openConnection();
    void closeConnection();
    String authorization(String login, String password) throws IOException;

    void sendMessage(String message);
    Message readMessages();
}
