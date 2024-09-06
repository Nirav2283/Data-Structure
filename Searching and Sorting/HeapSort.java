import java.util.Scanner;

class Heap {
    int[] arr;
    int n;

    public Heap(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    // Function to heapify a subtree rooted with node i
    public void heapify(int i, int n) {
        int maxIndex = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && arr[leftChild] > arr[maxIndex]) {
            maxIndex = leftChild;
        }

        if (rightChild < n && arr[rightChild] > arr[maxIndex]) {
            maxIndex = rightChild;
        }

        if (i != maxIndex) {
            // Swap and continue heapifying
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            heapify(maxIndex, n);
        }
    }

    // Build a max heap
    public void buildMaxHeap() {
        // Start from the last internal node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(i, n);
        }
    }

    // Heap sort
    public void heapSort() {
        buildMaxHeap();

        for (int i = n - 1; i >= 1; i--) {
            // Swap the root(maximum) of the heap with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Reduce the heap size and heapify the root
            heapify(0, i);
        }
    }
}

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Heap heap = new Heap(arr, m);
        
        System.out.println("Unsorted Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        heap.heapSort();
        
        System.out.println();
        System.out.println("Sorted Elements: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
