package com;

import java.time.LocalDate;

public class Young {
    private String name;
    private String surname;
    private String otchestvo;
    private String position;
    private double moneySalary;
    private LocalDate DateOfBirth;

    public Young(String name, String surname, String otchestvo, String position, double moneySalary, LocalDate DateOfBirth){
        this.setName(name);
        this.setSurname(surname);
        this.setOtchestvo(otchestvo);
        this.setPosition(position);
        this.setMoneySalary(moneySalary);
        this.setDateOfBirth(DateOfBirth);
    }
    public Young(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.strip();

        for (int i = 0; i < this.name.length(); i++) {
            if (!Character.isAlphabetic(this.name.charAt(i)) || this.name.charAt(i)=='-'){
                return;
            }
        }
        String firstPart = this.name.substring(0,1);

        String upperCaseChar = this.name.toUpperCase();
        if (firstPart.equals(upperCaseChar)){
            String lastPart = this.name.substring(1);
            if (lastPart.equals(lastPart.toLowerCase())){
                this.name=name;
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.strip();
        for (int i = 0; i < this.surname.length(); i++) {
            if (!Character.isAlphabetic(this.surname.charAt(i)) || this.surname.charAt(i)=='-'){
                return;
            }
        }
        String firstPart = this.surname.substring(0,1);

        String upperCaseChar = this.surname.toUpperCase();
        if (firstPart.equals(upperCaseChar)){
            String lastPart = this.surname.substring(1);
            if (lastPart.equals(lastPart.toLowerCase())){
                this.surname=surname;
            }
        }
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo.strip();
        for (int i = 0; i < this.otchestvo.length(); i++) {
            if (!Character.isAlphabetic(this.otchestvo.charAt(i)) || this.otchestvo.charAt(i)=='-'){
                return;
            }
        }
        String firstPart = this.otchestvo.substring(0,1);

        String upperCaseChar = this.otchestvo.toUpperCase();
        if (firstPart.equals(upperCaseChar)){
            String lastPart = this.otchestvo.substring(1);
            if (lastPart.equals(lastPart.toLowerCase())){
                this.otchestvo=otchestvo;
            }
        }
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

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate DateOfBirth) {

        if (LocalDate.now().getYear()-DateOfBirth.getYear() >=16){
            this.DateOfBirth = DateOfBirth;
        }
    }

    @Override
    public String toString() {
        return "Самы молодой сотрудник:\n"+
                getSurname()+ " " +getName()+ " " +getOtchestvo()+
                "\nЗанимающий должность: " +getPosition()+
                "\nИмеющий зарплату: " +getMoneySalary()+
                "\nРожденный: " + getDateOfBirth();
    }
}
