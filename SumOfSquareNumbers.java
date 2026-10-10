import java.util.*;
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        SumOfSquareNumbers obj = new SumOfSquareNumbers();
        boolean result = obj.judgeSquareSum(c);
        System.out.println(result);
        sc.close();
    }
}