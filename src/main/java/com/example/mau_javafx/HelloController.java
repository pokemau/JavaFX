package com.example.mau_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private AnchorPane pnMain;
    @FXML
    private AnchorPane pnLoggedIn;

    @FXML
    private VBox pnLogin;

    @FXML
    private VBox pnLogout;

    @FXML
    private VBox pnHome;

    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;

    @FXML
    private ColorPicker cpPicker;

    @FXML
    protected void onLogInClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("welcome-view.fxml"));

        pnMain.getScene().getStylesheets().clear();
        pnMain.getScene().getStylesheets().add(getClass().getResource("hello.css").toExternalForm());

        String username = txtUserName.getText();
        String password = txtPassword.getText();

        if (username.length() == 0 || password.length() == 0) { return; }


        pnMain.getChildren().remove(pnLogin);
        pnMain.getChildren().add(root);
    }

    @FXML
    protected void onLogOutClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("hello.css").getPath()));
            bw.write(".root { -fx-background-image: url(\"stars_bg.jpg\"); }");
            bw.newLine();
            bw.write(".button { -fx-background-color: #" + cpPicker.getValue().toString().substring(2, 8) + "; }");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AnchorPane parent = (AnchorPane) pnLoggedIn.getParent();

        parent.getChildren().remove(pnLoggedIn);
        parent.getChildren().add(root);

    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}