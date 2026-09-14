import java.util.Scanner;
public class PronicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        boolean isPronic = false;
        for (int i = 0; i <= n; i++) {
            if (i * (i + 1) == n) {
                isPronic = true;
                break;
            }
        }
        if (isPronic) {
            System.out.println(n + " is a Pronic Number.");
        } else {
            System.out.println(n + " is not a Pronic Number.");
        }
    }
}
