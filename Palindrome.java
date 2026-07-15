import java.util.Scanner;
public class Palindrome {
    void palindromeCheck(int n){
        int org=n,rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==org)
        {
            System.out.println("the number is a palindrome number.");
        }
        else
        {
            System.out.println("the number ia not a palindrome numbner.");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        n=sc.nextInt();
        sc.close();
        Palindrome obj = new Palindrome();  //create object
        obj.palindromeCheck(n);             //function call through object
    }  
}
