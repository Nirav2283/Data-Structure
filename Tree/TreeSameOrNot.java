import java.util.Scanner;

class Node{
    int info;
    Node lptr;
    Node rptr;

    public Node(int info){
        this.info = info;
        this.lptr = null;
        this.rptr = null;
    }
}

class Similar{
    Node root;

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
            } else {
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

    public void inorder(Node node){
        if (node == null) {
            return;
        }
        inorder(node.lptr);
        System.out.print(node.info + " ");
        inorder(node.rptr);
    }

    // Method to check if two trees are identical
    public boolean areIdentical(Similar other) {
        return areIdentical(this.root, other.root);
    }

    // Recursive helper method for checking identical trees
    private boolean areIdentical(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return (node1.info == node2.info) &&
               areIdentical(node1.lptr, node2.lptr) &&
               areIdentical(node1.rptr, node2.rptr);
    }
}

public class TreeSameOrNot {
    public static void main(String[] args) {
        Similar tree1 = new Similar();
        Similar tree2 = new Similar();
        Scanner sc = new Scanner(System.in);

        // Tree 1
        System.out.println("Enter the root value for Tree 1: ");
        int rootValue = sc.nextInt();
        tree1.addRoot(rootValue);

        // Building the tree
        System.out.println("Enter the number of nodes to insert in Tree 1:");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter parent node value:");
            int parentValue = sc.nextInt();
            System.out.println("Enter child node value:");
            int childValue = sc.nextInt();
            System.out.println("Enter direction (L for left, R for right) from parent:");
            String direction = sc.next();
            tree1.buildTree(parentValue, childValue, direction);
        }

        // Tree 2
        System.out.println("----FOR TREE2----");
        System.out.println("Enter the root value for Tree 2: ");
        int rootValue2 = sc.nextInt();
        tree2.addRoot(rootValue2);

        // Building the tree
        System.out.println("Enter the number of nodes to insert in Tree 2:");
        int numNodes2 = sc.nextInt();

        for (int i = 0; i < numNodes2; i++) {
            System.out.println("Enter parent node value:");
            int parentValue2 = sc.nextInt();
            System.out.println("Enter child node value:");
            int childValue2 = sc.nextInt();
            System.out.println("Enter direction (L for left, R for right) from parent:");
            String direction2 = sc.next();
            tree2.buildTree(parentValue2, childValue2, direction2);
        }

        // Print in inorder traversal
        System.out.println("Inorder Traversal of Tree 1: ");
        tree1.inorder(tree1.root);
        System.out.println();
        System.out.println("Inorder Traversal of Tree 2: ");
        tree2.inorder(tree2.root);
        System.out.println();

        // Check if trees are identical
        if (tree1.areIdentical(tree2)) {
            System.out.println("The trees are identical.");
        } else {
            System.out.println("The trees are not identical.");
        }
    }
}
