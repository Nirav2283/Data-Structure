import java.util.*;
public class AdditionOfMatrix {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("enter number of cols: ");
        int n = sc.nextInt();

        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];
        System.out.println("Enter elements in array 1: ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr1[i][j]  = sc.nextInt();
            }
        }
        System.out.println("Enter elements in array 2: ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr2[i][j] = sc.nextInt();
            }

        }
        int arr3[][] = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        System.out.println("Addition of the matrix is: ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println(" ");

        }





    }
}
