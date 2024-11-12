// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // Convert the 1st argument to int, which is assumed to be the bill amount
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

        Double bill = Double.parseDouble(args[3]);
        Double totalPer = bill / 3;
		Double rounder = totalPer*10

		int billR = int.parseInt(args[3]);
		
		if (rounder % 10 > 0){
			billR == billR + 1;
		}
        
        System.out.println("Dear c, b, and a: pay " billR + ".0");
    }
}
