//Merge Sort : Divide and Conquer
import java.util.Arrays;

public class MergeSort {
   
    // Main merge sort function
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid =  left + (right-left)/2;
            // Sort Left Half
            mergeSort(arr, left, mid);
            // Sort Right Half
            mergeSort(arr, mid+1, right);
            // Merge Both Halves
            merge(arr, left, mid, right); 
        }
    }

    // Merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] l = new int[n1];
        int[] r = new int[n2];

        // Copy data to temp arrays
        for(int i=0; i<n1; i++)
            l[i] = arr[left+i];
        for(int j=0; j<n2; j++)
            r[j] = arr[mid+1+j];

        int i = 0, j=0, k=left;

        // Merge temp arrays back into array/arr
        while (i<n1 && j<n2) {
            if (l[i]<=r[j]) {
                arr[k++] = l[i++];
            }
            else{
                arr[k++] = r[j++];
            }
        }

        // Copy remaining elements
        while (i<n1) {
            arr[k++] = l[i++];
        }
        while (j<n2) {
            arr[k++] = r[j++];
        }
    }

    // Driver Code
    public static void main(String[] args) {
        
        int[] arr = {38,27,43,3,9,82,10};
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);
        
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));

    }
}

