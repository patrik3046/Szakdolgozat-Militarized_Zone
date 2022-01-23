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

    @Override
    public String toString() {
        String string = "({";
        for (int i = 0; i < dispersion.length; i++) {
            string += "{";
            for (int j = 0; j < dispersion.length; j++) {
                string += dispersion[i][j];
                if (j != dispersion.length-1) {
                    string += ",";
                }
            }
            string += "}";
            if (i != dispersion.length-1) {
                string += ",";
            }
        }

        string += "},";
        string += obstructionsProbability;
        string += ")";

        return string;
    }
}
