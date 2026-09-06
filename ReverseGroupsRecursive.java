import java.util.Scanner;

public class ReverseGroupsRecursive {

    static void reverse(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

    static void reverseGroups(int[] arr, int k, int index) {

        if (index >= arr.length) {
            return;
        }

        int end = Math.min(index + k - 1, arr.length - 1);

        reverse(arr, index, end);

        reverseGroups(arr, k, index + k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if (k <= 0) {
            System.out.println("Invalid k.");
        } else {

            reverseGroups(arr, k, 0);

            System.out.println("Output:");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
