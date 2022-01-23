package utilities;

import elements.Bomb;

public class StringToBomb {
    public Bomb convertStringToBomb(String string) {
        String firstOperation = string.replaceFirst("\\(", "");
        String secondOperation = firstOperation.replaceFirst("\\)", "");

        String bombObstructionsProbabilityAsString = secondOperation.substring(secondOperation.lastIndexOf(",") + 1, secondOperation.length());
        double bombObstructionsProbability = Double.parseDouble(bombObstructionsProbabilityAsString);

        String bombDispersionString = secondOperation.substring(0, secondOperation.lastIndexOf(","));
        String[] bombDispersionArray = bombDispersionString.split("\\{");
        int[][] bombDispersion = new int[bombDispersionArray.length - 2][bombDispersionArray.length - 2];

        int counter = 0;
        for (int i = 2; i < bombDispersionArray.length; i++) {
            for (int j = 0; j < bombDispersionArray[i].length(); j++) {
                if (bombDispersionArray[i].charAt(j) == '0') {
                    bombDispersion[i - 2][counter] = 0;
                    counter++;
                } else if (bombDispersionArray[i].charAt(j) == '1') {
                    bombDispersion[i - 2][counter] = 1;
                    counter++;
                }
            }
            counter = 0;
        }

        return new Bomb(bombDispersion, bombObstructionsProbability);
    }
}
