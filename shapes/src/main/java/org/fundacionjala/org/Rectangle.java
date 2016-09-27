package org.fundacionjala.org;

/**
 * Calculates the perimeter and area for a Rectangle.
 */
public class Rectangle implements Shape{

    private final int higth;

    private final int weigth;

    /**
     * Constructor Rectangle method
     *
     * @param higth, rectangle's higth
     * @param weigth, rectangle's weigth
     */
    public Rectangle(int higth, int weigth) {
        this.higth = higth;
        this.weigth = weigth;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return higth * weigth;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return (higth + weigth) * 2;
    }

}
