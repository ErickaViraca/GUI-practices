package org.fundacionjala.org;

/**
 * Calculates the perimeter and area for a Square.
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
