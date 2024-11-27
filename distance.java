package Practice;

import java.util.Scanner;

public class p1 {

    private double kilometers;

    // Constructor to take initial kilometers and meters as input
    public p1(double initialKilometers, double meters) {
        this.kilometers = initialKilometers + (meters / 1000); // Add meters to kilometers directly
    }

    // Method to get the total distance in kilometers
    public double getTotalDistance() {
        return this.kilometers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial distance in kilometers: ");
        double initialKilometers = scanner.nextDouble();
        System.out.print("Enter additional distance in meters: ");
        double meters = scanner.nextDouble();

        // Create an instance using the constructor with user input
        p1 converter = new p1(initialKilometers, meters);

        // Get the final distance in kilometers
        double totalDistance = converter.getTotalDistance();

        System.out.println("Total distance: " + totalDistance + " km");
    }
}