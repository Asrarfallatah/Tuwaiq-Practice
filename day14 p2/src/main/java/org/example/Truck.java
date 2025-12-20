package org.example;

public class Truck implements Vehicle{

    private String type;
    private int week;
    public static double dailyRate = 10.0;

    public Truck(){}

    public Truck(
            String type,
            int week
    ){
        this.type = type;
        this.week = week;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setWeek(int week) {
        this.week = week;
    }
    public static void setDailyRate(double dailyRate) {
        Truck.dailyRate = dailyRate;
    }

    public int getWeek() {
        return week;
    }
    public String getType() {
        return type;
    }
    public static double getDailyRate() {
        return dailyRate;
    }

    @Override
    public double calculateRecentCost() {
        return week * dailyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type : " + type);
        System.out.println("Rental Week : " + week);
        System.out.println("Total Cost : $" + calculateRecentCost());

    }
}
