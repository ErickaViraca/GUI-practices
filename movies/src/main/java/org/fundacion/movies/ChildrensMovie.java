package org.fundacion.movies;

/**
 * Created by ErickaViraca on 8/24/2016.
 */

public class ChildrensMovie extends Movie {

    public static final int CHILDRENS = 2;
        public ChildrensMovie(String title) {
            super(title);
        }

        public double calculateAmount(int daysRented) {
            double thisAmount = 1.5;
            int daysAtLeastToPromotion = 3;
            double percentOfPromotion = 1.5;
            if (daysRented > daysAtLeastToPromotion)
                thisAmount += (daysRented - daysAtLeastToPromotion) * percentOfPromotion;

            return thisAmount;
        }

        public int calculateFrequentRenterPoints(int daysRented) {
            return 1;
        }
}
