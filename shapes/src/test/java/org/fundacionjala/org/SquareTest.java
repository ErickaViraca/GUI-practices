package org.fundacionjala.org;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link Square}
 */
public class SquareTest {

    private static final double DELTA = 0.001;
    private Shape shape;

    @Before
    public void setUp() {
        final int side = 5;
        shape = new Square(side);
    }

    @Test
    public void test_CalculateArea() {
        final double result = 25;
        assertEquals(result, shape.calculateArea(), DELTA);
    }

    @Test
    public void test_CalculatePerimeter() {
        final double result = 20;
        assertEquals(result, shape.calculatePerimeter(), DELTA);
    }

}
