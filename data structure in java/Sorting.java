import java.util.Scanner;
public class Sorting {
    public static void main(String []args){
        int arr[]=new int[10];
        int n,i,j,temp;
        Scanner sc=new Scanner(System.in);

        System.out.print("enetr the no. of elements:");
        n=sc.nextInt();
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("after sorting the array elements:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }sc.close();
    }
}
