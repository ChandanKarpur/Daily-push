import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();
        int octal = 0;
        int place = 1;
        while (binary > 0) {
            // Take 3 binary digits
            int group = binary % 1000;
            int decimal = 0;
            int power = 1;
            // Convert the 3 binary digits to one octal digit
            while (group > 0) {
                int digit = group % 10;
                decimal = decimal + digit * power;
                power = power * 2;
                group = group / 10;
            }
            octal = octal + decimal * place;
            place = place * 10;
            binary = binary / 1000;
        }
        System.out.println("Octal = " + octal);
    }
}
