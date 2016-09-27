package org.fundacionjala.org;

/**
 * Calculates the perimeter and area for a Circle.
 */
class Circle implements Shape{

    private  final int radio;

    /**
     * Constructor Circle method
     *
     * @param radio, circle's radio
     */
    public Circle(int radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radio,2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return Math.PI* 2 * radio;
    }

}
