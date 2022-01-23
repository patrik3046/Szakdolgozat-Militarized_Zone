package utilities;

import javafx.util.Pair;
import values.globals.GlobalSettings;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SettingsFileReaderAndWriter {

    public List<Pair<String, String>> getSettings() {
        String settingsAsStringLine = new Scanner(GlobalSettings.class.getResourceAsStream("settings.conf")).next();
        String[] settingsAsStringArray = settingsAsStringLine.split(";");
        List<Pair<String, String>> settingsAsPairs = new ArrayList<>();
        for (String setting : settingsAsStringArray) {
            String settingKey = setting.split("=")[0];
            String settingValue = setting.split("=")[1];
            Pair<String, String> pair = new Pair<>(settingKey, settingValue);

            settingsAsPairs.add(pair);
        }

        return settingsAsPairs;
    }

    public void setSettings(Double gameVolume, Double musicVolume, Double obstructionsProbability, Boolean usingCostumeBomb, String mapSize, String language) throws IOException {
        FileWriter fileWriter = new FileWriter(GlobalSettings.class.getResource("settings.conf").getFile());
        String settings = "language=" + language + ";gameVolume=" + gameVolume + ";musicVolume=" + musicVolume + ";usingCostumeBomb=" + usingCostumeBomb + ";mapSize=" + mapSize + ";obstructionsProbability=" + obstructionsProbability;

        fileWriter.write(settings);

        fileWriter.close();
    }
}
