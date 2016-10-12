package org.fundacionjala.HighLowDNA;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Dna}.
 */
public class dnaTest {

    /**
     * Test to validate the Complement.
     */
    @Test
    public void testMakeComplement() {
        assertEquals("TAACG", Dna.performComplement("ATTGC"));
        assertEquals("CATA", Dna.performComplement("GTAT"));
        assertEquals("CATO", Dna.performComplement("GTAO"));
    }

}
