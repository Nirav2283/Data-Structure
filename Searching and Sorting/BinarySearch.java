//Binary Search
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int m = sc.nextInt();
        int arr [] = new int[m];
        System.out.println("Enter a element: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array element is: ");
        for(int i = 0 ; i < arr.length ;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        System.out.println("Enter a number to search: ");
        int n = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = (left + right) / 2;
            if(arr[mid] > n){
                right = mid - 1;
            }
            else if(arr[mid] == n){
                System.out.println("Found at: "+mid);
                break;
            }else{
                left = mid + 1;
            }
            
            System.out.println("Element not found");
            break;
        }
       
    }
}
