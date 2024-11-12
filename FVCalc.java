

public class FVCalc {
    public static void main(String[] args) {
        // Parse arguments and convert to appropriate types
        double p = Double.parseDouble(args[0]); // Initial investment amount (Principal)
        
        double r = Double.parseDouble(args[1]); // Interest rate as an integer (e.g., 5 for 5%)
        r = r / 100.0; // Convert from percentage to decimal

        double y = Double.parseDouble(args[2]); // Number of years for the investment

        // Calculate future value using the formula: FV = P * (1 + r)^n
        double futureValue = p * Math.pow((1 + r), y);
        int futureValueInt = (int) futureValue;

        // Display the result with proper formatting
        System.out.println("After " + y + " years, a $" + p + " saved at " + r + ".0%25 will yield $" + futureValueInt);
    }
}


