package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import values.globals.GlobalSettings;

import java.io.IOException;

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

    private GlobalSettings globalSettings = new GlobalSettings();

    @FXML
    private void initialize(){
        gameVolumeSlider.setValue(globalSettings.getGameVolume());

        musicVolumeSlider.setValue(globalSettings.getMusicVolume());

        obstructionsProbabilitySlider.setValue(globalSettings.getObstructionsProbability());

        costumeBombCheckBox.setSelected(globalSettings.getUsingCostumeBomb());

        languageComboBox.setValue(globalSettings.getLanguage());
        languageComboBox.setItems(languageList);

        mapSizeComboBox.setValue(globalSettings.getMapSize());
        mapSizeComboBox.setItems(mapSizeList);
    }

    public void saveSettings() throws IOException {
        globalSettings.setSettings(gameVolumeSlider.getValue(),musicVolumeSlider.getValue(),obstructionsProbabilitySlider.getValue(),costumeBombCheckBox.isSelected(),mapSizeComboBox.getValue(),languageComboBox.getValue());

        loadMenuScene();
    }
}

