package com.mod;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Customer Name");
        String cname=sc.nextLine();
        System.out.println("Enter the City name");
        String cityName=sc.nextLine();
        System.out.println("Enter the phone number");
        String phoneNumber=sc.nextLine();
        System.out.println("Enter number of people");
        int noOfPeople=Integer.parseInt(sc.nextLine());
        System.out.print("Enter the option\n1. Boat House Booking\n2. Boat Ride Booking\n");

        int choice=Integer.parseInt(sc.nextLine());
        int days=0;

        if(choice==1){
            System.out.println("Enter number of days");
            days=Integer.parseInt(sc.nextLine());
            System.out.println("Enter food type (Veg/NonVeg)");
            String foodType=sc.nextLine();

            BoatHouseBooking bh = new BoatHouseBooking(cname, cityName,
                    phoneNumber, noOfPeople, days, foodType);
            System.out.println("Your booking has been confirmed pay Rs."+bh.calculateTotalAmount());
        }
        else{
            int noOfHours=0;
            String guide="";
            System.out.println("Enter number of hours");
            noOfHours=Integer.parseInt(sc.nextLine());
            System.out.println("Do you want guide (Yes/No)");
            guide=sc.nextLine();

            BoatRideBooking br = new BoatRideBooking(cname, cityName,
                    phoneNumber, noOfPeople, noOfHours, guide);
            System.out.println("Your booking has been confirmed pay Rs."+br.calculateTotalAmount());
        }
    }
}
