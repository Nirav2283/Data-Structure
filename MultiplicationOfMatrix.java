
import java.util.*;
public class MultiplicationOfMatrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][2];
        int arr2[][] = new int[2][3];

        System.out.println("Enter elements in array 1: ");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements in array 2: ");
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        
        int arr3[][] = new int[3][3];
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                arr3[i][j] = (arr1[i][0])*(arr2[0][j]) + (arr1[i][1])*(arr2[1][j]);
            }
        }

        System.out.println("Multiplication of the matrix is: ");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println(" ");

        }

    }
}
