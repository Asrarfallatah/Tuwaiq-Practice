package org.example;

public class Bike implements Vehicle{

    private String brand;
    private int hour;
    public static double hourlyRate = 10;

    public Bike(){}

    public Bike(
            String brand,
            int hour
    ){
        this.brand = brand;
        this.hour = hour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public static void setHourlyRate(double hourlyRate) {
        Bike.hourlyRate = hourlyRate;
    }

    public int getHour() {
        return hour;
    }
    public String getBrand() {
        return brand;
    }
    public static double getHourlyRate() {
        return hourlyRate;
    }


    @Override
    public double calculateRecentCost() {
        return hour * hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Type : " + brand);
        System.out.println("Rental Hours : " + hour);
        System.out.println("Total Cost : $" + calculateRecentCost());
    }
}
