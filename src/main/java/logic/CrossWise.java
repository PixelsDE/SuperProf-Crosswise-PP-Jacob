package logic;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Application class to set the scene for the user
 */
public class CrossWise extends Application {
    /**
     * Debug Constant - activate to get System out messages
     */
    public static final boolean DEBUG = false;
    /**
     * Constant for the time on how long the program takes to run from start to finish
     */
    public static long time;
    /**
     * Variable to toggle the use of the UI and trigger exception for the tests
     */
    public static boolean UI = true;
    /**
     * Delay between turns
     */
    public static final int DELAY = 10;

    /**
     * Main method, with is called by the Main class
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        launch(args);
    }

    /*
     * TODO: drag and drop having image in it (optional)
     * TODO: drag and drop highlight
     * TODO: colors of background and create game background
     * */

    @Override
    public void start(Stage primaryStage) throws IOException {
        Platform.setImplicitExit(false);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/GameWindow.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 1280, 1024);
        primaryStage.setTitle("Crosswise");
        primaryStage.setResizable(true);
        primaryStage.setScene(scene);
        primaryStage.onCloseRequestProperty().setValue(event -> {
            Platform.exit();
            System.exit(0);
        });
        primaryStage.show();
    }
}
