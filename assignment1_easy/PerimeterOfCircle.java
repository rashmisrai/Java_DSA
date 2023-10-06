package com.assignment1_easy;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        float radius = in.nextFloat();
        double p = 2 * 3.14 * radius;

        System.out.print("The perimeter of Circle is : " + p);

    }
}
