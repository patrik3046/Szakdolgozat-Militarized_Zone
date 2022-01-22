package controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import utilities.FxmlLoader;

public class FxmlController {
    @FXML
    private BorderPane mainPane;

    private FxmlLoader loader = new FxmlLoader();

    public void loadSettingsScene(){
        this.mainPane.setCenter(null);
        this.mainPane.setCenter(loader.getFxml("SettingsScene"));
    }
}
