//WAP a java program to create a node and print the element.
class Node{
    int data;
    Node next;
    
    Node(int data){     //constructor
        this.data=data;
        this.next=null;
    }
}    
public class LinkedList {
    
    public static void main(String[] args) {
        Node obj = new Node(10);
        Node obj1 = new Node(20);
        obj.next=obj1;  //linking first node to second node.
        System.out.println("Data in the first node is : "+obj.data);
        System.out.println("first node address :"+obj.next);
        System.out.println("Data in the second node is : "+obj1.data);
        System.out.println("second node address :"+obj1.next);
    }
}
