package com.assignment1_easy;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        /*
            formula: V = Base Area * height
            here Base area is rectangle so Base Area = l * b
            so formula  = l * b * h

         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of Base area: ");
        float l = in.nextFloat();

        System.out.print("Enter the breadth of Base area: ");
        float b = in.nextFloat();

        System.out.print("Enter the height: ");
        float h = in.nextFloat();

        double v = l * b * h;
        System.out.print("The Volume of Prism is : " + v);





    }
}
