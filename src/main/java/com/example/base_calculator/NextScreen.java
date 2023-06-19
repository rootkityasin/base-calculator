package com.example.base_calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NextScreen extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.base_calculator.Main.class.getResource("NextScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Base Conversion Calculator");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }


}
