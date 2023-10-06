package com.assignment1_easy;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = in.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("The fibonacci series is : ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;

        }

    }




}