import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 4.50;
        } 
        else if (units <= 200) {
            bill = (100 * 4.50) + ((units - 100) * 8.00);
        } 
        else if (units <= 300) {
            bill = (100 * 4.50) +
                   (100 * 8.00) +
                   ((units - 200) * 5.50);
        } 
        else {
            bill = (100 * 4.50) +
                   (100 * 8.00) +
                   (100 * 5.50) +
                   ((units - 300) * 7.00);
        }

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.printf("Total Bill: ₹%.2f%n", bill);

        sc.close();
    }
}
