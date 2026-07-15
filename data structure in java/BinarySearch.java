import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.print("enter the no. of elements: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        int start=0,end=n-1,mid=-1;
        System.out.println("enter the array elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("sorted array:"+Arrays.toString(arr));

        System.out.print("enter element to search :");
        int key=sc.nextInt();
        
        while(start<=end)
        {
            mid=(start+end)/2;
        if(arr[mid]==key){
            break;
        }
        else if(arr[mid]>key){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
        }

        if(arr[mid]==key)
        {
            System.out.println("element found ");
        }
        else
        {
            System.out.println("element is not found");
        }sc.close();
    }
}
