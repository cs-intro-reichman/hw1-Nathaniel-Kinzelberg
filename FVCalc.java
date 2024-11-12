public class FVCalc {
    public static void main(String[] args) {
        
        // Initial investment amount (Principal)
        Double p = Double.parseInt(args[0]);

        Double rate = Double.parseInt(args[1]) / 100; // Convert from % to decimal

        Double years = Double.parseInt(args[2]); //years for the investment

        // Calculate future value using the formula FV = P * (1 + r)^n
        Double pV = p;
        Double value2 = (1 + rate);
        Double magicNumber = (p * Math.pow(value2, years));

        // Display the result with formatting
        System.out.println("The future value of the investment is:", magicNumber);
    }
}
