import java.util.Scanner;
class CLNode{
    int info;
    CLNode link;

    public CLNode(int info){
        this.info = info;
        this.link = null;
    }
}

class Insord{
    public CLNode first = null;
    public CLNode last = null;
    
    

    public void insord(int info){
        CLNode newNode = new CLNode(info);

        if(first == null){
            first = last = newNode;
            newNode = newNode.link;
            return;
        }

        CLNode save = first;
        if(newNode.info <= first.info){
            newNode.link = first;
            last.link = newNode;
            first = newNode;
            return;
        }
        while(save != last && save.link.info < newNode.info){
            save = save.link;
        }
        newNode.link = save.link;
        save.link = newNode;

        if(save == last){
            last = newNode;
            return;
        }

    

    }

    public void display() {
        if (first == null) {
            System.out.println("List is Empty");
            return;
        }
        CLNode save = first;
        while (save != last) {
            System.out.print(save.info + " --> ");
            save = save.link;
        }
        System.out.print(save.info);
        System.out.println(" --> "+ "FirstNode(" + first.info +")");
        System.out.println("");
    }
}

public class CircularLLInsord {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Insord l = new Insord();
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("1. INSERT AT FIRST");
        System.out.println("2.DISPLAY A LIST");
        
        System.out.println("3.EXIT");
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
                    l.insord(x);
                    break;

                

                case 2:
                    l.display();
                    break;
                
                case 3:
                    System.out.println("Exited");
                    return;
            }

        }

    }
}
