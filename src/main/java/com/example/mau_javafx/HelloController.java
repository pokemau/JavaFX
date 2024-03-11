package com.example.mau_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private AnchorPane pnMain;
    @FXML
    private AnchorPane pnTest;

    @FXML
    private VBox pnLogin;

    @FXML
    private VBox pnLogout;

    @FXML
    private VBox pnHome;

    @FXML
    protected void onLogInClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("welcome-view.fxml"));

        pnMain.getChildren().remove(pnLogin);
        pnMain.getChildren().add(root);
    }

    @FXML
    protected void onLogOutClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        pnTest.getChildren().remove(pnLogout);
        pnTest.getChildren().add(root);
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}