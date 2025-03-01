import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Checking if the number is a natural number (>= 0)
        if (n >= 0) {
            long factorial = 1; // Initializing factorial result

            // Computing factorial using for loop
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Displaying the result
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        sc.close();
    }
}
