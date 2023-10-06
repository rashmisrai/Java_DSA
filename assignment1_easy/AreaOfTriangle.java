package com.assignment1_easy;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        float base = in.nextFloat();

        System.out.print("Enter height: ");
        float height = in.nextFloat();

        double area = 0.5*(base*height);
        System.out.print("The area of triangle is : " + area);

    }
}
