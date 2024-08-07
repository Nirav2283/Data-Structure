//Selection sort
import java.util.Scanner;
public class SelectionSort {
    public static void main(String [] args){
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

        for(int i = 0 ; i < arr.length - 1 ; i++){
            int min = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted Element is: ");
        for(int i = 0 ; i < arr.length  ; i++){
            System.out.print(" "+arr[i]);
        }
    }
    
    
}
