package org.fundacionjala.CodingWar;

/**
 * Created by ErickaViraca on 8/26/2016.
 */
public class EANValidator {

    /**
     * Validates the EAN string
     *
     * @param EAN, string of value
     * @return --> true or false
     */
    public static boolean validate(String EAN) {
        int totalSum = additionResults(EAN);
        final int divisor = 10;
        int checksum = totalSum % divisor == 0 ? 0 : divisor - (totalSum % divisor);
        return verifyChecksum(checksum, Integer.parseInt(String.valueOf(EAN.charAt(EAN.length() - 1))));
    }

    /**
     * Adds the values of the final result for oods positions and pairs positions
     *
     * @param EAN, string of numbers
     * @return -->  totalOddsPositions + totalPairsPositions
     */
    private static int additionResults(String EAN) {
        int totalOddsPositions = 0;
        int totalPairsPositions = 0;
        for (int i = 0; i < EAN.length() - 1; i++) {
            if (i == 0 || i % 2 == 0) {
                totalOddsPositions += Integer.parseInt(String.valueOf(EAN.charAt(i)));
            } else {
                totalPairsPositions += Integer.parseInt(String.valueOf(EAN.charAt(i))) * 3;
            }
        }
        return totalOddsPositions + totalPairsPositions;
    }

    /**
     * Verifies the final value of the original string with the corresponding checksum
     *
     * @param checksum, the corresponding checksum
     * @param finalValue, the final value of the original string
     * @return --> true or false
     */
    private static boolean verifyChecksum(int checksum, int finalValue) {
        return checksum == finalValue;
    }

}
