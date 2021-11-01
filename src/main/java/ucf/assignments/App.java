/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("todolist.fxml"));
            Scene sc = new Scene(root);
            primaryStage.setScene(sc);
            primaryStage.setTitle("2DO LIST.");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
