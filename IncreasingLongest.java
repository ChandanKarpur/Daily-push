public class IncreasingLongest {
    public int longestIncreasing(int[] arr) {
        int length = 1;
        int maxLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                length++;
            } else {
                length = 1;
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        IncreasingLongest il = new IncreasingLongest();
        int[] arr = {1, 2, 3, 2, 5, 6};
        int result = il.longestIncreasing(arr);
        System.out.println("Length of longest increasing subarray: " + result);
    }
}
