package com.java;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Looping is a feature that facilitates the execution of a set of
        // instructions repeatedly until a certain condition holds false.
        // Java provides three types of loops namely the for loop, the while loop,
        // and the do-while loop. Loops are also known as Iterating statements or
        // Looping constructs in Java.


// FOR LOOP: If you know how many times the loop will execute
        /*
            for loop syntax:
                for (initialisation; condition; increment/decrement ){
                    //body
                }
         */

        /*
            qn1: Print numbers from 1:5

            for (int i = 1; i < 6; i++){
                System.out.println(i);
            }
        */

        /*
            QN: print the number from 1 to n where n = defined by user at runtime

            System.out.print("Enter the number : ");
            Scanner in =  new Scanner(System.in);
            int n = in.nextInt();

            for (int i = 1; i <= n; i++){
                System.out.println(i);
            }

         */

// WHILE LOOP: Here first condition will check then only it will execute
        /*

            While loop syntax:
                while(condition){
                    //body
                }
         */

        // QN: print number from 1 to 5

        /*
            method 1

            int i = 1;
            int n = 5;
            while (i<=5){
                System.out.println(i);
                i++;
            }

           method 2

        System.out.print("Enter the number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i = 1;
        while (i<=num){
            System.out.println(i);
            i++;
        }

         */


//DO WHILE LOOP: The program is going to execute at least once even if the condition is false
        /*

         Do while loop syntax:
                do {
                //body
                } while (condition);

         */

        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int n = 1;
        do {
            System.out.println(n);
            n++; // if you will not put this condition then it will not going to end
        }while (n<=num);






    }
}
