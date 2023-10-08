package com.mod;

public class BoatHouseBooking extends Booking{
    int noOfDays;
    String foodType;
    public BoatHouseBooking(String customerName, String cityName, String
            phoneNumber, int noOfPeople, int noOfDays, String foodType){
        super(customerName,cityName,phoneNumber,noOfPeople);
        this.noOfDays=noOfDays;
        this.foodType=foodType;
    }
    public double calculateTotalAmount() {

        return foodType.toLowerCase().equals("nonveg") ? noOfPeople*800 +
                noOfDays*3000 + 500 : noOfPeople*800 + noOfDays*3000 + 250;
    }
}