package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;

public class SettingsController extends MenuController {

    @FXML
    private ComboBox<String> languageComboBox;

    @FXML
    private ComboBox<String> mapSizeComboBox;

    @FXML
    private Slider gameVolumeSlider;

    @FXML
    private Slider musicVolumeSlider;

    @FXML
    private Slider obstructionsProbabilitySlider;

    @FXML
    private CheckBox costumeBombCheckBox;

    private ObservableList<String> languageList = FXCollections.observableArrayList("Magyar","Angol");

    private ObservableList<String> mapSizeList = FXCollections.observableArrayList("10x10","12x12","15x15");

    @FXML
    private void initialize(){
        languageComboBox.setValue("Magyar");
        languageComboBox.setItems(languageList);

        mapSizeComboBox.setValue("10x10");
        mapSizeComboBox.setItems(mapSizeList);
    }

    public void saveSettings(){}
}

