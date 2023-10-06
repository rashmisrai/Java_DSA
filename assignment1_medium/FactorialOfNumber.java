package com.assignment1_medium;

import java.util.Scanner;

public class FactorialOfNumber {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
   
}

