import java.util.Scanner;

public class ATM {
    static double balance = 10000.00;
    static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("        WELCOME TO ATM");
        System.out.println("================================");

        // PIN Verification
        int attempts = 0;
        boolean login = false;

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == PIN) {
                login = true;
                System.out.println("Login Successful!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN!");

                if (attempts < 3) {
                    System.out.println("Attempts remaining: " + (3 - attempts));
                }
            }
        }

        if (!login) {
            System.out.println("Too many incorrect attempts.");
            System.out.println("Your account is temporarily blocked.");
            sc.close();
            return;
        }

        // ATM Menu
        int choice;

        do {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf("Available Balance: ₹%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf(
                            "₹%.2f deposited successfully.%n", deposit);
                        System.out.printf(
                            "New Balance: ₹%.2f%n", balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.printf(
                            "Please collect your cash: ₹%.2f%n", withdraw);
                        System.out.printf(
                            "Remaining Balance: ₹%.2f%n", balance);
                    }
                    break;

                case 4:
                    System.out.println("\n======= MINI STATEMENT =======");
                    System.out.println("Account Type : Savings");
                    System.out.printf("Balance      : ₹%.2f%n", balance);
                    System.out.println("==============================");
                    break;

                case 5:
                    System.out.println("\nThank you for using our ATM!");
                    System.out.println("Please collect your card.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}