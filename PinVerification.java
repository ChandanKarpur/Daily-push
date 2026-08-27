import java.util.Scanner;

public class PinVerification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 9178;
        int attempts = 0;
        boolean access = false;

        System.out.println("===== ATM PIN VERIFICATION =====");

        while (attempts < 3) {

            System.out.print("Enter your 4-digit PIN: ");
            int pin = sc.nextInt();

            attempts++;

            if (pin == correctPin) {
                access = true;
                System.out.println("PIN Verified Successfully!");
                System.out.println("Access Granted.");
                break;
            } else {
                System.out.println("Incorrect PIN.");

                if (attempts < 3) {
                    System.out.println(
                        "Attempts remaining: " + (3 - attempts)
                    );
                }
            }
        }

        if (!access) {
            System.out.println("Account temporarily locked.");
        }
        sc.close();
    }
}