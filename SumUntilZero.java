import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing total sum variable
        double total = 0.0;
        double number;

        // Taking input and summing until the user enters 0
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        while (number != 0) {
            total += number; // Add the input to the total

            // Ask for the next input
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        sc.close();
    }
}
