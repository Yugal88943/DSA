package Recursion;
import java.util.Scanner;

//Fibonacci Series --> 0,1,0+1=1,1+1=2,2+1=3...
public class Fibonacci {
    static int fibonacci(int n){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    //Driver Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element: ");
        
        int terms = sc.nextInt();
        for(int i = 0; i<terms; i++){
            System.out.print(fibonacci(i) + " ");
            sc.close();
        } 
    }
}
