package com.example.base_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NextScreen_controller {


    @FXML
    private Button back_button;

    @FXML
    void back_button(ActionEvent event) {
        try {
            Parent mainscene = FXMLLoader.load(getClass().getResource("Main.fxml"));
            back_button.getScene().setRoot(mainscene);
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}