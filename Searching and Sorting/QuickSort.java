import java.util.*;
class Quick{
    int []arr;

    public Quick(int[] arr) {
        this.arr = arr;
    }

    public void sort(int lb , int ub){
        if (lb < ub) {
            int i = lb;
            int j = ub;
            int key = arr[lb];

            while (i < j) {
                while (i <= ub && arr[i] <= key) {
                    i++;
                }
                while (j >= lb && arr[j] > key) {
                    j--;
                }
                if (i < j) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
            int swap = arr[lb];
            arr[lb] = arr[j];
            arr[j] = swap;

            sort(lb, j - 1);
            sort(j + 1, ub);
        }
    }

    public void printArray() {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        Quick q = new Quick(arr);
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array:");
        q.printArray();
        
        q.sort(0, m - 1);

        System.out.println("Sorted Array:");
        q.printArray();
    }
}
