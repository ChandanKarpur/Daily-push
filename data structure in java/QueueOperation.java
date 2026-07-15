import java.util.Scanner;
class Queue{
    int arr[];
    int size;
    int end=0;

    public void createQueue(int size){
        this.size=size;
        arr=new int[this.size];
        System.out.println("Queue created successfully :");
    }
    public void insert(int n){
        if(end==size){
            System.out.println("Queue is full/ Overflow :");
            return;
        }
        arr[end]=n;
        end++;
        System.out.println(n+" successfully inserted :");
    }
    public void delete(){
        if(end==0){
            System.out.println("Queue is empty/ Underflow :");
            return;
        }
        for(int i=0;i<end-1;i++){
            arr[i]=arr[i+1];
        }
        end--;
        System.out.println("delete successfully :");
    }
    public void display(){
        if(end==0){
            System.out.println("nothing to display :");
            return;
        }
        for(int i=0;i<end;i++){
            System.out.println(arr[i]);
        }
    }
}
public class QueueOperation {
    public static void main(String[] args) {
        int choice;
        int num;
        Queue obj = new Queue();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("=====MENU=====");
            System.out.println("1. Create Queue");
            System.out.println("2. Insert element");
            System.out.println("3. Delete element");
            System.out.println("4. Display elements");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the size of queue :");
                    num=sc.nextInt();
                    obj.createQueue(num);
                    break;
                case 2:
                    System.out.println("Enter the element to insert :");
                    num=sc.nextInt();
                    obj.insert(num);
                    break;
                case 3:
                    System.out.println("Deleting element from queue...");
                    obj.delete();
                    break;
                case 4:
                    System.out.println("Elements in the queue are:");
                    obj.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice!=5);
        sc.close();
    }
}
