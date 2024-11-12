

public class FVCalc {
    public static void main(String[] args) {
        
        // Initial investment amount (Principal)
        int p = int.parseInt(args[0]);

        int rate = int.parseInt(args[1]) / 100; // Convert from % to decimal

        int years = int.parseInt(args[2]); //years for the investment

        // Calculate future value using the formula FV = P * (1 + r)^n
        int pV = p;
        int value2 = (1 + rate);
        int magicNumber = (p * Math.pow(value2, years));

        // Display the result with formatting
        System.out.println("The future value of the investment is: " + magicNumber);
    }
}
