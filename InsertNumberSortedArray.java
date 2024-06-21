import java.util.*;
public class InsertNumberSortedArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,2,3,5,6};
        int arr2[] = new int[6];
        System.out.println("Enter the element which you want to add: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < arr1.length ; i++){
            if(arr1[i]  < n){
                arr2[i] = arr1[i];
            }else{
                arr2[i] = n;
                for(int j = i+1 ; j < arr2.length ; j++){
                    arr2[j] = arr1[j-1];
                }
                break;
            }
            for(int k = 0 ; i < arr2.length ; i++){
                System.out.println(arr2[k]);
            }
        
    }
    
}
}
