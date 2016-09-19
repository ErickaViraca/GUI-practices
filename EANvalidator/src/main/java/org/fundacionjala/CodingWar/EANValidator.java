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

        boolean res;
        int checksum = 0;
        int totalSum = additionResults(EAN);
        final int divisor = 10;
        final int checksumPosition = 12;

        if (totalSum % divisor == 0) {
            res = verifyChecksum(checksum, Integer.parseInt(String.valueOf(EAN.charAt(checksumPosition))));
        } else {
            checksum = calculateNewChecksum(totalSum);
            res = verifyChecksum(checksum,  Integer.parseInt(String.valueOf(EAN.charAt(checksumPosition))));
        }
        return res;
    }

    /**
     * Calculates a new checksum if totalSum isn't divisible 10
     *
     * @param totalSum, the total sum of the first 12 values.
     * @return --> the new checksum calculated
     */
    private static int calculateNewChecksum(int totalSum) {
        int divisor = 10;
        return divisor - (totalSum % divisor);
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
            if (i == 0) {
                totalOddsPositions = Integer.parseInt(String.valueOf(EAN.charAt(0)));
            }else if (i % 2 == 0) {
                totalOddsPositions += Integer.parseInt(String.valueOf(EAN.charAt(i)));
            } else {
                int valueMultiply = Integer.parseInt(String.valueOf(EAN.charAt(i))) * 3;
                totalPairsPositions += valueMultiply;
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
        if (checksum == finalValue) {
            return true;
        } else {
            return false;
        }
    }

}
