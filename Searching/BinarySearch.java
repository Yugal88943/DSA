// Binary Search
package Searching;
import java.util.Scanner;

public class BinarySearch {
    
    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];// OK
        int n = 0, choice, key;
        
        do{
            System.out.println("\n ---Binary Search---");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Binary Search");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();
                    System.out.println("Enter Elements: ");

                    for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.print("Array Elements: ");
                    for(int i=0; i<n; i++){
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    key = sc.nextInt();
                    int low = 0, high = n-1;
                    boolean found = false;
                    while (low <= high) {
                        int mid = (low+high) / 2;
                        if (arr[mid] == key) {
                            System.out.println("Element found at index: " + mid);
                            found = true;
                            break;
                        }
                        else if (arr[mid] < key) {
                            low = mid+1;
                        }
                        else{
                            high = mid-1;
                        }
                    }

                    if (!found) 
                        System.out.println("Element not found");
                    break;

                case 4:
                    System.out.println("Exiting Program");
                    break;
                
                default:
                    System.out.println("Invalid Choice"); // break not compulsory
            }
        }
        while (choice != 4);
        sc.close();
    }
}
