import java.util.Scanner;

public class ReverseGroups {

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void reverseGroups(int[] arr, int k) {

        for (int i = 0; i < arr.length; i += k) {

            int end = Math.min(i + k - 1, arr.length - 1);

            reverse(arr, i, end);
        }
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
            System.out.println("Invalid value of k.");
        } else {

            reverseGroups(arr, k);

            System.out.println("Output:");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
