package com.java;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Input a salary and check the condition that if the salary is greater than 10k then give bonus of 2k else give bonus of 1k

        /*
            Syntax of if statements:
                if(expressions T or F){
                         //BODY
                }
                else{
                }
         */

        System.out.print("Enter the salary of employee : ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

//        if(salary>=10000) salary = salary + 2000;
//        else salary = salary + 1000;
//
//        System.out.println("The new salary given to the employee is : " + salary);

        if (salary > 10000 & salary <20000) {
            salary+=2000;
        }
        else if (salary > 20000) {
            salary+=3000;
        }
        else{
            salary+=1000;
        }

        System.out.println("New salary : " + salary);



    }
}
