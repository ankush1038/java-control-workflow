import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = sc.nextInt();

        // Checking if service is more than 5 years
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // 5% bonus calculation
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }

        sc.close();
    }
}
