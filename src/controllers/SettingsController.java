package controllers;

import elements.Bomb;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
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
    private CheckBox customBombCheckBox;

    @FXML
    private AnchorPane customBombSettingsPane;

    @FXML
    private GridPane customBombGridPane;

    @FXML
    private Slider customObstructionsProbabilitySlider;

    @FXML
    private Label remainingTiles;

    private ObservableList<String> languageList = FXCollections.observableArrayList("Magyar","Angol");

    private ObservableList<String> mapSizeList = FXCollections.observableArrayList("10x10","12x12","15x15");

    private GlobalSettings globalSettings = new GlobalSettings();

    @FXML
    private void initialize(){
        gameVolumeSlider.setValue(globalSettings.getGameVolume());

        musicVolumeSlider.setValue(globalSettings.getMusicVolume());

        obstructionsProbabilitySlider.setValue(globalSettings.getObstructionsProbability());

        customBombCheckBox.setSelected(globalSettings.getUsingCustomBomb());

        if (globalSettings.getUsingCustomBomb()) {
            remainingTiles.setText("0");
            Bomb customBomb = globalSettings.getCustomBomb();
            customObstructionsProbabilitySlider.setValue(customBomb.getObstructionsProbability());
            for (int i = 0; i < customBomb.getDispersion().length; i++) {
                for (int j = 0; j < customBomb.getDispersion().length; j++) {
                    if (customBomb.getDispersion()[i][j] == 1) {
                        customBombGridPane.getChildren().get(i * 5 + j).setStyle("-fx-background-color: black;");
                    }
                }
            }
        }

        languageComboBox.setValue(globalSettings.getLanguage());
        languageComboBox.setItems(languageList);

        mapSizeComboBox.setValue(globalSettings.getMapSize());
        mapSizeComboBox.setItems(mapSizeList);

        checkCostumeBombState();
    }

    public void saveSettings() throws IOException {
        Bomb bomb = new Bomb(new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}},0.5);
        if (Integer.parseInt(remainingTiles.getText()) == 0) {
            int[][] costumBomb = new int[5][5];

            for (int i = 0; i <= 24; i++) {
                Node pane = customBombGridPane.getChildren().get(i);
                if (pane.getStyle().equals("-fx-background-color: white;")) {
                    costumBomb[i / 5][i % 5] = 0;
                } else if (pane.getStyle().equals("-fx-background-color: black;")) {
                    costumBomb[i / 5][i % 5] = 1;
                }
            }

            bomb = new Bomb(costumBomb, customObstructionsProbabilitySlider.getValue());
        }

        globalSettings.setSettings(gameVolumeSlider.getValue(), musicVolumeSlider.getValue(), obstructionsProbabilitySlider.getValue(),(customBombCheckBox.isSelected() && Integer.parseInt(remainingTiles.getText()) == 0) ? true : false,mapSizeComboBox.getValue(),languageComboBox.getValue(),bomb);

        loadMenuScene();
    }

    public void checkCostumeBombState(){
        if (customBombCheckBox.isSelected()){
            customBombSettingsPane.setDisable(false);
        } else {
            customBombSettingsPane.setDisable(true);
        }
    }

    public void costumeBombGridPaneClicked(MouseEvent event) {
        Node clickedNode = event.getPickResult().getIntersectedNode();
        int index = 0;
        if (clickedNode != customBombGridPane) {
            index = GridPane.getRowIndex(clickedNode) != null ?  5 * GridPane.getRowIndex(clickedNode) : 0;
            index += GridPane.getColumnIndex(clickedNode) != null ? GridPane.getColumnIndex(clickedNode) : 0;

            Node selectedNode = customBombGridPane.getChildren().get(index);


            if(selectedNode.getStyle().equals("-fx-background-color: white;") && Integer.parseInt(remainingTiles.getText()) > 0){
                customBombGridPane.getChildren().get(index).setStyle("-fx-background-color: black;");
                remainingTiles.setText((Integer.parseInt(remainingTiles.getText()) - 1) + "");
            } else if(selectedNode.getStyle().equals("-fx-background-color: black;")){
                customBombGridPane.getChildren().get(index).setStyle("-fx-background-color: white;");
                remainingTiles.setText((Integer.parseInt(remainingTiles.getText()) + 1) + "");
            }
        }
    }
}

