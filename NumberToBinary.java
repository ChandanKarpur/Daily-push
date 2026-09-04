import java.util.Scanner;

public class NumberToBinary {

    static void convertToBinary(int n) {

        if (n == 0) {
            System.out.println("Binary = 0");
            return;
        }

        String binary = "";

        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        System.out.println("Binary = " + binary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            convertToBinary(number);
        }

        sc.close();
    }
}