package org.fundacion.calculatorAreasPerimeters;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
public class Rectangle extends Shape{
    int higth;
    int weigth;

    public Rectangle(int higth, int weigth) {
        super(higth,weigth);
        this.higth = higth;
        this.weigth = weigth;
    }
    public double calculateArea() {
        double res = higth * weigth;
        return res;
    }
    public double calculatePerimeter() {
        double res = (higth + weigth) * 2;
        return res;
    }
}
