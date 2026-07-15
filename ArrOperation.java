import java.util.Scanner;
public class ArrOperation {
    int sum(int arr[]){
        int sum=0;
       for (int i : arr) {
        sum=sum+i;
       }
       return sum;
       
    }

    int avg(int arr[]){
        int sum=0;
        for (int i : arr) {
          sum=sum+i;  
        }
        return sum/arr.length;
    }

    int findmax(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>=max){
                max=i;
            }
        }
        return max;
    }

    int findmin(int arr[]){
        int min=Integer.MAX_VALUE;
        for (int i : arr) {
            if(i<=min){
                min=i;
            }
        }
        return min;
    }
    public static void main(String[] args) {
       int n,i;
       int arr[]=new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the no. of elements: ");
       n=sc.nextInt();
       System.out.println("enter the array elements: ");
       for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }sc.close();

       ArrOperation obj= new ArrOperation();
       System.out.println("sum is: "+obj.sum(arr));
       System.out.println("average is: "+obj.avg(arr));
       System.out.println("maximum is: "+obj.findmax(arr));
       System.out.println("minimum is: "+obj.findmin(arr));
    }
}

    
    

