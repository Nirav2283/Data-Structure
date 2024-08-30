class Sort{
    int arr[];

    public Sort(int [] arr){
        this.arr = arr;
    }
    public void countSort(int arr[] , int n){
        int output [] = new int[arr.length];
        int max = arr[0];
        //finding max element from the array
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        //make a new array
        int [] c = new int[max + 1];
        for(int i = 0 ; i <= max ;i++){
            c[i] = 0;
        }

        for(int i = 0 ; i < arr.length ; i++){
            c[arr[i]]++;
        }

        for(int i = 1 ; i <= max ; i++){
            c[i] = c[i] + c[i - 1];
        }

        for(int i = 0 ; i < arr.length ; i++){
            output[c[arr[i]] - 1] = arr[i];
            c[arr[i]]--;
        }

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = output[i];
        }
    }
}
public class CountingSort {
    public static void main(String[] args) {
        
        int arr [] = {4,3,3,8,2,1,2};
        Sort cs = new Sort(arr);
        System.out.println("Unsorted array: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        cs.countSort(arr, arr.length);
        System.out.println();
        System.out.println("sorted array: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
