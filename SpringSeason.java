import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking month and day as input from the user
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        // Checking if the given date falls in the Spring Season (March 20 - June 20)
        if ((month == 3 && day >= 20 && day <= 31) ||  // March 20 - 31
            (month == 4 && day >= 1 && day <= 30) ||   // April 1 - 30
            (month == 5 && day >= 1 && day <= 31) ||   // May 1 - 31
            (month == 6 && day >= 1 && day <= 20)) {   // June 1 - 20
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
