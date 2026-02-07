package Recursion;
import java.util.Scanner;

class StringRecursionMenu {
    // 1. Length of a String
    static int length(String s){
        if (s.equals("")) 
            return 0;
        return 1+length(s.substring(1));
    }

    // 2. Reverse String
    static String reverse(String s){
        if (s.equals(""))
            return s;
        return reverse(s.substring(1))+s.charAt(0);
    }

    // 3. Palindrome Check
    static boolean isPalindrome(String s, int start, int end){
        if (start >= end)
            return true;
        if (s.charAt(start) != s.charAt(end))
            return false;
        return isPalindrome(s, start+1, end-1);
    } 

    // 4. Count Vowels
    static int countVowels(String s, int index){
        if (index == s.length())
            return 0;
        char ch = Character.toLowerCase(s.charAt(index));
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return 1+countVowels(s, index+1);
        return countVowels(s, index+1);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n ----STRING RECURSION MENU----");
            System.out.println("1. Find Length");
            System.out.println("2. Reverse String");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Count Vowels");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume new line

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println(length(str));
                        break;
                    
                    case 2:
                        System.out.println(reverse(str));
                        break;

                    case 3:
                        System.out.println(isPalindrome(str, 0, str.length()-1));
                        break;
                    
                    case 4:
                        System.out.println(countVowels(str, 0));
                        break;
                }
            }
        }
        while(choice != 5);
        System.out.println("Program Closed");
        sc.close();
    }
}
