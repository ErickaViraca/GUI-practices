package org.fundacion.movies;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
public class RegularMovie extends Movie{

    public static final int REGULAR = 0;
    public RegularMovie(String title) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        double thisAmount = 2;
        int daysAtLeastToPromotion = 2;
        double percentOfPromotion = 1.5;
        if (daysRented > daysAtLeastToPromotion)
            thisAmount += (daysRented - daysAtLeastToPromotion) * percentOfPromotion;

        return thisAmount;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
