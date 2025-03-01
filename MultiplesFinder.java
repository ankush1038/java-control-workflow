import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Checking if the number is a valid positive integer and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop from 100 down to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i); // Print the multiple
                }
            }
        } else {
            System.out.println("Invalid input! Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}
