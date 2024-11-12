// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		
		int hour = Integer.parseInt(args[0].split(":")[0]);

		int minute = Integer.parseInt(args[0].split(":")[1]);

		String period = hour >= 12 ? "PM" : "AM";

		hour = hour % 12 == 0 ? 12 : hour % 12;  // Switches from 24hr to 12 hr format

		System.out.printf("%d:%02d %s%n", hour, minute, period);  // prints hour without a zero but minute with 2 digits

	}
}