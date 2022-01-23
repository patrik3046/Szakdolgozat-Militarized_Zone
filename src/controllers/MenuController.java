package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import utilities.FxmlLoader;

public class MenuController {

    @FXML
    private BorderPane mainPane;

    private FxmlLoader fxmlLoader = new FxmlLoader();

    public void loadSettingsScene(){
        this.mainPane.setCenter(null);
        this.mainPane.setCenter(fxmlLoader.getFxml("SettingsScene"));
    }

    public void loadMenuScene() {
        this.mainPane.setLeft(null);
        this.mainPane.setRight(null);
        this.mainPane.setCenter(fxmlLoader.getFxml("MenuScene"));
    }

    public void exitGame(){
        Platform.exit();
    }
}
