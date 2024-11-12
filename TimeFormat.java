public class TimeFormat {
    public static void main(String[] args) {
        // Extract hour and minute from the input string
        int hour = Integer.parseInt(args[0].split(":")[0]);
        int minute = Integer.parseInt(args[0].split(":")[1]);

        // Determine AM or PM period based on the hour
        String period = (hour >= 12) ? "PM" : "AM";

        // Convert 24-hour format to 12-hour format
        if (hour == 0) {
            hour = 0;  // Midnight is 12 AM
        } else if (hour > 12) {
            hour = hour - 12;  // Convert hours after noon
        }

        // Display the time in 12-hour format with proper AM/PM
        System.out.printf("%d:%02d %s%n", hour, minute, period);
    }
}
