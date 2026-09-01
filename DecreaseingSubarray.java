public class DecreaseingSubarray {
    public int countDecreasing(int[] arr) {
        int count = 0;
        int length = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                length++;
            } else {
                length = 1;
            }

            count += length - 1;
        }

        return count;
    }
    public static void main(String[] args) {
        DecreaseingSubarray ds = new DecreaseingSubarray();
        int[] arr = {5, 4, 3, 7, 2};
        int result = ds.countDecreasing(arr);
        System.out.println("Number of decreasing subarrays: " + result);
    }
}