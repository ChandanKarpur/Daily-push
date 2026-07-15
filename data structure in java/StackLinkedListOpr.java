class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    
class StackLinkedList{
    Node top;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;
    }

    void pop(){
        if(top==null){
            System.out.println("Stack is underflow :");
        }
        else{
            System.out.println(top.data);
            top=top.next;
        }
    }

    void display(){
        if(top==null){
            System.out.println("Nothing to display :");
        }
        else{
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    
}
public class StackLinkedListOpr {
    public static void main(String[] args) {
        StackLinkedList obj = new StackLinkedList();
        System.out.println("Stack elements are :");
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.display();
        System.out.println("Popped element is :");
        obj.pop();
        System.out.println("Stack elements after pop operation :");
        obj.display();
    }
}

