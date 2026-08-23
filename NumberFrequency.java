import java.util.Scanner;

public class NumberFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                count++;
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Number: " + search);
        System.out.println("Frequency: " + count);

        if (count > 0) {
            System.out.println("Number is present in the array.");
        } else {
            System.out.println("Number is not present in the array.");
        }

        sc.close();
    }
}
