package org.fundacion.calculatorAreasPerimeters;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {

    public void test_calculateArea_WithPositiveValue() {
        Rectangle rectangle = new Rectangle(5,6);
        double result = 30;
        assertEquals(rectangle.calculateArea(), result);
    }
    public void test_calculateArea_WithNegativeValue() {
        Rectangle rectangle = new Rectangle(5,-6);
        double result = -30;
        assertEquals(rectangle.calculateArea(), result);
    }
    public void test_calculateArea_WithABigValue() {
        Rectangle rectangle = new Rectangle(5,6008);
        double result = 30040;
        assertEquals(rectangle.calculateArea(), result);
    }

    public void test_calculatePerimeter_WithPositiveValue() {
        Rectangle rectangle = new Rectangle(5,6);
        double result = 22;
        assertEquals(rectangle.calculatePerimeter(), result);
    }
    //this test is going to fail because is not valid result with negatives.....do more
    public void test_calculatePerimeter_WithNegativeValue() {
        Rectangle rectangle = new Rectangle(5,-6);
        double result = -2;
        assertEquals(rectangle.calculatePerimeter(), result);
    }
    public void test_calculatePerimeter_WithABigValue() {
        Rectangle rectangle = new Rectangle(5,6008);
        double result = 12026;
        assertEquals(rectangle.calculatePerimeter(), result);
    }

}