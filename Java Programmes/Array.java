import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in the array are: ");
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    }
}
