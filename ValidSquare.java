import java.util.Scanner;
public class ValidSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        for (int i = 1; i <= num / i; i++) {

            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        ValidSquare vs=new ValidSquare();
        System.out.println(vs.isPerfectSquare(num));
    }
}
