package org.fundacion.calculatorAreasPerimeters;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

public class CircleTest extends TestCase {

    public void initValues() {
        Circle circle = new Circle(5);
        double result = Math.PI * Math.pow(5,2);
        assertEquals(circle.calculateArea(), result);
    }

    public void test_calculateArea_WithPositiveValue() {
        Circle circle = new Circle(5);
        double result = Math.PI * Math.pow(5,2);
        assertEquals(circle.calculateArea(), result);
    }
    public void test_calculateArea_WithNegativeValue() {
        Circle circle = new Circle(-5);
        double result = Math.PI * Math.pow(-5,2);
        assertEquals(circle.calculateArea(), result);
    }
    public void test_calculateArea_WithABigValue() {
        Circle circle = new Circle(5008);
        double result = Math.PI * Math.pow(5008,2);
        assertEquals(circle.calculateArea(), result);
    }

    public void test_calculatePerimeter_WithPositiveValue() {
        Circle circle = new Circle(5);
        double result = Math.PI* 2 * 5;
        assertEquals(circle.calculateArea(), result);
    }
    public void test_calculatePerimeter_WithNegativeValue() {
        Circle circle = new Circle(-5);
        double result = Math.PI* 2 * -5;
        assertEquals(circle.calculateArea(), result);
    }
    public void test_calculatePerimeter_WithABigValue() {
        Circle circle = new Circle(5008);
        double result = Math.PI* 2 * 5008;
        assertEquals(circle.calculateArea(), result);
    }

}