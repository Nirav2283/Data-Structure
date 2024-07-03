public class LinkedListDemo{
    public static void main(String [] args){
        Node n1 = new Node();
        n1.data = 3;
        Node n2 = new Node();
        n2.data = 4;
        n2 = n1.link;
        System.out.println(n1.data);
        System.out.println(n2);
    }
}

class Node{
    int data ;
    Node link;

}