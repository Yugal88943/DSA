package Recursion;
// Sum of digits of a number 1234 = 1+2+3+4 = 10
public class SumOfDigits {
    
    static int sumDigits(int n){
        if (n == 0)
            return 0;
        return (n%10)+sumDigits(n/10);
    }

    // Driver code
    public static void main(String[] args) {
        System.out.println("Sum = " + sumDigits(1234));
    }
}
