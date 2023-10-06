package com.assignment1_easy;

import java.util.Scanner;

public class InputFromUser {

    //qn: Take integer inputs till the user enters 0 and print the sum of all numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.print("Enter the number: ");
            int n = in.nextInt();

            if(n !=0){
                sum = sum + n;
            }
            if(n ==0){
                break;
            }

            System.out.println(sum);

        }
    }
}
