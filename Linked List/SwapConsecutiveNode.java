/**
 * This programme swap node consecutive in singly linked list
 * author : Nirav
 * date : 14/7/2024
 */

import java.util.Scanner;

class ListNode{
    int info;
    ListNode link;

    public ListNode(int info){
        this.info = info;
        this.link = null;

    }
}

class Swap{
    public ListNode first = null;

    public void addLast(int info) {
        ListNode newNode = new ListNode(info);
        if (first == null) {
            first = newNode;
            return;
        }
        ListNode currNode = first;
        while (currNode.link != null) {
            currNode = currNode.link;
        }
        currNode.link = newNode;
    }


    public void swapnode(){
        if (first == null){
            return;
        }
        
        
        ListNode prev = first;
        ListNode save = first.link;
        first = first.link; 
        
        while (true) {
            ListNode nextNode = save.link;
            save.link = prev;
            if (nextNode == null || nextNode.link == null) {
                prev.link = nextNode;
                break;
            }
            prev.link = nextNode.link;
            prev = nextNode;
            save = nextNode.link;
        }
    }

    public void display() {

        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode save = first;
        while (save != null) {
            System.out.print(save.info + " --> ");
            save = save.link;
        }
        System.out.println("NULL");

    }

    
}

public class SwapConsecutiveNode {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Swap l = new Swap();
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("1. INSERT AN ELEMENT IN A LIST");
        System.out.println("2. DISPLAY A LIST");
        System.out.println("3. DISPLAY A LIST AFTER SWAPPING");
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
                    l.addLast(x);
                    break;

                case 2:
                    l.display();
                    break;

                case 3:
                    l.swapnode();
                    System.out.println("After swapping: ");
                    l.display();
                    break;
                case 4:
                    return;
            }
        }

    }
}