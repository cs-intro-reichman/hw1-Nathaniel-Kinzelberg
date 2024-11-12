

public class FVCalc {
    public static void main(String[] args) {
        
        // Initial investment amount (Principal)
        int p = Integer.parseInt(args[0]);

        int r = Integer.parseInt(args[1]); / 100; // Convert from % to decimal

        int y = Integer.parseInt(args[2]); //years for the investment

        // Calculate future value using the formula FV = P * (1 + r)^n
        int pV = p;
        int value2 = (1 + r);
        int magicNumber = (p * Math.pow(value2, y));

        // Display the result with formatting
        System.out.println("The future value of the investment is: " + magicNumber);
    }
}
