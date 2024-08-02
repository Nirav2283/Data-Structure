import java.util.Scanner;
public class LinearSearch {
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
        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == n){
                System.out.println("Element "+arr[i]+" Found at: "+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }
    }
    
}