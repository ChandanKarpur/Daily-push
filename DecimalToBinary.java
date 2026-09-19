import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        int binary = 0;
        int place = 1;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary + remainder * place;
            place = place * 10;
            decimal = decimal / 2;
        }
        System.out.println("Binary = " + binary);
        sc.close();
    }
}
