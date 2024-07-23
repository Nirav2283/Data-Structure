import java.util.Scanner;

class MyNode{
    int info;
    MyNode link;

    public MyNode(int info){
        this.info = info;
        this.link = null;
    }

}

class SwapNode{
    public MyNode first = null;
    public void addLast(int data) {
        MyNode newNode = new MyNode(data);
        if (first == null) {
            first = newNode;
            return;
        }
        MyNode save = first;
        while (save.link != null) {
            save = save.link;
        }
        save.link = newNode;
    }

    public void swap(int k){
        if(first == null || k < 0){
            System.out.println("List is empty");
            return;
        }
        MyNode save = first;
        int length = 0;
        while(save != null){
            save = save.link;
            length++;
        }

        if(k > length){
            System.out.println("out of bounds");
            return;
        }

        //kth node from start
        MyNode start = first;
        for(int i = 1 ; i < k ; i++){
            start = start.link;
        }

        //kth node from end
        MyNode last = first;
        for(int i = 0 ; i < length - k ;i++){
            last = last.link;
        }

        //swap

        int temp = start.info;
        start.info = last.info;
        last.info = temp;

    }

    public void display() {

        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        MyNode save = first;
        while (save != null) {
            System.out.print(save.info + " --> ");
            save = save.link;
        }
        System.out.println("NULL");

    }

}
public class KthNodeSwap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        SwapNode s = new SwapNode();
       
        System.out.println("1. INSERT AN ELEMENT");
        System.out.println("2. DISPLAY A LINKED LIST");
        System.out.println("3. SWAP A SPECIFIC NODE AND DISPLAY");
        System.out.println("EXIT");

        while (true) {
            System.out.println();

            System.out.println();
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter a element to insert: ");
                    int x = sc.nextInt();
                    s.addLast(x);
                    break;

                case 2:
                    s.display();
                    break;

                case 3:
                    System.out.print("Enter a value of K to swap: ");
                    int k = sc.nextInt();
                    s.swap(k);
                    s.display();
                    
                    break;
                case 4:
                    System.out.println("Exited");        
                    return;
                default:
                    System.out.println("Invalid choice!!! Try again");


        
    }
}
    }
}
