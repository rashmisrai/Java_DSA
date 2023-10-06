package com.assignment1_easy;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length : ");
        float l = in.nextFloat();

        System.out.print("Enter the breadth: ");
        float b = in.nextFloat();

        double area = l * b;
        System.out.print("The area of Rectangle is : " + area );
    }
}
