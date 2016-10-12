package org.fundacionjala.HighLowDNA;

import java.util.Arrays;

/**
 * Created by ErickaViraca on 10/11/2016.
 */
public final class HighLow {

    private static final String BLANK_SPACE = " ";

    /**
     * Private constructor.
     */
    private HighLow() {

    }

    /**
     * Gets the high and the low number of the string received.
     *
     * @param stringOfNumbers the String that contain the number values.
     * @return the highest and lowest numbers.
     */
    public static String getHighLow(final String stringOfNumbers) {
        String[] array = stringOfNumbers.split(BLANK_SPACE);
        int high = Arrays.asList(array).stream().mapToInt(i -> Integer.parseInt(i)).max().getAsInt();
        int low = Arrays.asList(array).stream().mapToInt(i -> Integer.parseInt(i)).min().getAsInt();
        return String.format("%d %d", high, low);
    }

}
