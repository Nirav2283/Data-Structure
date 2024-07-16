import java.util.Scanner;

class Node1 {
    int info;
    Node1 link;

    public Node1(int info) {
        this.info = info;
        this.link = null;
    }
}

class Copy{
    public Node1 first = null;

    public void insert(int info){
        Node1 newNode = new Node1(info);
        if(first == null){
            first = newNode;
            return;
        }
        Node1 save = first;
        while(save.link != null){
            save = save.link;
        }
        save.link = newNode;
        

    }

    public void copy(Copy c){
        if(first == null){
            System.out.println("List is empty");
            return;
        }
        
        Node1 save = first;
        while(save!=null){
            c.insert(save.info);
            save = save.link;

        }

    }



    

    public void display(){
        if(first == null){
            System.out.println("List is Empty");
            return;
        }
        Node1 save = first;
        while(save != null){
            System.out.print(save.info + " --> ");
            save = save.link;
        }
        System.out.println("NULL");
    }
    
}


public class CopyLL {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Copy list1 = new Copy();
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("1. INSERT AN ELEMENT IN A LIST");
        System.out.println("2. DISPLAY A LIST");
        System.out.println("3. CREATE A COPY OF LINKED LIST AND DISPLAY");
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
                    list1.insert(x);
                    break;

                case 2:
                    list1.display();
                    break;

                case 3:
                    Copy list2 = new Copy();
                    list1.copy(list2);
                    System.out.println("First linked list is: ");
                    list1.display();
                    System.out.println("Copy of this Linked list: ");
                    list2.display();
                    break;
                case 4:
                    System.out.println("Exited Sucessfully...");
                    return;
                default:
                    System.out.println("Invalid choice try again!!!");
                    break;
            }
        }

        
        
    }
}
