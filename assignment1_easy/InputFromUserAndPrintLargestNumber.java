package com.assignment1_easy;

import java.util.Scanner;

public class InputFromUserAndPrintLargestNumber {

    //qn: Take integer inputs till the user enters 0 and print the largest number from all.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        while(true) {
            System.out.print("Enter the number: ");
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            if(n > largest){
                largest = n;
            }

        }

        if(largest == Integer.MIN_VALUE){
            System.out.print("No numbers were entered");
        }
        else {
            System.out.print("The largest number is : " + largest);
        }

    }
}
