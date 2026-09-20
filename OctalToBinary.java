import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        int octal = sc.nextInt();
        int binary = 0;
        int place = 1;
        while (octal > 0) {
            int digit = octal % 10;
            // Convert octal digit to 3 binary bits
            int b1 = digit % 2;
            digit = digit / 2;
            int b2 = digit % 2;
            digit = digit / 2;
            int b3 = digit % 2;
            binary = binary + (b1 * place);
            place = place * 10;
            binary = binary + (b2 * place);
            place = place * 10;
            binary = binary + (b3 * place);
            place = place * 10;
            octal = octal / 10;
        }
        System.out.println("Binary = " + binary);
    }
}
