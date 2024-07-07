import java.util.Scanner;

class Node{
    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;

    }
}


class Size{

    public Node head = null;

    
public void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }

    newNode.link = head;
    head = newNode;
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

    public void size(){
       
        int count = 0;

        if(head == null){
            count = 0;
            System.out.println("Size of the Linked List is: "+count);
        }

        Node save = head;
        while(save != null){
            save = save.link;
            count++;
        }
        System.out.println("Size of the Linked List is: "+count);
       

    }


}
public class NumberofNodeLL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Size s = new Size();
      
        
        while(true){
            System.out.println("enter 1 to insert and 2 to display and size: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element: ");
                    int x = sc.nextInt();
                    s.addFirst(x);
                    break;
                
                case 2:
                    s.display();
                    s.size();
                    return;    

            
                default:
                    break;
            }
            

        }
        
        
    }
}