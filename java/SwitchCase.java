package com.java;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {


          // Qn: Enter the name of fruit and check whether they belong to particular category or not

                System.out.print("Enter fruit name: ");
                Scanner in = new Scanner(System.in);
                String fruit = in.next();

                switch (fruit) {
                    case "Mango" -> System.out.print("This is king of fruits ");
                    case "Apple" -> System.out.println("This is red fruit");
                    case "Banana" -> System.out.println("This is yellow fruit");
                    case  "Grapes" -> System.out.println("This is sour fruit");
                    default -> System.out.println("Please enter the valid fruit");
                }


        /*
            Qn: Enter the day number and check whether it is weekend or weekday

            System.out.print("Enter the day number: ");
            Scanner in = new Scanner(System.in);
            int day = in.nextInt();

            switch (day){
                case 1,2,3,4,5 -> System.out.println("This is weekday");
                case 6,7 -> System.out.println("This is weekend");
                default -> System.out.println("This is not included in week . Please correct it");
            }

         */
    }
}
