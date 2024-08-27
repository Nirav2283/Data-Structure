import java.util.Scanner;
class Node{
    int info;
    Node lptr;
    Node rptr;

    public Node(int data){
        this.lptr = null;
        this.rptr = null;
        this.info = data;
    }
}

class Tree{

    public Node root = null;

    public Node insert(Node root , int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        Node newNode = new Node(data);
        if(root.info > newNode.info){
            root.lptr = insert(root.lptr, data);
        }
        else if(root.info < newNode.info){
            root.rptr = insert(root.rptr , data);
        }
        return root;
    }

    public Boolean Search(Node root , int data){
        if(root == null){
            return false;
        }
        if(root.info == data){
            return true;
        }
        if(data > root.info){
            return Search(root.rptr , data);
        }else{
            return Search(root.lptr, data);
        }

    }

    public Node delete(Node root , int data){
        if(root.info > data){
            root.lptr = delete(root.lptr, data);
        }
        else if(root.info < data){
            root.rptr = delete(root.rptr, data);
        }
        else{
            //case 1
            if(root.lptr == null && root.rptr == null){
                return null;
            }
            if(root.lptr == null){
                return root.rptr;
            }
            else if(root.rptr == null){
                return root.lptr;
            }

            Node is = InorderSuccessor(root.rptr);
            root.info = is.info;
            root.rptr = delete(root.rptr, is.info);
        }
        return root;

       
    }

    public Node InorderSuccessor(Node root){
        while(root.lptr != null){
            root = root.lptr;
        }
        return root;

    }

    //display
    public void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.lptr);
        System.out.print(root.info + " ");
        inorder(root.rptr);

    }
}

public class BST{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();
        System.out.println("-----WELCOME TO THE PROGRAMME-----");
        System.out.println("1.ENTER ELEMENTS IN THE BST");
        System.out.println("2.TO SEARCH A NODE IN A BST");
        System.out.println("3.TO DELETE NODE FROM BST");
        System.out.println("4.DISPLAY A TREE IN INORDER TRAVERSAL");
        System.out.println("5.EXIT");

        while (true) {
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter the number of nodes in tree: ");
                    int m = sc.nextInt();
                    int [] nodes = new int[m];
                    System.out.println("Enter the value of nodes one by one: ");
                    for(int i = 0 ; i < m ; i++){
                        nodes[i] = sc.nextInt();
                    }
                    for(int i = 0 ; i < m ; i++){
                        tree.root = tree.insert(tree.root, nodes[i]);
                    }
                    break;
                
                case 2:
                    System.out.println("Enter a element to search in a tree: ");
                    int key = sc.nextInt();
                    if(tree.Search(tree.root, key)){
                        System.out.println("Found");
                    }else{
                        System.out.println("Not Found");
                    }
                    break;

                case 3:
                    System.out.println("Enter Value of node to delete: ");
                    int d = sc.nextInt();
                    tree.delete(tree.root, d);
                    System.out.println("Deleted Sucessfully");
                    break;

                case 4:
                    System.out.println("BST in inorder Traversal is: ");
                    tree.inorder(tree.root);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("EXITING...........");
                    return;

                default:
                    break;
            }

        }
    }
}