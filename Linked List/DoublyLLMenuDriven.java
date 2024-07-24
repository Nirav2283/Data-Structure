import java.util.Scanner;

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

class Doubly {
    public Node first = null;

    public void addFirst(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            first = newNode;
            return;
        }
        newNode.lptr = null;
        newNode.rptr = first;
        first.lptr = newNode;
        first = newNode;

    }

    public void addLast(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            first = newNode;
            return;
        }
        Node save = first;
        while (save.rptr != null) {
            save = save.rptr;
        }

        save.rptr = newNode;
        newNode.lptr = save;

    }

    public void insertAtPosition(int info, int position) {
        Node newNode = new Node(info);
        if (position == 1) {
            addFirst(info);
            return;
        }

        Node save = first;
        int currpos = 1;
        while (save != null && currpos < position) {
            save = save.rptr;
            currpos++;
        }

        if (save == null) {
            addLast(info);
            return;
        }

        newNode.rptr = save;
        newNode.lptr = save.lptr;
        save.lptr.rptr = newNode;
        save.lptr = newNode;

    }

    public void deleteAtposition(int position){
        if(first == null){
            System.out.println("List is Empty");
            return;
        }

        Node save = first;
        int length = 0;
        while(save != null){
            save = save.rptr;
            length++;

        }
        System.out.println(length);

        if(position < 1 || position > length){
            System.out.println("Invalid position Try again!!");
            return;
        }

        Node temp = first;
        if(position == 1){
            first = temp.rptr;
            return;
        }

        for(int i = 1 ; i < position || temp != null ; i++){
            temp = temp.rptr;

            if(temp == null || temp.rptr == null){
                System.out.println("List empty");
                return;
            }

            if(temp.lptr != null){
                temp.lptr.rptr = temp.rptr;
            }else{
                first  = temp.rptr;
            }

            if(temp.rptr != null){
                temp.rptr.lptr = temp.lptr;
                return;
            }

            
        }
    }

    public void display() {
        Node save = first;
        if (first == null) {
            System.out.println("List is Empty");
            return;
        }
        while (save != null) {
            System.out.print(save.info + " <--> ");
            save = save.rptr;
        }
        System.out.print("NULL");
    }
}

public class DoublyLLMenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doubly list = new Doubly();
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("1.INSERT AT FIRST");
        System.out.println("2.INSERT AT END");
        System.out.println("3.INSERT AT POSITION");
        System.out.println("4.DELETE AT POSITION");
        System.out.println("5.DISPLAY A LIST");
        System.out.println("6.EXIT");
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
                    list.addFirst(x);
                    break;

                case 2:
                    System.out.println("Enter a element to insert at last: ");
                    int k = sc.nextInt();
                    list.addLast(k);
                    break;

                case 3:
                    System.out.println("Enter a position of element: ");
                    int i = sc.nextInt();
                    System.out.println("Enter a value of element: ");
                    int j = sc.nextInt();
                    list.insertAtPosition(j, i);
                    System.out.println("Inserted sucessfully");
                    break;

                case 4:
                    System.out.println("Enter a position: ");
                    int position = sc.nextInt();
                    list.deleteAtposition(position);
                    list.display();
                    break;

                case 5:
                    list.display();
                    break;
                

                case 6:
                    System.out.println("Exited Sucessfully");
                    return;
                

            }

        }

    }
}

