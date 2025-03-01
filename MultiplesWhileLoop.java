import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Checking if the number is a valid positive integer and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 99; // Start from 99 and move down
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter); // Print the multiple
                }
                counter--; // Decrement counter
            }
        } else {
            System.out.println("Invalid input! Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}
