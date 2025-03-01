import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer as the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter a positive integer as the power: ");
        int power = sc.nextInt();

        // Checking if both numbers are positive integers
        if (number >= 0 && power >= 0) {
            int result = 1; // Initialize result
            int counter = 0; // Counter for tracking loop iterations

            // Using while loop to compute power
            while (counter < power) {
                result *= number; // Multiply result by number in each iteration
                counter++; // Increment counter
            }

            // Display result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Invalid input! Please enter positive integers only.");
        }

        sc.close();
    }
}
