package Recursion;
// Reverse a number
public class ReversingNumber {
    
    static int reverse(int n, int rev){
        if (n == 0)
            return rev;
        return reverse(n/10, rev*10+n%10);
    }

    // Driver code
    public static void main(String[] args) {
        System.out.println(reverse(123456789, 0));
    }
}
