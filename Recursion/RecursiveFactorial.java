package Recursion;
// Factorial using recursion
public class RecursiveFactorial {
    
    static int factorial(int n){
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }

    // Driver code
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of "+ n + " is : "+factorial(n));
    }
}
