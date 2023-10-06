package com.assignment1_easy;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // formula: V = 4/3 π r³

        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = in.nextFloat();

        double v = (1.34) * (3.14) * (r * r * r);
        System.out.print("The Volume of Sphere is : " + v);


    }
}
