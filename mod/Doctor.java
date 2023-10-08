package com.mod;

public class Doctor {
    private String doctorId;
    private String doctorName;
    private String specialization;
    private Hospital hospital;
    public Doctor(String doctorId, String doctorName, String specialization,
                  Hospital hospital){
        this.doctorId=doctorId;
        this.doctorName=doctorName;
        this.specialization=specialization;
        this.hospital=hospital;
    }
    public void setDoctorId(String doctorId){
        this.doctorId=doctorId;
    }
    public String getDoctorId(){
        return doctorId;
    }
    public void setDoctorName(String doctorName){
        this.doctorName=doctorName;
    }
    public String getDoctorName(){
        return doctorName;
    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setHospital(Hospital hospital){
        this.hospital=hospital;
    }
    public Hospital getHospital(){
        return hospital;
    }
}
