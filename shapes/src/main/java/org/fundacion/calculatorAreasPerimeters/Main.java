package org.fundacion.calculatorAreasPerimeters;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4,5);
        Circle circle = new Circle(8);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
    }
}
