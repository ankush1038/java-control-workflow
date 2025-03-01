import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is positive
        if (number > 1) {
            int greatestFactor = 1;

            // Loop to find the greatest factor excluding the number itself
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Stop at the first (largest) factor found
                }
            }

            // Display the result
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("The number " + number + " is not valid for finding factors.");
        }

        sc.close();
    }
}
