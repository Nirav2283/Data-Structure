import java.util.Random;
public class Hashing{
    public static void main(String[] args) {
        int arr[] = new int[15];
        int hashtable[] = new int[20];
        Random r = new Random();
        
        for(int i = 0 ; i < 15 ; i++){
            arr[i] = r.nextInt(100000, 999999);
        }
        for(int i = 0 ; i < 15 ; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0 ; i < 15 ; i++){
            int x = (arr[i] % 18) + 2;
        }
        
    }
}