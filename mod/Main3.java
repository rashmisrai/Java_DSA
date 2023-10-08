package com.mod;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Id");
        String cid=sc.next();
        System.out.println("Enter Customer Name");
        String name=sc.next();
        System.out.println("Enter Phone Number");
        long phone=sc.nextLong();
        System.out.println("Enter Email Id");
        String email=sc.next();
        System.out.println("Enter type");
        String type=sc.next();
        System.out.println("Enter Price");
        double price = sc.nextDouble();

        CustomerDetails cd = new
                CustomerDetails(cid,name,phone,email,type,price);
        if(cd.validateCustomerId()==false){
            System.out.println("Provide a proper Customer Id");
            return;
        }
        System.out.printf("Amount to be paid by the Customer %.2f\n",cd.calculateDiscount());
    }
}
