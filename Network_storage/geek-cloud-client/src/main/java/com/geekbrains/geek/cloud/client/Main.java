package com.geekbrains.geek.cloud.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
        stage.setTitle("Cloud Client Controller");
        stage.setScene(new Scene(root, 600, 400));

        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
