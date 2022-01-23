package values.globals;

import javafx.util.Pair;
import utilities.SettingsFileReaderAndWriter;

import java.io.IOException;
import java.util.List;

public class GlobalSettings {

    private List<Pair<String, String>> settings;

    private SettingsFileReaderAndWriter settingsFileReaderAndWriter = new SettingsFileReaderAndWriter();

    public String getMapSize() {
        settings = settingsFileReaderAndWriter.getSettings();

        for (Pair<String, String> setting : settings) {
            if (setting.getKey().equals("mapSize")) {
                return setting.getValue();
            }
        }

        return "";
    }

    public double getObstructionsProbability() {
        settings = settingsFileReaderAndWriter.getSettings();

        for (Pair<String, String> setting : settings) {
            if (setting.getKey().equals("obstructionsProbability")) {
                return Double.parseDouble(setting.getValue());
            }
        }

        return 0.5;
    }

    public String getLanguage() {
        settings = settingsFileReaderAndWriter.getSettings();

        for (Pair<String, String> setting : settings) {
            if (setting.getKey().equals("language")) {
                return setting.getValue();
            }
        }

        return "";
    }

    public double getGameVolume() {
        settings = settingsFileReaderAndWriter.getSettings();

        for (Pair<String, String> setting : settings) {
            if (setting.getKey().equals("gameVolume")) {
                return Double.parseDouble(setting.getValue());
            }
        }

        return 0.5;
    }

    public double getMusicVolume() {
        settings = settingsFileReaderAndWriter.getSettings();

        for (Pair<String, String> setting : settings) {
            if (setting.getKey().equals("musicVolume")) {
                return Double.parseDouble(setting.getValue());
            }
        }

        return 0.5;
    }

    public Boolean getUsingCostumeBomb() {
        settings = settingsFileReaderAndWriter.getSettings();

        for (Pair<String, String> setting : settings) {
            if (setting.getKey().equals("usingCostumeBomb")) {
                return Boolean.parseBoolean(setting.getValue());
            }
        }

        return false;
    }

    public void setSettings(Double gameVolume, Double musicVolume, Double obstructionsProbability, Boolean usingCostumeBomb, String mapSize, String language) throws IOException {
        settingsFileReaderAndWriter.setSettings(gameVolume,musicVolume,obstructionsProbability,usingCostumeBomb,mapSize,language);
    }
}