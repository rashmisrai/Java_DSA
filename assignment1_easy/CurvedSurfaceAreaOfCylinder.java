package com.assignment1_easy;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        // formula: 2πrh

        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = in.nextFloat();

        System.out.print("Enter height: ");
        float h = in.nextFloat();

        double c = 2 * 3.14 * r * h;
        System.out.print("The Curved surface area of cylinder is : " + c);
    }
}
