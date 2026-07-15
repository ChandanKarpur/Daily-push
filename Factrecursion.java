import java.util.Scanner;
public class Factrecursion {
    int factorial(int n){

        if(n==1)
        return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n,f;
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.print("enter a number :");
        n=sc.nextInt();
        Factrecursion obj=new Factrecursion();
        f=obj.factorial(n);
        System.out.println("the factorial of a number is :"+f);
    }
}
