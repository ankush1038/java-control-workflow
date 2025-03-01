import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking countdown start value from the user
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

        // Displaying launch message
        System.out.println("Lift-off! Rocket has launched!");

        sc.close();
    }
}
