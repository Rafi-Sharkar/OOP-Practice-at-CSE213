package com.rs.mainpackge.course_manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("course_manager-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(" Course Manager");
        stage.setScene(scene);
        stage.show();
    }
}