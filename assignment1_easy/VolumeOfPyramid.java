package com.assignment1_easy;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        // formula: V=(lwh)/3

        Scanner in = new Scanner(System.in);
        System.out.print("Enter base length: ");
        float l = in.nextFloat();

        System.out.print("Enter base width: ");
        float b = in.nextFloat();

        System.out.print("Enter pyramid height: ");
        float h = in.nextFloat();

        double V = (l * b * h)/3;
        System.out.print("The volume of Pyramid is : " + V);

    }
}
