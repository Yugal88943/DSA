package Recursion;

import java.util.Scanner;

// Factorial Program --> eg: 4! = 4*3*2*1 = 24
public class Factorial {

    static int factorial(int n){
        if (n == 0) 
            return 1;
        return n * factorial(n-1);
    }

    //Driver Code
    public static void main(String[] args) {

        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of "+ num + " is "+ factorial(num));
        sc.close();
    }
}
