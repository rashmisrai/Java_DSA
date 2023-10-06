package com.assignment1_easy;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        // formula: 3.14 * r * r * h/3

        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = in.nextFloat();

        System.out.print("Enter height: ");
        float h = in.nextFloat();

        double v = 3.14 * (r * r) * (h/3);
        System.out.print("The volume of Cone is : " + v);
    }
}
