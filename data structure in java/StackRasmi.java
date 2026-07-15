import java.util.Scanner;
class StackOperation{
    int arr[];
    int size;
    int top=-1;

    public void  createArray(int size){
        this.size=size;
        arr=new int[this.size];
        System.out.println("Array create sucessfully :");
    }
    //push operation
    public int Push(int n){
        if(top==size-1){
            System.out.println("stack is full/ Overflow :");
            return -1; 
        }
        top++;
        arr[top]=n;
        System.out.println(n  +"successfully push");
        return -1;
    }
    //pop operation 
    public int Pop(){
        if(top==-1){
            System.out.println("stack is empty/ Underflow :");
            return -1;
        }
        System.out.println("pop is successfull");
        return arr[top--];
    }
    //peek operation
    public int Peek(){
        if(top==-1){
            System.out.println("stack is empty/ Underflow :");
            return -1;
        }
        else{
            System.out.println("peek element :"+arr[top]);
            return -1;
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("nothing to display :");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}
public class StackRasmi {
    public static void main(String[] args) {
        int choice;
        int num;
        StackOperation obj = new StackOperation();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("=====MENU=====");
            System.out.println("1. Create Array");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Peek");
            System.out.println("5. Display");
            System.out.println("6. Exit\n");
            System.out.println("Enter your choice :");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your array size :");
                    num=sc.nextInt();
                    obj.createArray(num);
                    break;
                case 2:
                    System.out.println("Enter the number to push :");
                    num=sc.nextInt();
                    obj.Push(num);
                    break;
                case 3:
                    System.out.println("Poped element is :"+obj.Pop());
                    break;
                case 4:
                    System.out.println("Peek element is :"+obj.Peek());
                    break;
                case 5:
                    System.out.println("Stack elements are :");
                    obj.display();
                    break;
                case 6:
                    System.out.println("Exit program :");
                    break;
                default:
                    System.out.println("Invalid choice :");
                    break;
            }

        }while(choice !=6); 
        sc.close();  
    }
}
