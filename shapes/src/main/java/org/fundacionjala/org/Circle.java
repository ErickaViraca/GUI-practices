package org.fundacionjala.org;

/**
 * Created by ErickaViraca on 8/24/2016.
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
