package Recursion;
// Check palindrome by using recursion 
public class PalindromeRecursion {
    
    static boolean isPalindrome(String s, int start, int end){
        if (start >= end) 
            return true;
        if (s.charAt(start) != s.charAt(end)) 
            return false;
        return isPalindrome(s, start+1, end-1);
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println(isPalindrome("nitin", 0 , 4));
    }

}
