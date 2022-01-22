package values.globals;

public class GlobalSettings {
    private String language = "hun";
    private double gameVolume = 0.5;
    private double musicVolume = 0.5;
    private Boolean usingCostumeBomb = false;

    public String getLanguage() {
        return language;
    }

    public double getGameVolume() {
        return gameVolume;
    }

    public double getMusicVolume() {
        return musicVolume;
    }

    public Boolean getUsingCostumeBomb() {
        return usingCostumeBomb;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setGameVolume(double gameVolume) {
        this.gameVolume = gameVolume;
    }

    public void setMusicVolume(double musicVolume) {
        this.musicVolume = musicVolume;
    }

    public void setUsingCostumeBomb(Boolean usingCostumeBomb) {
        this.usingCostumeBomb = usingCostumeBomb;
    }
}