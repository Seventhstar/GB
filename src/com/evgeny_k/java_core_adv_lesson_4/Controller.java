package com.evgeny_k.java_core_adv_lesson_4;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Controller {
    public VBox allPanels;
    public TextField newMessage;
    public TextArea allMessages;
    public GridPane pane;


    public void sendMessage(ActionEvent actionEvent) {
        String text = newMessage.getText();
        if (!text.equals("")) {
            allMessages.appendText(text + "\n");
            newMessage.clear();
        }
        newMessage.requestFocus();
    }
}
