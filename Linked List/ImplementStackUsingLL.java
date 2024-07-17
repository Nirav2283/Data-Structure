import java.util.*;
class Node{
    
    int info;
    Node link;

    public  Node(int info){
        this.info = info;
        this.link = null;
    }

}

class Implement{
    Node top;
    public void push(int info) {
        Node newNode = new Node(info);

        if(top == null){
            top = newNode;
            return;
        }
        newNode.link = top;
        top = newNode;
    }

    public void pop(){
        if(top == null){
            System.out.println("List is Empty");
            return;
        }

        top = top.link;
    }

    public void display(){
        if (top == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = top;
        while (currNode != null) {
            System.out.println("|" + currNode.info + "|");
            currNode = currNode.link;
        }
        System.out.println("|_|");
    }

}


public class ImplementStackUsingLL {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Implement stack = new Implement();

        System.out.println("1.INSERT AN ELEMENT");
        System.out.println("2.DISPLAY A STACK");
        System.out.println("3.DELETE A ELEMENT");
        System.out.println("4.EXIT");

        while(true){
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element: ");
                    int x = sc.nextInt();
                    stack.push(x);
                    break;
                
                case 2:
                    System.out.println("Stack is: ");
                    stack.display();
                    break;   

                case 3:
                    stack.pop();
                    break;
                case 4:
                    return;
            
                default:
                    break;
            }
            

        }

    }
}
