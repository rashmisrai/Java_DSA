package com.assignment1_easy;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // formula: π r² h
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float r = in.nextFloat();

        System.out.print("Enter height: ");
        float h = in.nextFloat();

        double v = 3.14 * (r * r) * h;
        System.out.print("The volume of cylinder is : " + v);
    }
}
