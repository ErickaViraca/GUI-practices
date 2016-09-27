package org.fundacion.calculatorAreasPerimeters;

import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void test_calculateArea_WithPositiveValue() {
        Square square = new Square(6);
        double result = 36;
        assertEquals(square.calculateArea(), result);
    }
    public void test_calculateArea_WithNegativeValue() {
        Square square = new Square(-6);
        double result = 25;
        assertEquals(square.calculateArea(), result);
    }
    public void test_calculateArea_WithABigValue() {
        Square square = new Square(6008);
        double result = 36096064;
        assertEquals(square.calculateArea(), result);
    }

    public void test_calculatePerimeter_WithPositiveValue() {
        Square square = new Square(6);
        double result = 24;
        assertEquals(square.calculatePerimeter(), result);
    }
    public void test_calculatePerimeter_WithNegativeValue() {
        Square square = new Square(-6);
        double result = -24;
        assertEquals(square.calculatePerimeter(), result);
    }
    public void test_calculatePerimeter_WithABigValue() {
        Square square = new Square(6008);
        double result = 24032;
        assertEquals(square.calculatePerimeter(), result);
    }

}