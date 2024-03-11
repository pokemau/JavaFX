module com.example.mau_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mau_javafx to javafx.fxml;
    exports com.example.mau_javafx;
}