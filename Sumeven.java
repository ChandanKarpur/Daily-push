import java.util.Scanner;
public class Sumeven {
     int evenSum(int n){
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        n=sc.nextInt();
        sc.close();
        Sumeven obj=new Sumeven();
        int result=obj.evenSum(n);
        System.out.println("the sum of even numbers is :"+result);
    }
    
}
