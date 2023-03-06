module lk.matrix.test2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires eu.hansolo.tilesfx;
    requires com.jfoenix;


    opens lk.matrix.calculator to javafx.fxml;
    exports lk.matrix.calculator;
}