public class NumWords {
    public static void main(String[] args) {
      
        int num = Integer.parseInt(args[0]);

        // Check if the input is within the valid range
        if (num < 0 || num > 999) {
            System.out.println("Please enter a number between 0 and 999.");
        } else {
            // Finds each digit
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int units = num % 10;

            // Prints in the unit notation
            System.out.println("Hundreds: " + hundreds + " Tens: " + tens + " Units: " + units);
        }

    }
}
