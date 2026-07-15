class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList{
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            return;
        }

        temp.next = newNode;
        System.out.println("node inserted");
    }

    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
public class LinkedListOperation {
    public static void main(String[] args){
        SinglyLinkedList obj = new SinglyLinkedList();

        obj.insertAtBeginning(10);
        obj.insertAtEnd(20);
        obj.deleteAtBeginning();
        obj.deleteAtEnd();
        System.out.println("Linked List is :");
        obj.display(); 
    }
}
