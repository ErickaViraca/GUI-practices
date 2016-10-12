package org.fundacionjala.HighLowDNA;

/**
 * Created by ErickaViraca on 10/11/2016.
 */
public final class Dna {

    /**
     * Private constructor method.
     */
    private Dna() {

    }

    /**
     * Makes the complements given a dna.
     *
     * @param dna, the dna to be complement.
     * @return the dna complemented.
     */
    public static String performComplement(final String dna) {
        return dna.replaceAll("A", "t")
                .replaceAll("C", "g")
                .replaceAll("T", "a")
                .replaceAll("G", "c")
                .toUpperCase();
    }

}
