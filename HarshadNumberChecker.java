import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using 'sc' for Scanner variable

        // Step 1: Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum variable and store original number
        int sum = 0;
        int originalNumber = number;

        // Step 3: Extract digits and calculate sum
        while (originalNumber > 0) {
            sum += originalNumber % 10; // Add last digit to sum
            originalNumber /= 10; // Remove last digit
        }

        // Step 4: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        sc.close(); // Close the scanner
    }
}
