// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        // Ensure the user provides a time in "hh:mm" format
        if (args.length == 0) {
            System.out.println("Please provide a time in the format hh:mm.");
            return;
        }

        // Extract hour and minute from the input string
        int hour = Integer.parseInt(args[0].split(":")[0]);
        int minute = Integer.parseInt(args[0].split(":")[1]);

        // Determine AM or PM period based on the hour
        String period = hour >= 12 ? "PM" : "AM";

        // Convert 24-hour format to 12-hour format
        hour = hour % 12 == 0 ? 12 : hour % 12;

        // Display time in 12-hour format with leading zero for minutes
        System.out.printf("%d:%02d %s%n", hour, minute, period);
    }
}
