import java.util.Scanner;

class Node {
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
        System.out.println("root node: "+root.data);
        System.out.println("left node: "+root.left.data);
        System.out.println("right node: "+root.right.data);
        System.out.println("left of left node: "+root.left.left.data);
        System.out.println("left of right node: "+root.left.right.data);
        System.out.println("right of left node: "+root.right.left.data);
        System.out.println("right of right node: "+root.right.right.data);
        return root;
    }

    void preOrder(Node root){
        if(root == null){
            return;    
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right); 
    }

    void  inOrder(Node root){
        if(root == null){
            return;    
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);  
    }

    void postOrder(Node root){
        if(root == null){
            return;    
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }    
}
public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        root.traversal(root);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("------MENU------");
            System.out.println("1- Preorder Traversal: ");
            System.out.println("2- Inorder Traversal: ");
            System.out.println("3- Postorder Traversal: ");
            System.out.println("4- Exit: ");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Preorder Traversal:");
                    root.preOrder(root);
                    break;
                case 2:
                    System.out.println("Inorder Traversal:");
                    root.inOrder(root);
                    break;
                case 3:
                    System.out.println("Postorder Traversal:");
                    root.postOrder(root);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }while(root != null);
        sc.close();
    }
}
