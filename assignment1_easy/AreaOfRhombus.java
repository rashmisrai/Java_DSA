package com.assignment1_easy;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first diagonal: ");
        float d1 = in.nextFloat();

        System.out.print("Enter second diagonal: ");
        float d2 = in.nextFloat();

        double area = (d1 * d2) / 2;
        System.out.print("The area of rhombus is "+ area);
    }
}
