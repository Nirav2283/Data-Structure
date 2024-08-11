import java.util.Scanner;

class Node{
    int c;
    int e;
    Node link;

    public Node(int c , int e){
        this.e = e;
        this.c = c;
        this.link = null;
    }
}

class Main{
    public Node first = null;

    //this method is for add a term in polynomial
    public void add(int c ,int e){
        Node newNode = new Node(c, e);
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

    //this method for display a node and final result
    public void display() {
        Node save = first;
        while (save != null) {
            if (save.c!= 0) {
                System.out.print(save.c + "x^" + save.e);
                if (save.link != null && save.link.c >= 0) {
                    System.out.print(" + ");
                }
            }
            save = save.link;
        }
        System.out.println();
    }

    

    //main logic (to add polynomial)
    public static Main sum(Main p1 , Main p2){
        Main ans = new Main();
        Node temp1 = p1.first;
        Node temp2 = p2.first;

        while(temp1 != null && temp2 != null){
            if(temp1.e == temp2.e){
                ans.add(temp1.c + temp2.c, temp1.e);
                temp1 = temp1.link;
                temp2 = temp2.link;
            }
            else if(temp1.e > temp2.e){
                ans.add(temp1.c , temp1.e);
                temp1 = temp1.link;
            }
            else{
                ans.add(temp2.c , temp2.e);
                temp2 = temp2.link;
            }
            
        }
        while (temp1 != null) {
            ans.add(temp1.c, temp1.e);
            temp1 = temp1.link;
        }

        while (temp2 != null) {
            ans.add(temp2.c, temp2.e);
            temp2 = temp2.link;
        }
        return ans;
    }
    
}
public class Polynomial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main p1 = new Main();
        Main p2 = new Main();
        System.out.println("ENTER 1 FOR ADD TERM OF POLYNOMIAL1");
        System.out.println("ENTER 2 FOR ADD TERM OF POLYNOMIAL2");
        System.out.println("ENTER 3 FOR DISPLAY POLINOMIAL1");
        System.out.println("ENTER 4 FOR DISPLAY POLINOMIAL2");
        System.out.println("ENTER 5 FOR DISPLAY A RESULT AFTER ADD");
        System.out.println("ENTER 6 FOR EXIT");
        System.out.println();
        while (true) {
            System.out.println("Enter a choice: ");
            int n = sc.nextInt();

            switch(n){
                case 1:
                    System.out.println("Enter coefficient of polynomial 1: ");
                    int c = sc.nextInt();
                    System.out.println("Enter exponenet of polynomial 1: ");
                    int e = sc.nextInt();
                    p1.add(c, e);
                    break;
                
                case 2:
                    System.out.println("Enter coefficient of polynomial 2: ");
                    int c2 = sc.nextInt();
                    System.out.println("Enter exponenet of polynomial 2: ");
                    int e2 = sc.nextInt();
                    p2.add(c2, e2);
                    break;

                case 3:
                    System.out.print("First Polynomial: ");
                    p1.display();
                    break;
                case 4:
                    System.out.print("Second Polynomial: ");
                    p2.display();
                    break;
                case 5:
                    Main ans = Main.sum(p1,p2);
                    System.out.print("First Polynomial: ");
                    p1.display();
                    System.out.print("Second Polynomial: ");
                    p2.display();
                    System.out.print("Final Polynomial: ");
                    ans.display();
                    break;
                case 6:
                    System.out.println("Exited Sucessfully");
                    return;
                default:
                    System.out.println("Invalid choice Try again!!");
                    
            

            }

            
        }

        
    }
}