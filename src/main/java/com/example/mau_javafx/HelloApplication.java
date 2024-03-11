package com.example.mau_javafx;

import javafx.application.Application;
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
        stage.setResizable(false);
        stage.show();


//        stage.setTitle("JavaFX Welcome");
//        GridPane grid = new GridPane();
//        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.setPadding(new Insets(25, 25, 25, 25));
//        Text scenetitle = new Text("Welcome");
//        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//        grid.add(scenetitle, 0, 0, 2, 1);
//        Label userName = new Label("User Name:");
//        grid.add(userName, 0, 1);
//        TextField userTextField = new TextField();
//        grid.add(userTextField, 1, 1);
//        Label pw = new Label("Password:");
//        grid.add(pw, 0, 2);
//        PasswordField pwBox = new PasswordField();
//        grid.add(pwBox, 1, 2);
//        Button btn = new Button("Sign in");
//        HBox hbBtn = new HBox(10);
//        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hbBtn.getChildren().add(btn);
//        grid.add(hbBtn, 1, 4);
//        final Text actiontarget = new Text();
//        grid.add(actiontarget, 1, 6);
//        Scene scene = new Scene(grid, 300, 275);
//        stage.setScene(scene);
//
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}