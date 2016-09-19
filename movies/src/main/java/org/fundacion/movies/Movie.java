package org.fundacion.movies;

abstract class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public abstract double calculateAmount(int daysRented);

    public abstract int calculateFrequentRenterPoints(int daysRented);

    public String getTitle() {
        return title;
    }
}

