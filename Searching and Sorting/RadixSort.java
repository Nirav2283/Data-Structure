class Radix{
    int []arr;

    public Radix(int[] arr) {
        this.arr = arr;
    }

    public void countSort(int arr[] , int n , int place){
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

    public int getMax(int [] arr){
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public void Radix(int arr[] , int n){
        int m = getMax(arr);
        for(int place = 1 ; m / place > 0 ; place *= 10){
            countSort(arr, n , place);
        }
    }
}
public class RadixSort {
    public static void main(String[] args) {
        int arr[] = {10 ,5 , 30 , 20 , 10};
        Radix r = new Radix(arr);
        r.Radix(arr, arr.length);
    }
}
