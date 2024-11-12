// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // Convert the 1st argument to int, which is assumed to be the bill amount
        int bill = Integer.parseInt(args[0]);
        int totalPer = bill / 3;
        
        System.out.println("The total amount everyone needs to pay is " + totalPer + " per person.");
    }
}
