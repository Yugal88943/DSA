package Recursion;
// Print numbers from 1 to n
public class PrintNumbers {
    static void printNum(int n){
        if (n == 0)
            return;
        printNum(n-1);
        System.out.print(n+" ");
    }

    // Driver code
    public static void main(String[] args) {
        printNum(9);
    }
}
