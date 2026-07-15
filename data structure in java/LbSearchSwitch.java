import java.util.Arrays;
import java.util.Scanner;
public class LbSearchSwitch {
    public static void main(String[] args) {
        int n,i,choice;
        int key,pos=-1;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements:");
        for (i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }


        do{   System.out.println("\n---MENU---");
            System.out.println("1. linear search");
            System.out.println("2. binary search");
            System.out.println("3. exit");
            System.out.print("enter your choice:");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("enter element to search :");
                    key=sc.nextInt();
                    for(i=0;i<n;i++){
                    if(a[i]==key){
                        pos=i;
                        }
                    }
                    
                    if(pos!=-1){
                        System.out.println("element is found at position :"+(pos+1));
                    }
                    else{
                        System.out.println("element not found"); 
                    }
                    break;
                
                case 2:
                    Arrays.sort(a);
                    System.out.println("sorted array:"+Arrays.toString(a));

                    System.out.print("enter element to search :");
                    key=sc.nextInt();
                    int start=0,end=n-1,mid=-1;

                    while(start<=end){
                        mid=(start+end)/2;
                    if(a[mid]==key){
                        break;
                    }
                    else if(a[mid]>key){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                    }

                    if(a[mid]==key){
                        System.out.println("element found ");
                    }
                    else{
                        System.out.println("element is not found");
                    }
                    break;

                case 3:
                    System.out.println("exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice !=3);
        sc.close();
    }
}    

