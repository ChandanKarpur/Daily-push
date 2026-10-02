import java.util.Scanner;
public class ValidCube {
    public boolean isPerfectSquare(int num){
        for (int i = 1; i <= num / i / i; i++) {
            if (i * i * i == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        ValidCube vs=new ValidCube();
        System.out.println(vs.isPerfectSquare(num));
        sc.close();
    }
}
