//Selection Sort 
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,6,-1,0,4,7,9,8,-2};

        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;

                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int num : arr){
            System.out.print(num + " ");

        }
    }
    
}
