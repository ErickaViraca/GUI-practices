package org.fundacionjala.org;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for {@link Rectangle}
 */
public class RectangleTest extends TestCase {
    private Shape shape;

    @Before
    public void setUp() {
        final int higth = 5;
        final int weigth = 6;
        shape = new Rectangle(higth, weigth);
    }

    @Test
    public void test_calculateArea() {
        final double result = 30;
        assertEquals(shape.calculateArea(), result);
    }

    @Test
    public void test_calculatePerimeter() {
        final double result = 22;
        assertEquals(shape.calculatePerimeter(), result);
    }

}
