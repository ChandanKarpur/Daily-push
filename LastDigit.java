import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int lastDigit = number % 10;
        System.out.println("The last digit of " + number + " is: " + lastDigit);
        sc.close();
    }
    
}
