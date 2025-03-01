import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking countdown start value from the user
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Displaying launch message
        System.out.println("Lift-off");

        sc.close();
    }
}
