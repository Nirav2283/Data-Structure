import java.util.Scanner;
class CQueue{
    int f = -1;
    int r = -1;
    int n;
    int size = 0;
    int arr[];
    
    CQueue(int n){
        this.n = n;
        this.arr = new int[n];
        this.size = size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(size == n){
            return true;
        }else{
            return false;
        }
    }

    public void cqinsert(int val){
        if(size == 0){
            f = r = 0;
            arr[0] = val;
        }
        else if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(r < n-1){
            r++;
            arr[r] = val;
        }
        else if(r == n-1){
            r = 0;
            arr[0] = val;
        }
        size++;
    }

    public int cqdelete(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else if(f == n-1){
            f = 0;
            return arr[f];
        }
        else{
            f++;
            size--;
            return arr[f];
            
        }
        
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(f <= r){
            for(int i = f ; i <= r ;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else if(r < f){
            for(int i = f ; i < arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i = 0 ; i<=r ; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
public class CircualrQueueImplementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("--------------WELCOME TO THE PROGRAMMEE-----------------");
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        CQueue q = new CQueue(n);
        System.out.println("1.ENQUEUE");
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
                    q.cqinsert(x);
                    break;

                case 2:
                    q.cqdelete();
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
