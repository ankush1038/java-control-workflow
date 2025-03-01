import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Finding the youngest friend
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Taking user input for heights
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();

        // Finding the tallest friend
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        // Finding factors of a number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
