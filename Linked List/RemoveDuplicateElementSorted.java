import java.util.Scanner;

class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
        this.link = null;
    }
}

class Duplicate{
    Node head = null;

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

    
    public void RemoveDuplicate(){
        Node currNode = head;
        
        if(head == null){
            return;
        }

        while (currNode != null && currNode.link != null ) {
            if(  currNode.data == currNode.link.data   ){
                currNode.link = currNode.link.link;

            }else{
                currNode = currNode.link; 
            }
        }

    }
}
public class RemoveDuplicateElementSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        Duplicate d = new Duplicate();

        System.out.println("1.INSERT AN ELEMENT");
        System.out.println("2.DISPLAY A LINKED LIST");
        System.out.println("3.DISPLAY LINKED LIST AFTER DELETE DUPLICATE ELEMENT");

        while(true){
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element in sorted list: ");
                    int x = sc.nextInt();
                    d.addLast(x);
                    break;
                
                case 2:
                    d.display();
                    break;   

                case 3:
                    d.RemoveDuplicate();
                    System.out.println("After delete a duplicate element: ");
                    d.display();
                    return;
            
                default:
                    break;
            }
            

        }
        
    }
}
