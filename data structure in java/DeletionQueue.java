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
    public void delete(){
        if(end==0){
            System.out.println("Queue is empty/ Underflow :");
            return;
        }
        System.out.println("Element deleted is : "+arr[0]);
        for(int i=0;i<end-1;i++){
            arr[i]=arr[i+1];
        }
        end--;
        System.out.println("Element successfully deleted :");
    }
}
public class DeletionQueue {
    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.createQueue(3);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.delete();
        obj.delete();
    }
}
