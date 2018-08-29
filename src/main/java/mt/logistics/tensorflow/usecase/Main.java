package mt.logistics.tensorflow.usecase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent window = FXMLLoader.load(getClass().getResource("/start.fxml"));
        primaryStage.setTitle("mt.tensorflow.prototype");
        primaryStage.setScene(new Scene(window, 600, 400));
        primaryStage.show();
    }
}
