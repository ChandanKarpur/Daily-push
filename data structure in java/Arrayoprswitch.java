import java.util.Scanner;
public class Arrayoprswitch {
    public static void main(String[] args) {
        int a[]=null;
        int n=0,i,choice;
        int pos,value;
        Scanner sc=new Scanner(System.in);

        do{ 
            System.out.println("\n---MENU---");
            System.out.println("1. create array");
            System.out.println("2. traverse array");
            System.out.println("3. insertion");
            System.out.println("4. deletion");
            System.out.println("5. exit");
            System.out.print("enter your choice:");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("enter the number of elements:");
                    n=sc.nextInt();
                    a=new int[100];
                    System.out.println(" array of size "+n+" created.\nenter array elements:");
                    for (i = 0; i < n; i++)
                    {
                        a[i]=sc.nextInt();
                    }
                    break;
                case 2:
                    if(a==null){
                        System.out.println("array not created yet.plese create an array first :");
                    }
                    else{
                    System.out.println("the elements are:");
                        for (i = 0; i < n; i++)
                        {
                            System.out.println(a[i]);
                        }
                    }    
                    break;
                case 3:
                    System.out.print("enetr the position:");
                    pos=sc.nextInt();
                    System.out.print("enter the value:");
                    value=sc.nextInt();

                    for(i=n;i>=pos;i--)
                    {
                        a[i]=a[i-1];
                    }
                    a[pos-1]=value;
                    n++;

                    System.out.println("after insertion:");
                    for (i = 0; i < n; i++)
                    {
                        System.out.println(a[i])  ;
                    }
                    System.out.println("array element insert successfully.");
                    break;
                case 4:
                    System.out.print("enter the position:");
                    pos=sc.nextInt();
                
                    for(i=pos-1;i<n-1;i++)
                    {
                        a[i]=a[i+1];
                    }
                    n--;

                    System.out.println("after deletion:");
                    for (i = 0; i < n; i++)
                    {
                        System.out.println(a[i])  ;
                    }
                    System.out.println("array element delete successfully.");
                    break;
                case 5:
                    System.out.println("exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
                break;
            }
        }while(choice !=5);
        sc.close();  
    }
}
