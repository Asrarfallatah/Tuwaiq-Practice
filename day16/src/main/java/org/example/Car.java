package org.example;

public class Car implements Vehicle{

    private String model ;
    private int days;
    public static double dailyRate = 50;


    public Car(){}

    public Car(
            String model ,
            int days
      ){
        this.model = model;
        this.days = days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public static void setDailyRate(double dailyRate) {
        Car.dailyRate = dailyRate;
    }

    public int getDays() {
        return days;
    }
    public String getModel() {
        return model;
    }
    public static double getDailyRate() {
        return dailyRate;
    }

    @Override
    public double calculateRecentCost() {
        return days * dailyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model : " + model);
        System.out.println("Rental Days : " + days);
        System.out.println("Total Cost : $" + calculateRecentCost() );

    }

}
