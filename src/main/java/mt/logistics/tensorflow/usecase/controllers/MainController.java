package mt.logistics.tensorflow.usecase.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button btnStart;
    @FXML
    private Button btnAnalyse;
    @FXML
    private Button btnLearn;
    @FXML
    private Button btnReport;
    @FXML
    private Button btnSettings;

    @FXML
    public void initialize(URL location, ResourceBundle resources) {

    }

    // handles all actions between stages, is parent of every other controller
    public void handleButtonAction(ActionEvent event) throws IOException
    {
        Stage stage;
        Parent root;

        if (event.getSource() == btnAnalyse) {
            stage = (Stage) btnAnalyse.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/views/analyse.fxml"));
        } else if (event.getSource() == btnLearn) {
            stage = (Stage) btnLearn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/views/learn.fxml"));
        } else if (event.getSource() == btnReport) {
            stage = (Stage) btnReport.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/views/report.fxml"));
        } else if (event.getSource() == btnSettings) {
            stage = (Stage) btnSettings.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/views/settings.fxml"));
        } else {
            stage = (Stage) btnStart.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/views/start.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
