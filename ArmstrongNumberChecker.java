import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using 'sc' as the Scanner variable

        // Step 1: Get integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum variable and store the original number
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use while loop till originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Step 4: Extract last digit
            int digit = originalNumber % 10;

            // Step 5: Cube the digit and add to sum
            sum += (digit * digit * digit);

            // Step 6: Remove last digit from originalNumber
            originalNumber /= 10;
        }

        // Step 7: Check if sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close(); // Closing scanner
    }
}
