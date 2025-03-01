import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using 'sc' for Scanner variable

        // Step 1: Get user input
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next(); // Operator as string input

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        double result = 0; // Variable to store result

        // Step 2: Perform operation using switch...case
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) { // Avoid division by zero
                    result = first / second;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator!");
                sc.close();
                return;
        }

        // Step 3: Print result
        System.out.println("Result: " + result);

        sc.close(); // Close scanner
    }
}
