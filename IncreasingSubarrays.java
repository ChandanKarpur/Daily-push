public class IncreasingSubarrays {
    public int countIncreasingSubarrays(int[] arr) {
        int count = 0;
        int length = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                length++;
            } else {
                length = 1;
            }

            // Number of increasing subarrays ending at i
            // of size >= 2
            count += length - 1;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 7, 9};
        IncreasingSubarrays increasingSubarrays = new IncreasingSubarrays();
        int result = increasingSubarrays.countIncreasingSubarrays(arr);
        System.out.println("Number of increasing subarrays: " + result);
    }
}
