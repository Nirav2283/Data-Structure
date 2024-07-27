import java.util.Scanner;

class Node4{
    int info;
    Node4 link;

    public Node4(int info){
        this.info = info;
        this.link = null;
    }
}
class Split{
    public Node4 first = null;
    public Node4 last = null;
    public void addLast(int info) {
        Node4 newNode = new Node4(info);

        if (first == null) {
            first = last = newNode;
            newNode = newNode.link;
            return;
        }
    
        newNode.link = first;
        last.link = newNode;
        last = newNode;
    }

    public int size(){
        if(first == null){
            System.out.println("List is empty");
            return -1;
        }
        Node4 save = first;
        int size = 0;
        do{
            save = save.link;
            size++;
        }while (save != first);
        return size;
     
    }

    public void display(Node4 n){
        if (n == null) {
            System.out.println("List is Empty");
            return;
        }
        Node4 save = n;
        do {
            System.out.print(save.info + " --> ");
            save = save.link;
        } while (save != n);
        System.out.println("FirstNode(" + n.info + ")");
    }

    public void split(){
        int count = size();
        if(count < 2){
            System.out.println("Split not possible");
            return;
        }
        int middle = count / 2;
        Node4 firstpart = first;
      

        for(int i = 1 ; i < middle  ; i++){
            firstpart = firstpart.link;
        }

        Node4 secondpart = firstpart.link;

        firstpart.link = first;

        Node4 save = secondpart;
        while(save.link != first){
            save = save.link;
        }
        save.link = secondpart;
        
        System.out.println("First part :");
        display(first);
        System.out.println("Second part :");
        display(secondpart);
        
    }
}
public class SplitCircularLL {
    public static void main(String[] args) {
        Split list = new Split();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("1.INSERT AN ELEMENT");
        System.out.println("2.DISPLAY A FULL LIST");
        System.out.println("3.SPLIT INTO TWO HALVES AND DISPLAY");
        System.out.println("4.EXIT");
        System.out.println();
        System.out.println("");
        while (true) {
            System.out.println();
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter a element to insert: ");
                    int x = sc.nextInt();
                    list.addLast(x);
                    break;
                case 2:
                    list.display(list.first);
                    break;
                case 3:
                    list.split();
                    break;
                case 4:
                    System.out.println("Exited");
                    return;
                default:
                    System.out.println("Invalid choice try again");
                    break;

            }
        }

    }
}
