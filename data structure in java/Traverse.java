import java.util.Scanner;
public class Traverse {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int n,i;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of elements:");
        n=sc.nextInt();
        System.out.println("enetr array elements:");
        for (i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("the elements are:");
        for (i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }sc.close(); 

    }    
}