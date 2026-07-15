import java.util.Scanner;

class Node{
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node traversal(Node root){
        if(root == null){
            return null;
        }
        System.out.println("Binary Search Tree created successfully!");
        System.out.println("root node: "+root.data);
        System.out.println("left node: "+root.left.data);
        System.out.println("right node: "+root.right.data);
        System.out.println("left of left node: "+root.left.left.data);
        System.out.println("left of right node: "+root.left.right.data);
        System.out.println("right of left node: "+root.right.left.data);
        System.out.println("right of right node: "+root.right.right.data);
        return root;
    }

    void insert(Node root, int data){
        if(data < root.data){
            if(root.left == null){
                root.left = new Node(data);
            }else{
                insert(root.left, data);
            }
        }else{
            if(root.right == null){
                root.right = new Node(data);
            }else{
                insert(root.right, data);
            }
        }
    }

    void deletion(Node root, int data){
        if(root == null){
            return;
        }
        if(data < root.data){
            deletion(root.left, data);
        }else if(data > root.data){
            deletion(root.right, data);
        }else{
            if(root.left == null && root.right == null){
                root = null;
            }else if(root.left == null){
                root = root.right;
            }else if(root.right == null){
                root = root.left;
            }else{
                Node temp = findMin(root.right);
                root.data = temp.data;
                deletion(root.right, temp.data);
            }
        }
    }

    Node findMin(Node root){
        if(root.left == null){
            return root;
        }
        return findMin(root.left);
    }

    void search(Node root, int data){
        if(root == null){
            System.out.println("Data not found in the tree!");
            return;
        }
        if(data < root.data){
            search(root.left, data);
        }else if(data > root.data){
            search(root.right, data);
        }else{
            System.out.println("Data found in the tree!");
        }
    }

}
public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        root.traversal(root);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter data to insert: ");
                    int dataInsert = sc.nextInt();
                    root.insert(root, dataInsert);
                    System.out.println("Data inserted successfully!");
                    break;
                case 2:
                    System.out.print("Enter data to delete: ");
                    int dataDelete = sc.nextInt();
                    root.deletion(root, dataDelete);
                    System.out.println("Data deleted successfully!");
                    break;
                case 3:
                    System.out.print("Enter data to search: ");
                    int dataSearch = sc.nextInt();
                    root.search(root, dataSearch);
                    break;
                case 4:
                    System.out.println("Traversal:");
                    root.traversal(root);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }while(true);

    }
}
