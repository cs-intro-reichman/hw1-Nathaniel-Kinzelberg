public class FVCalc {
    public static void main(String[] args) {
        // Parse arguments and convert to appropriate types
        int p = Integer.parseInt(args[0]); // Initial investment amount (Principal)
        
        double r = Double.parseDouble(args[1]); // Interest rate as a percentage (e.g., 5 for 5%)
        r = r / 100; // Convert from percentage to decimal

        int y = Integer.parseInt(args[2]); // Number of years for the investment

        // Calculate future value using the formula: FV = P * (1 + r)^n
        double futureValue = p * Math.pow((1 + r), y);
        
        // Convert futureValue to integer
        int futureValueInt = (int) futureValue;

        // Display the result with proper formatting
        System.out.println("After " + y + " years, a $" + p + " saved at " + (r * 100) + "% will yield $" + futureValueInt);
    }
}
