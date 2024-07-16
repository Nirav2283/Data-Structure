import java.util.Scanner;
class Node{
    int info;
    Node link;

    public Node(int info){
        this.info = info;
        this.link = null;
    }
}

class Check{
    public Node first1 = null;
    public Node first2 = null;


   
    
    public void checklist(Node first1 , Node first2){

        Node save1 = first1;
        Node save2 = first2;

        while (save1 != null && save2 != null) {
            // If data is not equal, return 0
            if (save1.info != save2.info)
                System.out.println("Not same");
            
            // Move to next nodes
            save1 = save1.link;
            save2 = save2.link;
            
        }
        
        // If one list is shorter than the other
        if (save1 != null || save2 != null)
            System.out.println("Not Same");
        
        // If reached here, both lists are identical
        System.out.println("Same");
        

    }
}

public class CheckLLSame {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Check c = new Check();

        Node list1 = new Node(1);
        list1.link = new Node(2);
        list1.link.link = new Node(2);

        Node list2 = new Node(1);
        list2.link = new Node(2);
        list2.link = new Node(2);

        c.checklist(list1, list2);

        
        

        

        
    }
}
