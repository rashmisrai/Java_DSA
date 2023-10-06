package com.assignment1_easy;

import java.util.Scanner;

public class AreaOf_IsoscelesTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        float a = in.nextFloat();

        System.out.print("Enter height: ");
        float b = in.nextFloat();

        double ans = 0.5 * (a * b);
        System.out.print("The area of isosceles triangle is : " + ans );
    }
}
