package com.mod;

public class Hospital {
    private String hospitalName;
    private long contactNumber;
    private String city;
    public Hospital(String hospitalName, long contactNumber, String city){
        this.hospitalName=hospitalName;
        this.contactNumber=contactNumber;
        this.city=city;
    }
    public String getHospitalName(){
        return hospitalName;
    }
    public void setHospitalName(String hospitalName){
        this.hospitalName=hospitalName;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
}
