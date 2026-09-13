import java.util.Scanner;
public class SunnyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int nextNumber = n + 1;
        int sqrt = (int) Math.sqrt(nextNumber);
        if (sqrt * sqrt == nextNumber) {
            System.out.println(n + " is a Sunny Number.");
        } else {
            System.out.println(n + " is not a Sunny Number.");
        }
    }
}
