package mt.logistics.tensorflow.usecase.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mt.logistics.tensorflow.usecase.models.StorageItem;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        itemCol.setCellValueFactory(new PropertyValueFactory<>("item"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        addTableList("Fässer", 5, getTimestamp());
        addTableList("Container", 2, getTimestamp());
        addTableList("Paletten", 5, getTimestamp());
    }

    private void addTableList(String item, Integer amount, String date) {
        StorageItem addItem = new StorageItem(getNewTableViewID(), item, amount, date);
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

    public ObservableList<StorageItem> getStorageItems() {
        ObservableList<StorageItem> items = FXCollections.observableArrayList();

        items.add(new StorageItem());
        items.add(new StorageItem(1, "PalettenA", 4, getTimestamp()));
        return items;
    }
}
