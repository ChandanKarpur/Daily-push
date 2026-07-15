import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSwitch {
    static Node head=null;
    
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

    public static void main(String[] args){
        LinkedListSwitch obj = new LinkedListSwitch();
        int choice;
        int num;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("=====MENU=====");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete at Beginning");
            System.out.println("4. Delete at End");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("Enter your choice :");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert at beginning:");
                    num=sc.nextInt();
                    obj.insertAtBeginning(num);
                    break;
                case 2:
                    System.out.println("Enter the element to insert at end:");
                    num=sc.nextInt();
                    obj.insertAtEnd(num);
                    break;
                case 3:
                    System.out.println("Deleting element from beginning...");
                    obj.deleteAtBeginning();
                    break;
                case 4:
                    System.out.println("Deleting element from end...");
                    obj.deleteAtEnd();
                    break;
                case 5:
                    System.out.println("Linked List is :");
                    obj.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }sc.close();
        } while (choice != 6);
    }
}
