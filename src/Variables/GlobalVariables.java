package Variables;

public class GlobalVariables {
    private static String language = "hun";
    private static double gameVolume = 0.5;
    private static double musicVolume = 0.5;
    private static Boolean usingCostumeBomb = false;

    public static String getLanguage() {
        return language;
    }

    public static double getGameVolume() {
        return gameVolume;
    }

    public static double getMusicVolume() {
        return musicVolume;
    }

    public static Boolean getUsingCostumeBomb() {
        return usingCostumeBomb;
    }

    public static void setLanguage(String language) {
        GlobalVariables.language = language;
    }

    public static void setGameVolume(double gameVolume) {
        GlobalVariables.gameVolume = gameVolume;
    }

    public static void setMusicVolume(double musicVolume) {
        GlobalVariables.musicVolume = musicVolume;
    }

    public static void setUsingCostumeBomb(Boolean usingCostumeBomb) {
        GlobalVariables.usingCostumeBomb = usingCostumeBomb;
    }
}