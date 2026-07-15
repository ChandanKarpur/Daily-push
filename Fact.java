import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        int n,i,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }

        System.out.println("the factorial of a number is :"+f);
    }
}
