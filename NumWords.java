import java.util.Scanner;

public class NumWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 to 999): ");
        int num = scanner.nextInt();

        // Check if the input is within the valid range
        if (num < 0 || num > 999) {
            System.out.println("Please enter a number between 0 and 999.");
        } else {
            // Finds each digit
            int number = Integer.parseInt(args[0]);
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;

            // Prints in the unit notation
            System.out.println("Hundreds: " + hundreds);
            System.out.println("Tens: " + tens);
            System.out.println("Units: " + units);
        }
    }
}
