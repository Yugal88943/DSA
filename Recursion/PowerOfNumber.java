package Recursion;
// Power of a number (x^n)
public class PowerOfNumber {
    static int powerNumber(int x, int n){
        if (n == 0) 
            return 1;
        return x*powerNumber(x, n-1);
    }

    // Driver code
    public static void main(String[] args) {
        System.out.println(powerNumber(5, 2));//25
    }
}
