package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.ComboBox;

public class SettingsController {

    @FXML
    private ComboBox<String> languageComboBox;

    @FXML
    private ComboBox<String> mapSizeComboBox;

    private ObservableList<String> languageList = FXCollections.observableArrayList("Magyar","Angol");

    private ObservableList<String> mapSizeList = FXCollections.observableArrayList("10x10","12x12","15x15");

    @FXML
    private void initialize(){
        languageComboBox.setValue("Magyar");
        languageComboBox.setItems(languageList);

        mapSizeComboBox.setValue("10x10");
        mapSizeComboBox.setItems(mapSizeList);
    }
}

