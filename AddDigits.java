import java.util.Scanner;
public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("Add the digits of the number is :"+0);
        }
        else if(num%9==0){
            System.out.println("Add the digits of the number is :"+9);
        }
        else{
        System.out.println("Add the digits of the number is :"+num%9);
        }
    }
}
