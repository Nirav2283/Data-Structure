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

class Symmetric{
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


    //check if it is Symmetric or Not
    public boolean isSymmetric(Node node1  , Node node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        return (node1.lptr.info == node2.rptr.info) && 
        isSymmetric(node1.lptr, node2.lptr) &&
        isSymmetric(node1.rptr, node2.rptr);
    }

}

public class SymmetricTreeOrNot {
    public static void main(String[] args) {
        
    }
}
