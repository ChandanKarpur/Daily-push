public class MergeSort {
    public static void mergeSort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;

            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }
    public static void merge(int arr[], int lb, int mid, int ub) {
        int i = lb, j = mid + 1, k = lb;
        int temp[] = new int[arr.length];
        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i > mid) {
            while (j <= ub) {
                temp[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;

        MergeSort.mergeSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // MergeSort.printArray(arr);
    }
}
