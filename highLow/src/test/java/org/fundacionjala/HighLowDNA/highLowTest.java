package org.fundacionjala.HighLowDNA;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link HighLow}.
 */
public class highLowTest {

    /**
     * Test to validate the results of the getHighLow method.
     */
    @Test
    public void testHighLowNumbers() {
        assertEquals("5 1", HighLow.getHighLow("1 2 3 4 5"));
        assertEquals("5 -3", HighLow.getHighLow("1 2 -3 4 5"));
        assertEquals("9 -5", HighLow.getHighLow("1 9 3 4 -5"));
    }

}
