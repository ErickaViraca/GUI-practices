package org.fundacionjala.org;

import junit.framework.TestCase;
import org.junit.Before;

/**
 * Test for {@link Circle}
 */
public class CircleTest extends TestCase {

    private Shape shape;

    @Before
    public void setUp() {
        final int radio = 5;
        shape = new Circle(radio);
    }

    public void test_calculateArea() {
        final double result = Math.PI * Math.pow(5, 2);
        assertEquals(shape.calculateArea(), result);
    }

    public void test_calculatePerimeter() {
        final double result = Math.PI * 2 * 5;
        assertEquals(shape.calculatePerimeter(), result);
    }

}
