package com.evgeny_k.java_core_adv_lesson_7.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage chatStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        chatStage.setTitle("Сетевой чат");
        chatStage.setScene(new Scene(root, 500, 240));
        chatStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
