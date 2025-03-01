import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using 'sc' for Scanner variable

        // Step 1: Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum variable
        int sum = 0;

        // Step 3: Find divisors and calculate sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor
                sum += i; // Add divisor to sum
            }
        }

        // Step 4: Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        sc.close(); // Close the scanner
    }
}
