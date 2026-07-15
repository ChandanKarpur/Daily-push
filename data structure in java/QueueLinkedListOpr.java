import java.util.Scanner;
public class QueueLinkedListOpr {
    Node front;
    Node rear;
    int data;
    public void createQueue(){
        front=null;
        rear=null;
        
    }
    public void insert(int value){
        data = value;
        Node newNode=new Node(data);
        if(front==null){
            front=rear=newNode;
            data++;
            System.out.println(newNode.data+" successfully inserted :");  
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to insert :");
        int n=sc.nextInt();
        QueueLinkedListOpr queue=new QueueLinkedListOpr();
        queue.insert(n);
        sc.close();
    }
}    