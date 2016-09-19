package org.fundacion.calculatorAreasPerimeters;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
abstract class Shape {
    int area = 0;
    int perimeter =0;

    int dataShape;
    int dataShape1;
    int dataShape2;

    public Shape(int dataShape) {
        this.dataShape = dataShape;
    }
    public Shape(int dataShape1, int dataShape2) {
        this.dataShape1 = dataShape1;
        this.dataShape2 = dataShape2;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
