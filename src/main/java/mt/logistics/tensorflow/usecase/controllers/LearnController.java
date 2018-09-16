package mt.logistics.tensorflow.usecase.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import mt.logistics.tensorflow.usecase.models.StorageItem;

import java.net.URL;
import java.util.ResourceBundle;

public class LearnController extends MainController {

    @FXML
    private TableView<StorageItem> tableView;
    @FXML
    private TableColumn<StorageItem, Integer> idCol;
    @FXML
    private TableColumn<StorageItem, String> itemCol;
    @FXML
    private TableColumn<StorageItem, Integer> amountCol;

    public void initialize(URL location, ResourceBundle resources) {

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        itemCol.setCellValueFactory(new PropertyValueFactory<>("item"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));

        System.out.println(getStorageItems());
        tableView.setItems(getStorageItems());
    }

    public ObservableList<StorageItem> getStorageItems() {
        ObservableList<StorageItem> items = FXCollections.observableArrayList();

        items.add(new StorageItem());
        return items;
    }
}
