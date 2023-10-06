package com.java;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        Scanner inp = new Scanner(System.in);
        int b = inp.nextInt();

        System.out.print("Enter third number: ");
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();

        if (a>b && a>c){
            System.out.print("The largest number is : " + a);
        } else if (b>a && b>c) {
            System.out.print("The largest number is : " + b);
        }else {
            System.out.print("The largest number is : " + c);
        }
    }
}
