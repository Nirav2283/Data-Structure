import java.util.Scanner;

import javax.sound.midi.SysexMessage;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LL {
    public Node head = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.link != null) {
            currNode = currNode.link;
        }
        currNode.link = newNode;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        for (int j = 1; j < position - 1; j++) {
            if (currNode == null) {
                System.out.println("Index out of bounds");
                return;
            }
            currNode = currNode.link;
        }
        if (currNode != null) {
            newNode.link = currNode.link;
            currNode.link = newNode;
        }
    }

    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.link;
        }
        System.out.println("NULL");

    }

    public void deleteAtfirst() {
        if (head == null) {
            System.err.println("List is empty");
        }

        head = head.link;

    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
        }

        if (head.link == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.link;

        while (lastNode.link != null) {
            currNode = currNode.link;
            lastNode = lastNode.link;
        }
        currNode.link = null;

    }

    public void deleteAtposition(int position) {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty");
        }

        if (position == 0) {
            head = head.link;
            return;
        }
        for (int i = 0; currNode != null && i < position - 1; i++) {
            currNode = currNode.link;
        }
        currNode.link = currNode.link.link;

    }

}

public class LinkedListMenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL l = new LL();
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("1. INSERT AT FIRST");
        System.out.println("2. INSERT AT LAST");
        System.out.println("3. INSERT AT POSITION");
        System.out.println("4. DELETE AT FIRST");
        System.out.println("5. DELETE AT LAST");
        System.out.println("6. DELETE AT POSITION");
        System.out.println("7. DISPLAY A LINKED LIST");
        System.out.println("8. EXIT THE PROGRAMME");

        while (true) {
            System.out.println();

            System.out.println();
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter a element to insert at firt: ");
                    int x = sc.nextInt();
                    l.addFirst(x);
                    break;

                case 2:
                    System.out.println("Enter a element to insert at last: ");
                    int h = sc.nextInt();
                    l.addLast(h);
                    break;

                case 3:
                    System.out.print("Enter a value to insert in LL: ");
                    int j = sc.nextInt();
                    System.out.println("Enter a position: ");
                    int k = sc.nextInt();
                    l.insertAtPosition(j,k);
                    System.out.println("Inserted sucessfully");
                    break;
                
                case 4:
                    l.deleteAtfirst();
                    System.out.println("Delete at first executed sucessfully");
                    break;
                
                case 5:
                    l.deleteAtLast();
                    System.out.println("Delete at last executed sucessfully");
                    break;

                case 6:
                    System.out.println("Enter a position to delete: ");
                    int r = sc.nextInt();
                    l.deleteAtposition(r);
                    System.out.println("Deleted Sucessfully...");
                    break;



                case 7:
                    l.display();
                    break;
                
                case 8:
                    System.out.println("----------Exited Sucessfully----------");
                    return;
                
                default:
                    System.out.println("Invalid choice!! try again...");

            }

        }

    }
}
