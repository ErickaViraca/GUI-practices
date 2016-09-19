package org.fundacion.calculatorAreasPerimeters;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
class Circle extends Shape{
    int radio;

    public Circle(int radio) {
        super(radio);
        this.radio = radio;
    }
    public double calculateArea() {
        double res = Math.PI * Math.pow(radio,2);
        return res;
    }
    public double calculatePerimeter() {
        double res = Math.PI* 2 * radio;
        return res;
    }

}
