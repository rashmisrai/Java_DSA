package com.assignment1_easy;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        //qn: Find the Area of Circle and take radius from user

        System.out.print("Enter radius: ");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();

        double ans = 3.14*radius*radius;
        System.out.print("The area of circle having the radius " + radius + " is " + ans);
    }
}
