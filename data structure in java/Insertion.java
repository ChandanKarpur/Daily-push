import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int n,i,pos,value;

        System.out.print("enter the number of elements:");
        n=sc.nextInt();
        System.out.println("enter array elements:");
        for (i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("enter the position:");
        pos=sc.nextInt();
        System.out.print("enter the value:");
        value=sc.nextInt();

        for(i=n;i>=pos;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[pos-1]=value;
            n++;

        System.out.println("after insertion:");
        for (i = 0; i < n; i++)
        {
            System.out.println(arr[i])  ;
        }sc.close();
    }
}
