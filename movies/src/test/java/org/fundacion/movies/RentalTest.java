package org.fundacion.movies;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class RentalTest extends TestCase {

    //tests for regular movie
    public void test_calculateAmount_ForRegularMovie() {
        RegularMovie movie = new RegularMovie("testToCalculate");
        double finalAmount = 6.5;
        int daysRented = 5;
        assertEquals(movie.calculateAmount(daysRented), finalAmount);
    }

    public void test_calculateFrequentRenterPoints_ForRegularMovie() {
        RegularMovie movie = new RegularMovie("testToCalculate");
        double finalFrequentRenterPoints = 1;
        int daysRented = 5;
        assertEquals((double)movie.calculateFrequentRenterPoints(daysRented), finalFrequentRenterPoints);
    }
}