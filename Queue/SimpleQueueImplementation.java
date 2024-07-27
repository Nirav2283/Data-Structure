import java.util.Scanner;

class Queue{
    int f = -1;
    int r = -1;
    int n;
   
    int [] arr;
    Queue(int n){
        this.n =n;
        this.arr = new int[n];
        
    }

    public boolean isFull(){
        return (r == n-1);
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        if(f == -1){
            f = 0;
        }
        r++;
        arr[r] = val;
        
    }
    public int dequeue(){
        if(f == -1){
           return 0;
        }
        if(f == r){
            f = r = -1;
        }else{
            f++;
            
        }
        return arr[f-1];
        
        
    }
    public void display(){
        for(int i = f ; i <= r ; i++){
            System.out.print(arr[i] +" ");
        }
    }

}

public class SimpleQueueImplementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        Queue q = new Queue(n);
        System.out.println("1.QUEUE");
        System.out.println("2.DEQUEUE");
        System.out.println("3.DISPLAY");
        System.out.println("4.EXIT");

        while (true) {
            System.out.println();

            System.out.println();
            System.out.println("Enter a choice: ");
            int c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.println("Enter a element to insert in enqueue: ");
                    int x = sc.nextInt();
                    q.enqueue(x);
                    break;

                case 2:
                    q.dequeue();
                    System.out.println("deleted sucessfully");
                    q.display();
                    break;

                case 3:
                   q.display();
                   break;
                case 4:
                    System.out.println("Exited");
                    return;

                default:
                    System.out.println("Invalid choice !! Try again");
                    break;
                
        
        

    }
}
    }
}