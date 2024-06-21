import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean flag = false;
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(flag){
            System.out.println("Duplicate number exists");
        }else{
            System.out.println("Duplicate number doesnot Exists");
        }
    }
}