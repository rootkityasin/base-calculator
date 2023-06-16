module com.example.base_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.base_calculator to javafx.fxml;
    exports com.example.base_calculator;
}