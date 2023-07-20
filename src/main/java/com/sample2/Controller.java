package com.sample2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label helloLabel;

    public void initialize() {
        helloLabel.setText("Hello World");
    }
}