package day5.org;

import java.util.Scanner;

public class tollbooth {

    // Fields for toll rates and vehicle counts
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;
    private double totalRevenue;

    // Method to accept toll rates from the user
    public void setTollRates() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for Cars (₹): ");
        this.carRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Trucks (₹): ");
        this.truckRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Motorcycles (₹): ");
        this.motorcycleRate = scanner.nextDouble();
    }

    // Method to accept vehicle counts from the user
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        this.carCount = scanner.nextInt();

        System.out.print("Enter the number of trucks: ");
        this.truckCount = scanner.nextInt();

        System.out.print("Enter the number of motorcycles: ");
        this.motorcycleCount = scanner.nextInt();
    }

    // Business Logic: Calculate the total revenue
    public void calculateRevenue() {
        this.totalRevenue = (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
    }

    // Method to print the toll revenue report
    public void printRecord() {
        System.out.printf("Total Vehicles Passed: %d (Cars: %d, Trucks: %d, Motorcycles: %d)\n",
                (carCount + truckCount + motorcycleCount), carCount, truckCount, motorcycleCount);
        System.out.printf("Total Revenue Collected: ₹%.2f\n", totalRevenue);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        tollbooth tollBooth = new tollbooth();
        
        tollBooth.setTollRates();
        tollBooth.acceptRecord();
        tollBooth.calculateRevenue();
        tollBooth.printRecord();
    }
}
