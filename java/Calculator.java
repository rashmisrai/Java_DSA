package com.java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Write a simple calculator program
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the first number : ");
                int a = in.nextInt();

                System.out.print("Enter the second number : ");
                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
                if (op == 'x' || op == 'X') {
                    break;
                }
            }
            else if (op == 'x' || op == 'X') {
               break;
            }
            else {
                System.out.println("Invalid data ");
            }

            System.out.println("The ans is : " + ans);

        }

    }
}
