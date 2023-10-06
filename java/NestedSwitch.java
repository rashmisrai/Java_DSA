package com.java;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

         System.out.print("Enter Employee Id: ");
        int EmpId = in.nextInt();


        switch (EmpId) {
            case 1 -> System.out.print("This id belongs to RASHMI RAI");
            case 2 -> System.out.print("This id belongs to SHAILAJA YADAV");
            default -> System.out.println("Invalid");
//
        }
    }
}