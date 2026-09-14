import java.util.Scanner;
public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n % 7 == 0 || n % 10 == 7) {
            System.out.println(n + " is a Buzz Number.");
        } else {
            System.out.println(n + " is not a Buzz Number.");
        }
    }
}
