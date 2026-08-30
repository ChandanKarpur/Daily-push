import java.util.Scanner;

public class EqualSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {

            leftSum += arr[i];

            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                found = true;

                System.out.println("true");
                System.out.print("First Subarray: ");

                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }

                System.out.print("\nSecond Subarray: ");

                for (int j = i + 1; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }

                System.out.println();
                break;
            }
        }

        if (!found) {
            System.out.println("false");
            System.out.println("Array cannot be divided into two equal-sum subarrays.");
        }

        sc.close();
    }
}