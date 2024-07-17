import java.util.*;

class Node3{
    int info;
    Node3 link;

    Node3(int info){
        this.info = info;
        this.link = null;
    }

}

class Queue{
    Node3 top;
    public void push(int info){
        Node3 newNode = new Node3(info);

        if(top == null){
            top = newNode;
            return;
        }
        newNode.link = top;
        top = newNode;

    }

    public void pop(){
        if (top == null) {
            System.out.println("List is empty");
        }

        if (top.link == null) {
            top = null;
            return;
        }

        Node3 currNode = top;
        Node3 lastNode = top.link;

        while (lastNode.link != null) {
            currNode = currNode.link;
            lastNode = lastNode.link;
        }
        currNode.link = null;


    }

    public void display(){
        if (top == null) {
            System.out.println("List is empty");
            return;
        }
        Node3 currNode = top;
        while (currNode != null) {
            System.out.println("|" + currNode.info + "|");
            currNode = currNode.link;
        }
        System.out.println("|_|");
    }

}
public class ImplementQueueUsingLL {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        System.out.println("1.INSERT AN ELEMENT");
        System.out.println("2.DISPLAY A QUEUE");
        System.out.println("3.DELETE A ELEMENT");
        System.out.println("4.EXIT");

        while(true){
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element: ");
                    int x = sc.nextInt();
                    q.push(x);
                    break;
                
                case 2:
                    System.out.println("Queue is: ");
                    q.display();
                    break;   

                case 3:
                    q.pop();
                    break;
                case 4:
                    return;
            
                default:
                    break;
            }
            

        }
    }
}
