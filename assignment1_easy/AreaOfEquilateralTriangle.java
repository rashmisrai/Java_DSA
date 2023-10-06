package com.assignment1_easy;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side: ");
        float side = in.nextFloat();

        double a = 1.732/4 * (side*side);
        System.out.print("The area of Equilateral Triangle is : " + a);
    }
}
