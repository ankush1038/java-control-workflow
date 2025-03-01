import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Checking if the number is positive
        if (n >= 0) {
            long factorial = 1; // Initializing factorial result
            int i = 1;

            // Computing factorial using while loop
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Displaying the result
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        sc.close();
    }
}
