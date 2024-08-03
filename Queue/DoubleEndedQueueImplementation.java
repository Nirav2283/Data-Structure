import java.util.Scanner;
class Double{
    int f = -1;
    int r = -1;
    int n;
    int arr [];

    public Double(int n){
        this.n = n;
        this.arr = new int[n];
    }
    public boolean isFull(){
        return (r == n-1);
    }

    public void dqinsert_front(int val){
        if (f == 0) {
            System.out.println("cannot insert at first");
            return;
        } 
        if (f == -1) {
            f = r = 0;
            
        } else {
           f--;
           arr[f] = val;
         
        }
        arr[f] = val;
        return;
        
    }

    public void dqinsert_rear(int val){
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

    public int dqdelete_front(){
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

    public int dqdelete_rear(){
        if(r == -1){
            System.out.println("Underflow");
            return 0;
        }
        if(r == f){
            r = f = -1;
        }else{
            r--;
        }
        return arr[r-1];
    }

    
    public void display(){
        for(int i = f ; i <= r ; i++){
            System.out.print(arr[i] +" ");
        }
    }


}
public class DoubleEndedQueueImplementation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Double q = new Double(5);
        q.dqinsert_front(1);
        q.dqinsert_rear(3);
        q.dqinsert_rear(2);
        q.dqinsert_rear(6);
        q.dqdelete_rear();
        q.dqdelete_front();
        q.display();
        

       
    }
}
