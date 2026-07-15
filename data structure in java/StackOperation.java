public class StackOperation {
    int arr[];
    int size;
    int top=-1;

    StackOperation(int size){
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
    //IsEmpty operation
    public boolean IsEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    //IsFull operation
    public boolean IsFull(){
        if(top==size-1){
            return true;
        }
        return false;
    }

    
    public static void main(String []args){
        StackOperation obj = new StackOperation(5);
        System.out.println(obj.IsEmpty());
        System.out.println(obj.IsFull());
        obj.Push(10);
        obj.Push(20);
        obj.Push(30);
        obj.Push(40);
        obj.Push(50);
        System.out.println("Deleted element : "+obj.Pop());
    }
    
}
