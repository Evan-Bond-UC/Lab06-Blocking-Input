import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0.0;
        double mpg = 0.0;
        double pricePerGallon = 0.0;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                if (gallons <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        } while (gallons <= 0);

        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            if (scanner.hasNextDouble()) {
                mpg = scanner.nextDouble();
                if (mpg <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        } while (mpg <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        } while (pricePerGallon <= 0);

        double costFor100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        System.out.printf("The cost to drive 100 miles is $%.2f%n", costFor100Miles);
        System.out.printf("With a full tank, the car can go %.2f miles%n", maxDistance);

        scanner.close();
    }
}