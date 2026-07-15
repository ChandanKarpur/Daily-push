public class QuickSort {
    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }

    public static int partition(int arr[], int lb, int up) {
        int pivot = arr[lb];
        int start = lb;
        int end = up;

        while(start<end) {
            while (start <= up && arr[start] <= pivot) {
                start++;
            }
            while (end >= lb && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp=arr[lb];
        arr[lb]=arr[end];
        arr[end] = temp;
        return end;
    }
    public static void main(String[] args) {
        int arr[] = {7,6,10,5,9,2,1,15,7};
        int n = arr.length;
        int pivot = 7;

        QuickSort.quickSort(arr, 0, n - 1);

        System.out.println("sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
