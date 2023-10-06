package com.assignment1_easy;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length: ");
        float l = in.nextFloat();

        System.out.print("Enter the breadth: ");
        float b = in.nextFloat();

        double p = 2* (l + b);
        System.out.print("The perimeter of Rectangle is : " + p);

    }
}
