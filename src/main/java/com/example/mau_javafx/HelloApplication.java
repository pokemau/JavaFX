package com.example.mau_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader l = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = null;
        try {
            scene = new Scene(l.load(), 400, 300);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        stage.setScene(scene);
        stage.setTitle("TEST");
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("hello.css")).toExternalForm());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}