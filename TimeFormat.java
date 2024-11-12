public class TimeFormat {
    public static void main(String[] args) {
        // Extract hour and minute from the input string
        int hour = Integer.parseInt(args[0].split(":")[0]);
        int minute = Integer.parseInt(args[0].split(":")[1]);
        
        // Determine AM or PM period based on the hour
        String period = "";
        if (hour >= 13){
            period = "PM";
            hour = hour - 12;
        } else if (hour == 0){
            hour = 0;
        } else {
            period = "AM";
        }
        // Display the time in 12-hour format with proper AM/PM and minutes
        if (hour == 0 && period.equals("AM") && minute == 0) {
            // Special case for "00:00" to display as "0:00 AM"
            System.out.println("0:"+ minute + " AM");
        } else {
            System.out.println(hour + ":" + minute + " " + period);
        }
    }
}
