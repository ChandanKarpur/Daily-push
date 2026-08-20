import java.util.Scanner;

public class LibraryManagement {
    static String[] books = {
        "Java Programming",
        "Data Structures",
        "Database Management",
        "Computer Networks",
        "Machine Learning"
    };

    static boolean[] issued = new boolean[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayBooks();
                    break;

                case 2:
                    displayBooks();
                    System.out.print("Enter book number to issue: ");
                    int issueBook = sc.nextInt();

                    if (issueBook >= 1 && issueBook <= 5) {
                        if (!issued[issueBook - 1]) {
                            issued[issueBook - 1] = true;
                            System.out.println("Book issued successfully!");
                        } else {
                            System.out.println("Book is already issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 3:
                    displayBooks();
                    System.out.print("Enter book number to return: ");
                    int returnBook = sc.nextInt();

                    if (returnBook >= 1 && returnBook <= 5) {
                        if (issued[returnBook - 1]) {
                            issued[returnBook - 1] = false;
                            System.out.println("Book returned successfully!");
                        } else {
                            System.out.println("This book was not issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Library System!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }

    static void displayBooks() {
        System.out.println("\n----- Available Books -----");

        for (int i = 0; i < books.length; i++) {
            System.out.print((i + 1) + ". " + books[i]);

            if (issued[i]) {
                System.out.println(" - Issued");
            } else {
                System.out.println(" - Available");
            }
        }
    }
}
