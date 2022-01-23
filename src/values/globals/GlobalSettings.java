package values.globals;

import elements.Bomb;
import javafx.util.Pair;
import utilities.SettingsFileReaderAndWriter;
import utilities.StringToBomb;

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

    public Boolean getUsingCustomBomb() {
        settings = settingsFileReaderAndWriter.getSettings();

        for (Pair<String, String> setting : settings) {
            if (setting.getKey().equals("usingCustomBomb")) {
                return Boolean.parseBoolean(setting.getValue());
            }
        }

        return false;
    }

    public Bomb getCustomBomb() {
        StringToBomb stringToBomb = new StringToBomb();
        settings = settingsFileReaderAndWriter.getSettings();

        for (Pair<String, String> setting : settings) {
            if (setting.getKey().equals("bomb")) {
                return stringToBomb.convertStringToBomb(setting.getValue());
            }
        }

        return new Bomb(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}, 0.5);
    }

    public void setSettings(Double gameVolume, Double musicVolume, Double obstructionsProbability, Boolean usingCustomBomb, String mapSize, String language, Bomb bomb) throws IOException {
        settingsFileReaderAndWriter.setSettings(gameVolume, musicVolume, obstructionsProbability, usingCustomBomb, mapSize, language, bomb);
    }
}