package com.mod;

import java.util.Scanner;

public class Main2 {
    public static Doctor createDoctorDetails()
    {
        Scanner sc=new Scanner(System.in);
        String dname, spec, did, hname, city;
        long pnumber;
        System.out.println("Enter Hospital Name");
        hname=sc.next();
        System.out.println("Enter Contact Number");
        pnumber=sc.nextLong();
        System.out.println("Enter City");
        city=sc.next();

        Hospital hos = new Hospital(hname,pnumber,city);
        System.out.println("Enter Doctor Id");
        did=sc.next();
        System.out.println("Enter Doctor Name");
        dname=sc.next();
        System.out.println("Enter Specialization");
        spec=sc.next();

        Doctor d = new Doctor(did,dname,spec,hos);
        return d;
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        Doctor d = createDoctorDetails();

        System.out.println("Doctor id: "+d.getDoctorId());
        System.out.println("Doctor name: "+d.getDoctorName());
        System.out.println("Specialization: "+d.getSpecialization());
        System.out.println("Hospital Name: "+d.getHospital().getHospitalName());
        System.out.println("Contact Number: "+d.getHospital().getContactNumber());
        System.out.println("City: "+d.getHospital().getCity());
    }
}
