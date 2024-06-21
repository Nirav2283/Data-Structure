public class MergeUnsortedArray {
    public static void main(String [] args){
        int [] arr1 = {2,5,8,9,10};
        int [] arr2 = {4,6,7,3,11};
        
        int n = arr1.length + arr2.length;

        int arr3 [] = new int[n];
        int index = 0;
        for(int i = 0 ; i < arr1.length ; i++){
            arr3[index] = arr1[i];
            index++;
        }

        for(int i = 0 ; i < arr2.length ; i++){
            arr3[index] = arr2[i];
            index++;
        }
        
        System.out.println("Merged array is: "); 
        for(int i = 0 ; i<arr3.length ; i++){
            System.out.print(arr3[i]+",");
        }

    }
}

