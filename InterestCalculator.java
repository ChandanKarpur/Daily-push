import java.util.Scanner;

public class InterestCalculator {

    static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    static double compoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== INTEREST CALCULATOR =====");

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time in Years: ");
        double time = sc.nextDouble();

        if (principal <= 0 || rate < 0 || time <= 0) {
            System.out.println("Invalid input.");
        } else {

            double si = simpleInterest(principal, rate, time);
            double ci = compoundInterest(principal, rate, time);

            System.out.println("\n===== RESULT =====");
            System.out.println("Principal          :" + principal);
            System.out.println("Simple Interest    :" + si);
            System.out.println("Simple Amount      :" + (principal + si));
            System.out.println("Compound Interest  :" + ci);
            System.out.println("Compound Amount    :" + (principal + ci));
        }

        sc.close();
    }
}
