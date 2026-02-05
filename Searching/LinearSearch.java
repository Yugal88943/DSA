package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; 
        int n = 0, choice, key;
        boolean found;

        do{
            System.out.println("\n ---Linear Search Menu---");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Linear Search");
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
                    found=false;

                    for(int i=0; i<n; i++){
                        if (arr[i] == key) {
                            System.out.println("Element found at index: " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) 
                        System.out.println("Element not found");
                        break;
                    
                case 4:
                    System.out.println("Exiting Program");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        
        while (choice != 4);
        sc.close();
    }
}
