public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int [] arr1 = {2,4,4,5,6};
        
        System.out.println("Array Before: ");
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.print(arr1[i] +" ");
        }

        int index = 0;
        for(int i = 0 ; i < arr1.length ;i++){
            int j;
            for(j =0 ; j < index ; j++){
                if(arr1[i] == arr1[j]){
                    break;

                }
            }
            if(j == index){
                arr1[index] = arr1[i];
                index++;
    
            }
        }
        
       
        System.out.println(" ");

        System.out.println("After removing element: ");

        for(int k = 0 ; k < index ; k++){
            System.out.println(arr1[k]+" ");
        }


    }
}
