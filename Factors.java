import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is a positive integer
        if (number > 0) {
            System.out.print("Factors of " + number + " are: ");
            // Loop to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        sc.close();
    }
}
