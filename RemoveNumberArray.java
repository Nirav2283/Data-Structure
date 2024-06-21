import java.util.Scanner;

public class RemoveNumberArray {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int j = sc.nextInt();
        int arr1 [] = new int[j];
        System.out.println("Enter the elemnts: ");
        for(int i = 0 ; i < j ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the index which we want to delete: ");
        int n = sc.nextInt();

        int arr2[] = new int[j-1];

        for(int i = 0 ; i < arr2.length ; i++){
            if(i == n || i > n){
                arr2[i] = arr1[i+1];
            }
            else{
                arr2[i] = arr1[i];
            }
        }
        System.out.println("New Array is: ");
        for ( int i = 0 ; i < arr2.length ; i++){
            System.out.println(arr2[i]);
        }



        
    }
}
