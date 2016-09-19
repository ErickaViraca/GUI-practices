package org.fundacion.movies;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
public class NewReleaseMovie extends Movie{

    public static final int NEW_RELEASE = 1;

    public NewReleaseMovie(String title) {
        super(title);
    }
    
    public double calculateAmount(int daysRented) {
        double percentForNewRelease = 3.0;
        return daysRented * percentForNewRelease;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
