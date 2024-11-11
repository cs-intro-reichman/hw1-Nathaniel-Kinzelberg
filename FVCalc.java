import java.util.Scanner;

public class FVCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial investment amount (Principal)
        System.out.print("Enter the initial investment (Principal): ");
        double p = scanner.nextDouble();

        //Aasks for annual interest rate in %
        System.out.print("Enter the annual interest rate (in %): ");
        double r = scanner.nextDouble() / 100; // Convert from % to decimal

        // Ask for the number of years the money is invested
        System.out.print("Enter how many years in the future youd like to see your investment: ");
        int y = scanner.nextInt();

        // Calculate future value using the formula FV = P * (1 + r)^n
        double future value = p * Math.pow((1 + r), y);

        // Display the result
        System.out.println("The future value of the investment is: %.2f\n", futureValue);
    }
}
