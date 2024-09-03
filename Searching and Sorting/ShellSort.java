import java.util.Scanner;

class Shell{
    int []arr;

    public Shell(int[] arr) {
        this.arr = arr;
    }

    public void sort(int arr[]){
        int n = arr.length;
        for(int gap = n / 2 ; gap >= 1 ; gap = gap/2){
            for(int j = gap ; j < n ; j++){
                for(int i = j - gap ; i >= 0 ; i = i - gap){
                    if(arr[i + gap] > arr[i]){
                        break;
                    }else{
                        int swap=arr[i + gap];
                        arr[i + gap]=arr[i];
                        arr[i]=swap;
                    }
                }
            }
        }
    }

}
public class ShellSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        Shell s = new Shell(arr);
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("UnSorted Elements: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        s.sort(arr);
        System.out.println();
        System.out.println("Sorted Elements: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
