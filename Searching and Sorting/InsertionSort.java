import java.util.*;
public class InsertionSort {
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

        int i = 1;
        while(i < arr.length){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            i++;
        }

        System.out.print("Sorted Element is: ");
        for(int k = 0 ; k < arr.length  ; k++){
            System.out.print(" "+arr[k]);
        }
    } 
}
