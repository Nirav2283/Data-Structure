import java.util.Scanner;

class Node{
    int info;
    Node link;

    public Node(int info) {
        this.info = info;
        this.link = null;
    }
}

class LL{
    public Node first = null;

    public void insert(int info){
        Node newNode = new Node(info);
        if(first == null){
            first = newNode;
            return;
        }
        Node save = first;
        while(save.link != null){
            save = save.link;
        }
        save.link = newNode;
        

    }


    public void reverse(){
        if(first == null){
            System.out.println("List is empty");
        }



        Node prevNode = first;
        Node save = first.link;

        while(save != null){
            Node nextNode = save.link;
            save.link = prevNode;

            prevNode = save;
            save = nextNode;
        }
        first.link = null;
        first = prevNode;
    }

    public void display() {

        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = first;
        while (currNode != null) {
            System.out.print(currNode.info + " --> ");
            currNode = currNode.link;
        }
        System.out.println("NULL");

    }

}

public class ReverseLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL l = new LL();
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("1. INSERT A ELEMENT:");
        System.out.println("2. DISPLAY LIST:");
        System.out.println("3. REVERSE AND DISPLAY LIST:");
        System.out.println("4. EXIT");

        while (true) {
            System.out.println();

            System.out.println();
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter a element to insert at firt: ");
                    int x = sc.nextInt();
                    l.insert(x);
                    break;
                
                case 2:
                    l.display();
                    break;
                case 3:
                    l.reverse();
                    System.out.println("Reverse list is: ");
                    l.display();
                    break;
                case 4:
                    System.out.println("Exited");
                    return;
                default:
                    System.out.println("Try again!!!");

            }
       
    }
  }
}
