import java.util.Scanner;

public class CtoFConverter {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter temperature in Celsius: ");
            String input = scanner.nextLine();

            try {
                celsius = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a numeric value.");
            }
        }
        double farenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.2f°C is equivalent to %.2f°F%n", celsius, farenheit);
        scanner.close();
    }
}
