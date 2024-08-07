//Bubble sort
import java.util.Scanner;

public class BubbleSort {
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

        for(int i = 0 ; i < arr.length - 1 ;i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.print("Sorted Element is: ");
        for(int i = 0 ; i < arr.length  ; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
