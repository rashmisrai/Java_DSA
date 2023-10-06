package com.assignment1_easy;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Enter sides : ");
        float a = i.nextFloat();

        double s = 4 * a;
        System.out.print("The perimeter of Square is : " + s);
    }
}
