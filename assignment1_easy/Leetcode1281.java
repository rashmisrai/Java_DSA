package com.assignment1_easy;

import java.util.Scanner;

public class Leetcode1281 {
    public static void main(String[] args) {
        //qn: Subtract the Product and Sum of Digits of an Integer

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = in.nextInt();

        int prod = 1;
        int sum = 0;

        while(n>0){
            prod = prod * (n % 10);
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println("The difference is : " + (prod - sum));
    }
}
