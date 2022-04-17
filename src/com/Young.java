package com;

import java.util.Date;

public class Young {
    private String name;
    private String surname;
    private String otchestvo;
    private String position;
    private double moneySalary;
    private Date DateOfBirth;

    public Young(String name,String surname, String otchestvo, String position,double moneySalary, Date DateOfBirth){
        this.name=name;
        this.name=name;
        this.surname=surname;
        this.otchestvo=otchestvo;
        this.position=position;
        this.moneySalary=moneySalary;
        this.DateOfBirth=DateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getMoneySalary() {
        return moneySalary;
    }

    public void setMoneySalary(double moneySalary) {
        if (moneySalary>=0){
            this.moneySalary = moneySalary;
        }
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}
