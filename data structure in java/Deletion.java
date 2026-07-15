import java.util.Scanner;
public class Deletion {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int[] arr=new int[10];
        int n,i,pos;

        System.out.print("eneter the number of elements:");
        n=sc.nextInt();
        System.out.println("enetr the elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("enter the position:");
        pos=sc.nextInt();

        for(i=pos-1;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
        
        System.out.println("after deletion:");
        for(i=0;i<n-1;i++)
        {
            System.out.println(arr[i]);
        }sc.close();        
    }
}
