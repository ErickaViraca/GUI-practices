package org.fundacion.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("User01");
        ChildrensMovie movie1 = new ChildrensMovie("Lyon King");
        NewReleaseMovie movie2 = new NewReleaseMovie("BAP");
        ChildrensMovie movie3 = new ChildrensMovie("Aladin");
        Rental rent = new Rental(movie1, 2);
        Rental rent1 = new Rental(movie2, 1);
        Rental rent2 = new Rental(movie3, 3);
        RentalCustomer rentalcustom = new RentalCustomer(customer);
        rentalcustom.addRental(rent);
        rentalcustom.addRental(rent1);
        rentalcustom.addRental(rent2);
        System.out.println(rentalcustom.statement());
    }
}
