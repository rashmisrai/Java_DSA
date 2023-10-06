package com.java;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        //Fibonacci Numbers Problem: The first two fibonacci number will be 0 and 1 by default.
        // Now the series will go on by adding previous two numbers , so the third number will
        // be 0 + 1 = 1 , fourth number will be 1+ 1= 2 and so on...

        //qn: Print the value of nth fibonacci number
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();

        int a = 0;
        int b = 1;

        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.print("The value of " + n + "fibonacci number is : " + b);

    }
}
