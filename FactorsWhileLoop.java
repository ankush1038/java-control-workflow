import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is positive
        if (number > 0) {
            System.out.print("Factors of " + number + " are: ");
            int i = 1; // Counter variable
            
            // Using while loop to find factors
            while (i <= number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++; // Increment counter
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        sc.close();
    }
}
