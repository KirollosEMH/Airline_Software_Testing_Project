package org.example.airlines;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AirlinesApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AirlinesApplication.class.getResource("AirlinesAPP.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 700);
//        stage.resizableProperty().setValue(Boolean.FALSE);

        Button startButton = (Button) scene.lookup("#startButton");
        startButton.setOnAction(event -> {
            try {
                // Load the Main.fxml file
                Parent mainRoot = FXMLLoader.load(getClass().getResource("Login.fxml"));
                Scene mainScene = new Scene(mainRoot, 1200, 700);

                // Set the new scene on the stage
                stage.setScene(mainScene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Image icon = new Image(getClass().getResourceAsStream("icon.png"));
        stage.getIcons().add(icon);
        stage.setTitle("Air Broz");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}