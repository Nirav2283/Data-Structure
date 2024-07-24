import java.util.Scanner;

class Node {
    int info;
    Node link;

    public Node(int info) {
        this.info = info;
        this.link = null;
    }
}

class CLL {
    public Node first = null;
    public Node last = null;

    public void addFirst(int info) {
        Node newNode = new Node(info);

        if (first == null) {
            first = last = newNode;
            newNode = newNode.link;
            return;
        }
        
        newNode.link = first;
        last.link = newNode;
        first = newNode;

    }

    public void addLast(int info) {
        Node newNode = new Node(info);

        if (first == null) {
            first = last = newNode;
            newNode = newNode.link;
            return;
        }
    
        newNode.link = first;
        last.link = newNode;
        last = newNode;
    }

    public void deleteAtposition(int position){
        Node save = first;
        if(first == null){
            System.out.println("Empty");
            return;
        }
        int count = 1;
        Node prev = null;
        if(count < position){
            prev = save;
            save = save.link;
            count++;
        }

        if(prev == null){
            first = save.link;
        }else{
            prev.link = save.link;
        }


    }

    public void display() {
        if (first == null) {
            System.out.println("List is Empty");
            return;
        }
        Node save = first;
        while (save != last) {
            System.out.print(save.info + " --> ");
            save = save.link;
        }
        System.out.print(save.info);
        System.out.println(" --> "+ "FirstNode(" + first.info +")");
        System.out.println("");
    }
}

public class CircularLLMenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLL l = new CLL();
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("1. INSERT AT FIRST");
        System.out.println("2.INSERT AT LAST");
        System.out.println("3.DISPLAY A LIST");
        System.out.println("4.DELETE AT POSITION ");
        System.out.println();
        System.out.println("");
        while (true) {
            System.out.println();

            System.out.println();
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter a element to insert at first: ");
                    int x = sc.nextInt();
                    l.addFirst(x);
                    break;

                case 2:
                    System.out.println("Enter a element to insert at last: ");
                    int k = sc.nextInt();
                    l.addLast(k);
                    break;

                case 3:
                    l.display();
                    break;
                case 4:
                    System.out.println("Enter a Position To delete: ");
                    int position = sc.nextInt();
                    l.deleteAtposition(position);
                    System.out.println("Deleted Sucessfully");
                    break;
                
            }

        }
    }
}
