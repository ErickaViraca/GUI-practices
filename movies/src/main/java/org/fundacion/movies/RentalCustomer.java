package org.fundacion.movies;

import java.util.ArrayList;

/**
 * Created by ErickaViraca on 8/24/2016.
 */
public class RentalCustomer {

    private static final String BREAK_LINE = "\n";

    private static final String GIVE_SPACE = "\t";

    ArrayList<Rental> rentals;
    Customer custom = new Customer("");

    public RentalCustomer(Customer customer) {
        rentals = new ArrayList<Rental>();
        custom = customer;
    }
    public void addRental(Rental rent) {
        rentals.add(rent);
    }

    public int calculateTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            //determine amounts for each line
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append(custom.getName());
        result.append(BREAK_LINE);
        for (Rental rental : rentals) {
            //show figures for this rental
            result.append(GIVE_SPACE);
            result.append(rental.getMovie().getTitle());
            result.append(GIVE_SPACE);
            result.append(rental.calculateAmount());
            result.append(BREAK_LINE);
        }
        //add footer lines
        result.append("Amount owed is ");
        result.append(calculateTotalAmount());
        result.append(BREAK_LINE);
        result.append("You earned ");
        result.append(calculateTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }
}
