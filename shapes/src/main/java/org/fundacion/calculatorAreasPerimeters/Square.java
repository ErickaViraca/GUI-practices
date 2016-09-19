package org.fundacion.calculatorAreasPerimeters;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
public class Square extends Shape{
    int side;

    public Square(int side) {
        super(side);
        this.side = side;
    }

    public double calculateArea() {
        int res = side * side;
        return res;
    }
    public double calculatePerimeter() {
        int res = 4 * side;
        return res;
    }
}
