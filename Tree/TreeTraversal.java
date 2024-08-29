import java.util.Scanner;

// Define the structure of the tree node
class Node {
    int info;
    Node lptr;
    Node rptr;

    public Node(int info) {
        this.info = info;
        this.lptr = null;
        this.rptr = null;
    }
}

// Define the binary tree class
class BinaryTree {
    Node root;

    // Preorder traversal (Root, Left, Right)
    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.info + " ");
        preorder(node.lptr);
        preorder(node.rptr);
    }

    // Inorder traversal (Left, Root, Right)
    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.lptr);
        System.out.print(node.info + " ");
        inorder(node.rptr);
    }

    // Postorder traversal (Left, Right, Root)
    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.lptr);
        postorder(node.rptr);
        System.out.print(node.info + " ");
    }

    // Build tree with given parent, child, and direction
    public void buildTree(int parent, int child, String direction) {
        if (root == null) {
            System.out.println("Tree is empty. Please add a root first!");
            return;
        }

        // Find the parent node
        Node parentNode = findNode(root, parent);
        if (parentNode == null) {
            System.out.println("Parent node with value " + parent + " does not exist.");
            return;
        }

        // Insert the new node in the specified direction
        if (direction.equalsIgnoreCase("L")) {
            if (parentNode.lptr == null) {
                parentNode.lptr = new Node(child);
            } else {
                System.out.println("Left child already exists.");
            }
        } else if (direction.equalsIgnoreCase("R")) {
            if (parentNode.rptr == null) {
                parentNode.rptr = new Node(child);
            }else{
                System.out.println("Right child already exists.");
            }
        } else {
            System.out.println("Invalid direction! Use 'L' for left or 'R' for right.");
        }
    }

    // Find a node with a given value
    private Node findNode(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (node.info == value) {
            return node;
        }
        Node foundNode = findNode(node.lptr, value);
        if (foundNode != null) {
            return foundNode;
        }
        return findNode(node.rptr, value);
    }

    // Add the root node
    public void addRoot(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            System.out.println("Root already exists.");
        }
    }
}

// Main class to test the tree traversal and insertion methods
public class TreeTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        // Add root
        System.out.println("Enter the root value: ");
        int rootValue = sc.nextInt();
        tree.addRoot(rootValue);

        // Building the tree
        System.out.println("Enter the number of nodes to insert:");
        int numNodes = sc.nextInt();
        

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter parent node value:");
            int parentValue = sc.nextInt();
            System.out.println("Enter child node value:");
            int childValue = sc.nextInt();
            System.out.println("Enter direction (L for left, R for right) from parent:");
            String direction = sc.next();
            tree.buildTree(parentValue, childValue, direction);
        }


        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Postorder Traversal:");
        tree.postorder(tree.root);

        sc.close();
    }
}
