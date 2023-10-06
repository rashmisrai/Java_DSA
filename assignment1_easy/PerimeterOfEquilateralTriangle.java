package com.assignment1_easy;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the sides: ");
        float a = in.nextFloat();

        double p = 3 * a;
        System.out.println("The perimeter of equilateral triangle is " + p);
    }
}
