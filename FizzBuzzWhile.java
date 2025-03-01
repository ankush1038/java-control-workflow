import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is a positive integer
        if (number > 0) {
            int i = 1; // Initialize counter
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // Increment counter
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        sc.close();
    }
}
