import java.util.Scanner;
class Node{
    int info;
    Node link;

    public Node(int info){
        this.info = info;
        this.link = null;
    }
}

class Sort{
    public Node first = null;

    public void addLast(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            first = newNode;
            return;
        }
        Node save = first;
        while (save.link != null) {
            save = save.link;
        }
        save.link = newNode;
    }


    public void sort(){
        if(first == null){
            System.out.println("List is Empty");
            return;
        }
        Node save = first;
        while(save != null){
            Node next = save.link;

            while(next != null){
                if(save.info > next.info){
                    int temp = save.info;
                    save.info = next.info;
                    next.info = temp;
                }
                next = next.link;
            }
            save = save.link;
        }
       
        
    }

    public void display(){

        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node save = first;
        while (save != null) {
            System.out.print(save.info + " --> ");
            save = save.link;
        }
        System.out.println("NULL");

    }
}
public class SortSinglyLL {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Sort s = new Sort();
        s.addLast(20);
        s.addLast(70);
        s.addLast(10);
        s.addLast(30);

        s.display();

        s.sort();

        s.display();
    }
}
