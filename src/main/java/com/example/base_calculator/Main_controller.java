package com.example.base_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Main_controller {
    @FXML

    private Button Exit;


    @FXML
    void Binary_Button(ActionEvent event) {
        String getinput=input.getText();


        try {

            double number = Double.parseDouble(getinput);
            System.out.println("Input is a valid double: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.");
        }
        try{
            int decimal=Integer.parseInt(getinput);
            String binary=Integer.toBinaryString(decimal);
            output.setText(binary + "");
        }catch(Exception e){
            output.setText("                       Invalid Input");
        }
    }



    @FXML
    void hexa_button(ActionEvent event) {

        String getinput=input.getText();

            int decimal=Integer.parseInt(getinput);

        try{
            if(decimal == Math.floor(decimal)){

            String hexa=Integer.toHexString(decimal);
            output.setText(hexa + "");}
        }catch(Exception e){
            output.setText("                       No Input Given");
        }

    }


    @FXML
    void octal_button(ActionEvent event) {

        String getinput=input.getText();

        try{
            int decimal=Integer.parseInt(getinput);
            String octal=Integer.toOctalString(decimal);
            output.setText(octal + "");
        }catch(Exception e){
            output.setText("                       Invalid Input");
        }

    }


    @FXML
    private Button next;
    @FXML
    void next(ActionEvent event) {
        try {
            Parent mainscene = FXMLLoader.load(getClass().getResource("NextScreen.fxml"));
            next.getScene().setRoot(mainscene);
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

    @FXML
    void do_exit(ActionEvent event) {
        System.exit(0);
    }
    @FXML
    void clear_button(ActionEvent event) {
            output.setText("                       No Input");
    }


    @FXML
    private TextField input;

    @FXML
    private Label output;


    @FXML
    void input(ActionEvent event) {

    }
}