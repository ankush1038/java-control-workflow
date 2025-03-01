import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is greater than 1
        if (number > 1) {
            int greatestFactor = 1;
            int counter = number - 1; // Start from number - 1

            // Using while loop to find the greatest factor excluding itself
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // Stop at the first (largest) factor found
                }
                counter--; // Decrement counter
            }

            // Display the result
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("The number " + number + " is not valid for finding factors.");
        }

        sc.close();
    }
}
