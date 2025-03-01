import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing total sum variable
        double total = 0.0;

        while (true) { // Infinite loop
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            // If the number is 0 or negative, break the loop
            if (number <= 0) {
                break;
            }

            // Add the input to the total
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        sc.close();
    }
}
