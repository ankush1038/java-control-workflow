import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using 'sc' as the Scanner variable

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Prime numbers are greater than 1
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) { // If divisible, it's not a prime
                    isPrime = false;
                    break; // Exit loop early
                }
            }
        }

        // Displaying result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        sc.close(); // Closing scanner
    }
}
