import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sumOfDigits = 0;
        int temp = n;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        if (n % sumOfDigits == 0) {
            System.out.println(n + " is a Harshad Number.");
        } else {
            System.out.println(n + " is not a Harshad Number.");
        }
    }
}