import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using 'sc' as the Scanner variable

        // Step 1: Get integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize count variable
        int count = 0;

        // Step 3: Handle the case when number is 0
        if (number == 0) {
            count = 1; // 0 has 1 digit
        } else {
            // Step 4: Use while loop until number becomes 0
            while (number != 0) {
                // Step 5: Remove last digit
                number /= 10;

                // Step 6: Increase count
                count++;
            }
        }

        // Step 7: Display the count
        System.out.println("Number of digits: " + count);

        sc.close(); // Closing scanner
    }
}
