import java.util.Scanner;
public class LinearSearch {
    public static void main(String[]args){
        int arr[]=new int[10];
        int n,i,key,pos=-1;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of element :");
        n=sc.nextInt();
        System.out.println("enter array elements:");
        for (i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("enter element to search :");
        key=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==key){
                pos=i;
                break;
            }
        }

        if(pos!=-1)
        {
            System.out.println("element is found at position :"+(pos+1));
        }
        else
        {
           System.out.println("element not found"); 
        }sc.close();

    }
}
