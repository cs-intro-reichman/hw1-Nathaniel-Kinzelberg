// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // Convert the 1st argument to int, which is assumed to be the bill amount
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
        Double bill = Double.parseDouble(args[3]);
        Double totalPer = bill / 3;
        
        System.out.println("The total amount everyone needs to pay is " + totalPer + " per person.");
		System.out.println("This means that " + name1 + " " + name2 + " " + name3 + " will pay " + totalPer + "Shekel");
    }
}
