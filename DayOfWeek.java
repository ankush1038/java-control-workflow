import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object

        // Taking input for day, month, and year
        System.out.print("Enter day (d): ");
        int d = sc.nextInt();

        System.out.print("Enter month (m): ");
        int m = sc.nextInt();

        System.out.print("Enter year (y): ");
        int y = sc.nextInt();

        // Step 1: Compute y0
        int y0 = y - (14 - m) / 12;

        // Step 2: Compute x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Compute m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Compute d0
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Mapping d0 to day names
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Display the result
        System.out.println("Day of the week: " + days[d0]);

        sc.close(); // Close scanner
    }
}
