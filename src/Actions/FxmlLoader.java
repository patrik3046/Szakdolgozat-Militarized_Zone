package Actions;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class FxmlLoader {

    private static Pane view;

    public static Pane getFxml(String fileName) {
        try {
            URL fileUrl = FxmlLoader.class.getResource("/Scenes/" + fileName + ".fxml");

            System.out.println();
            if (fileUrl == null) {
                throw new java.io.FileNotFoundException("A keresett " + fileName + ".fxml fájl nem található!");
            }

            view = new FXMLLoader().load(fileUrl);
        } catch (Exception exception) {
            System.err.println("A keresett fájl nem található:" + fileName + "!");
        }

        return view;
    }
}
