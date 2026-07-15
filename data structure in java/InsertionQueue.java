import java.util.Scanner;

class Queue{
    int arr[];
    int end;
    public void createQueue(int size){
        arr=new int[size];
        end=0;
        System.out.println("Queue created successfully :");
    }
    public void insert(int n){
        if(end==arr.length){
            System.out.println("Queue is full/ Overflow :");
            return;
        }
            arr[end]=n;
            end++;
            System.out.println("Element successfully inserted :");
    }
    public void display(){
        if(end==0){
            System.out.println("Queue is empty :");
            return;
        }
        System.out.println("Queue elements are :");
        for(int i=0;i<end;i++){
            System.out.println(arr[i]);
        }
    }
}
public class InsertionQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue obj=new Queue();

        System.out.println("Enter the size of queue :");
        int size=sc.nextInt();
        obj.createQueue(3);
        System.out.println("Enter the elements to insert :");
    
        for(int i=0;i<size;i++){
            int num=sc.nextInt();
            obj.insert(num);
        }
        obj.display();
    }
}
