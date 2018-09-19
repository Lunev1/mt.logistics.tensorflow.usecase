package mt.logistics.tensorflow.usecase.controllers;

import com.jfoenix.controls.JFXSpinner;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import mt.logistics.tensorflow.usecase.models.LogTextLine;
import mt.logistics.tensorflow.usecase.models.StorageItem;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;

public class AnalyseController extends MainController {
    @FXML
    private TableView<StorageItem> tableView;
    private Integer tableViewIDCount = 0;
    @FXML
    private TableColumn<StorageItem, Integer> idCol;
    @FXML
    private TableColumn<StorageItem, String> itemCol;
    @FXML
    private TableColumn<StorageItem, Integer> amountCol;
    @FXML
    private TableColumn<StorageItem, SimpleDateFormat> dateCol;
    @FXML
    private TextArea textArea;
    @FXML
    private Button btnRnd;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        itemCol.setCellValueFactory(new PropertyValueFactory<>("item"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        addTableList("Fässer", 5);
        addTableList("Container", 40);
        addTableList("Paletten", 5);
        addTableList("Säcke", 258);

        textArea.setWrapText(true);
        textArea.appendText(addTextArea("log1"));
        textArea.appendText(addTextArea("log2"));

        //jfxSpinner.setRadius(24);
    }

    private void addTableList(String item, Integer amount) {
        StorageItem addItem = new StorageItem(getNewTableViewID(), item, amount, getTimestamp());
        tableView.getItems().add(addItem);
    }

    private Integer getNewTableViewID() {
        Integer count = 0;
        if (tableViewIDCount != 0) count = tableViewIDCount;
        tableViewIDCount += 1;
        return count;
    }

    private String getTimestamp() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String time = formatter.format(date);
        return time;
    }

    private String addTextArea(String message) {
        LogTextLine logText = new LogTextLine();
        String logMessage = logText.createMessage(message);
        return logMessage;
    }

    public void handleActionRnd() {
        Integer i = (int) Math.floor(Math.random() * 101);
        Integer j = (int) Math.floor(Math.random() * 101);
        Integer k = (int) Math.floor(Math.random() * 101);

        Integer ijk = i + j + k;
        textArea.appendText(addTextArea(ijk.toString()));

        addTableList("Säcke", ijk);

    }
}
