

public class FVCalc {
    public static void main(String[] args) {
        // Parse arguments and convert to appropriate types
        int p = Integer.parseInt(args[0]); // Initial investment amount (Principal)
        
        double r = Integer.parseInt(args[1]); // Interest rate as an integer (e.g., 5 for 5%)
        r = r / 100.0; // Convert from percentage to decimal

        int y = Integer.parseInt(args[2]); // Number of years for the investment

        // Calculate future value using the formula: FV = P * (1 + r)^n
        double futureValue = p * Math.pow((1 + r), y);

        // Display the result with proper formatting
        System.out.printf("After %d years, a $%d saved at %.1f%% will yield $%.0f\n", y, p, r * 100, futureValue);
    }
}


