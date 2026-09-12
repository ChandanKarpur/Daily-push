import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp=number;

        while (temp>9) {
            int sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            temp = sum;
        }
        if (temp==1) {
            System.out.println("The number is a magic number.");
        }else {
            System.out.println("The number is not a magic number.");
        }
    }
}
