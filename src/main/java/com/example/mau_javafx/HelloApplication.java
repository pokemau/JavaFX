package com.example.mau_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}