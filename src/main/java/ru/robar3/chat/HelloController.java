package ru.robar3.chat;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea area;
    @FXML
    private TextField field;


    @FXML
    protected void send() {
        if (!field.getText().equals("")){
            String fieldText =field.getText();
            area.setText(area.getText()+"\n"+fieldText);
            field.clear();
        }
    }
}