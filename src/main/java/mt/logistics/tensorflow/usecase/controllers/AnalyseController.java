package mt.logistics.tensorflow.usecase.controllers;

import com.jfoenix.controls.JFXListView;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mt.logistics.tensorflow.usecase.models.StorageItem;

import java.net.URL;
import java.util.ResourceBundle;

public class AnalyseController extends MainController {
    @FXML
    private TableView<StorageItem> tableView;
    @FXML
    private TableColumn<StorageItem, Integer> idColumn;
    //@FXML private TableColumn<StorageItem, String> itemColumn;
    //@FXML private TableColumn<StorageItem, Integer> amountColumn;
    //@FXML private TableColumn<StorageItem, Date> dateColumn;

    @FXML
    private JFXListView listView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        idColumn.setCellValueFactory(new PropertyValueFactory<StorageItem, Integer>("ID"));
        //itemColumn.setCellValueFactory(new PropertyValueFactory<StorageItem, String>("Lagermittel"));
        //amountColumn.setCellValueFactory(new PropertyValueFactory<StorageItem, Integer>("Anzahl"));
        //dateColumn.setCellValueFactory(new PropertyValueFactory<StorageItem, Date>("Zeit"));

        //newStorageItem();
        //tableView.getItems().add(1,new StorageItem(1,"ContainerB",2,new Date()));
        //System.out.println(new StorageItem(1,"ContainerA", 1, new Date()));

        /*ObservableList<StorageItem> items = FXCollections.observableArrayList(
                new StorageItem()
        );*/
        //tableView.setItems(items);
        //getTestData();

    }

    public void newStorageItem() {
        StorageItem storageItem = new StorageItem(1);
        tableView.getItems().add(storageItem);
    }

    public void getTestData() {
        ObservableList<StorageItem> items = FXCollections.observableArrayList(
                new StorageItem(1)
        );

        //items.add(new StorageItem(1,"ContainerA",1,new Date()));

        //return items;
    }

}
