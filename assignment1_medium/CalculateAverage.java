package com.assignment1_medium;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int sum = 0;
         double average = 0;

        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
            average = sum/n;

        }
        System.out.println(average);
    }
}
