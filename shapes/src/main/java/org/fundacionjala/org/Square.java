package org.fundacionjala.org;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
public class Square implements Shape{
    private final int side;

    /**
     * Constructor Square method
     *
     * @param side, Square's side
     */
    public Square(int side) {
        this.side = side;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return side * side;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
