import java.util.Scanner;
class Queue{
    int arr[];
    int size;
    int front=0;
    int rear=0;

    public void createQueue(int size){
        this.size=size;
        arr=new int[this.size];
        System.out.println("Queue created successfully :");
    }
    public void insert(int n){
        if((rear+1)%size==front){
            System.out.println("Queue is full/ Overflow :");
            return;
        }
        arr[rear]=n;
        rear=(rear+1)%size;
        System.out.println(n+" successfully inserted :");
    }
    public void delete(){
        if(front==rear){
            System.out.println("Queue is empty/ Underflow :");
            return;
        }
        front=(front+1)%size;
        System.out.println("delete successfully :");
    }
    public void display(){
        if(front==rear){
            System.out.println("nothing to display :");
            return;
        }
        for(int i=front;i!=rear;i=(i+1)%size){
            System.out.println(arr[i]);
        }
    }
}
public class CircularQueue {
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
                    System.out.println("Enter the number to insert :");
                    num=sc.nextInt();
                    obj.insert(num);
                    break;
                case 3:
                    System.out.println("Deleting element from queue...");
                    obj.delete();
                    break;
                case 4:
                    System.out.println("Elements in the queue:");
                    obj.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }while(choice!=5);
        sc.close();
    }
    
}
