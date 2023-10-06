package com.assignment1_easy;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        // formula: 6*a*a

        Scanner in = new Scanner(System.in);
        System.out.print("Enter side: ");
        float a = in.nextFloat();

        double t = 6 * (a * a);
        System.out.println("The Total Surface area of cube is : " + t);
    }
}
