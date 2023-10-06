package com.assignment1_easy;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number which factor you need to find : ");
        int num = in.nextInt();

        int n = 1;
        int rem = 0;

        while (num > 0){
             rem = num % n;
             if (rem == 0){
                 System.out.println(n);
             }
             if( n < 0){ // this if is used to stop getting negative factors
                 break;
             }

             n++;
        }
    }
}
