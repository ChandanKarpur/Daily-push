import java.util.Scanner;

public class GCDLCM {

    static int findGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    static int findLCM(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("GCD and LCM cannot be calculated for zero.");
        } else {

            int gcd = findGCD(Math.abs(a), Math.abs(b));
            int lcm = findLCM(a, b, gcd);

            System.out.println("\n===== RESULT =====");
            System.out.println("GCD = " + gcd);
            System.out.println("LCM = " + lcm);
        }

        sc.close();
    }
}