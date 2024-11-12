public class Ascend {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        // Generate three random numbers within the specified range
        int a = (int)(Math.random() * (max - min + 1) + min);
        int b = (int)(Math.random() * (max - min + 1) + min);
        int c = (int)(Math.random() * (max - min + 1) + min);

        // Sorting logic to print the numbers in ascending order
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else {
            if (a >= b) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}
