import java.util.Scanner;
class Merge{
    public void mergesort(int arr[] ,int low , int high){
        if(low < high){
            int mid = (low+high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr, low, mid , high);
        }
    }

    public void merge(int arr[] , int low , int mid , int high){
        int temp [] = new int[high-low+1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++; 
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, low, temp.length);
    }
    public void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
public class MergeSort {
    public static void main(String[] args) {
        Merge m = new Merge();
        int [] arr = {30,20,10,50,40};
        System.out.println("unsorted array: ");
        m.printArray(arr);
        m.mergesort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        m.printArray(arr);
    }
}
