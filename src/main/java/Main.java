import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //InputStream input = getClass().getResourceAsStream("/views/start.fxml");
        //System.out.println(input);

        Parent window = FXMLLoader.load(getClass().getResource("/views/start.fxml"));
        primaryStage.setTitle("mt.tensorflow.prototype");
        primaryStage.setScene(new Scene(window, 1024, 768));
        //primaryStage.setResizable(false);
        primaryStage.show();
    }
}
