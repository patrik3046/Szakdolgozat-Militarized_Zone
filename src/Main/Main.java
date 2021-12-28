package Controllers;

import Controllers.FxmlController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Scenes/RootScene.fxml"));
        primaryStage.setTitle("Militarized Zone");
        primaryStage.setScene(new Scene(root, 640   , 480));


        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("RootScene.fxml"));
        Controller controller = loader.getController();
        controller.setMenuScene();

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
