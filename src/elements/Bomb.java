package elements;

public class Bomb {
    private int[][] dispersion;
    private double obstructionsProbability;

    public Bomb(int[][] dispersion, double obstructionsProbability) {
        this.dispersion = dispersion;
        this.obstructionsProbability = obstructionsProbability;
    }

    public int[][] getDispersion() {
        return dispersion;
    }

    public double getObstructionsProbability() {
        return obstructionsProbability;
    }

    public void setDispersion(int[][] dispersion) {
        this.dispersion = dispersion;
    }

    public void setObstructionsProbability(double obstructionsProbability) {
        this.obstructionsProbability = obstructionsProbability;
    }
}
