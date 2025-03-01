import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Checking if the number is a natural number
        if (n >= 1) {
            // Computing sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Computing sum using for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            // Displaying results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumLoop);

            // Comparing the results
            if (sumFormula == sumLoop) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("There is an error in computation.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        sc.close();
    }
}
