package com.assignment1_easy;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        // formula: 2 * (sum of the length of parallel sides) i.e. 2(a+b)

        Scanner in = new Scanner (System.in);
        System.out.print("Enter first length: ");
        float l1 = in.nextFloat();

        System.out.print("Enter second length: ");
        float l2 = in.nextFloat();

        double p = 2 * (l1 + l2);
        System.out.print("The perimeter of Parallelogram is : " + p);
    }
}
