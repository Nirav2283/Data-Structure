class Node {
    int info;
    Node lptr;
    Node rptr;

    public Node(int info) {
        this.info = info;
        this.lptr = null;
        this.rptr = null;
    }
}

class Alternate{
    public Node first = null;
    public void addLast(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            first = newNode;
            return;
        }
        Node save = first;
        while (save.rptr != null) {
            save = save.rptr;
        }

        save.rptr = newNode;
        newNode.lptr = save;

    }

    public void delete(){
        if(first == null){
            System.out.println("List is empty");
            return;
        }
        Node save = first;
        int pos = 1;
        while(save != null){
            
            if(pos % 2 == 0){
                Node dlt = save;
                if(dlt.lptr != null){
                    dlt.lptr.rptr = dlt.rptr; 
                }
                if(dlt.rptr != null){
                    dlt.rptr.lptr = dlt.lptr;
                }
                if (dlt == first) {
                    first = dlt.rptr;
                }
                save = dlt.rptr;
            }else{
                save = save.rptr;
            }
            pos++;
            
        }
    }

    public void display() {
        Node save = first;
        if (first == null) {
            System.out.println("List is Empty");
            return;
        }
        while (save != null) {
            System.out.print(save.info + " <--> ");
            save = save.rptr;
        }
        System.out.print("NULL");
    }
}
public class DeleteAlternateNodeDoublyLL{
    public static void main(String[] args) {
        Alternate list = new Alternate();
        list.addLast(1);
        list.addLast(2);

        list.addLast(3);

        list.addLast(4);
        list.addLast(5);

        list.display();
        list.delete();
        System.out.println();
        list.display();

    }
}