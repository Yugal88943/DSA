// Quick Sort : small -- pivot -- larger
import java.util.Arrays;

public class QuickSort {

    // Main quick sort function
    public static void quickSort(int[] arr, int low, int high){
        if (low<high) {
            int pivotIndex = partition(arr, low, high);
            
            // Sort elements before and after partition
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    // Partition Function 
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; // Choose last element as pivot
        int i = low-1;
        for(int j=low; j<high; j++){
            if (arr[j]<pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    // Driver code
    public static void main(String[] args) {
        
        int[] arr = {34,2,56,4,89,65,1,44};
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));

    }
}
