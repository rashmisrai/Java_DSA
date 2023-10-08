package com.mod;

public class BoatRideBooking extends Booking{
    private float noOfHours;
    private String guide;
    public BoatRideBooking(String customerName, String cityName, String
            phoneNumber, int noOfPeople, float noOfHours, String guide){
        super(customerName,cityName,phoneNumber,noOfPeople);
        this.noOfHours=noOfHours;
        this.guide=guide;
    }
    public double calculateTotalAmount() {
        return guide.toLowerCase().equals("yes") ? noOfPeople*80 +
                noOfHours*300 + 150 : noOfPeople*80 + noOfHours*300;
    }
}