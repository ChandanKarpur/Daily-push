import java.util.*;
public class LbSearchFun {
    int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public int binary(int arr[],int key){
        int start=0,end=arr.length-1,mid=-1;

        while(start<=end)
        {
            mid=(start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
        }
        return -1;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        LbSearchFun obj = new LbSearchFun();
        int arr[]= {10,20,30,40,50};
        System.out.println("Enter the key to search:");

        int key=sc.nextInt();
        int linresult=obj.linear(arr,key);
        if(linresult==-1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+linresult);
        }

        int binresult=obj.binary(arr,key);
        if(binresult==-1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+binresult); 
        }sc.close();
    }
}
