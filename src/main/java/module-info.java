module com.example.javafxapplication_section18javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxapplication_section18javafx to javafx.fxml;
    exports com.example.javafxapplication_section18javafx;
}