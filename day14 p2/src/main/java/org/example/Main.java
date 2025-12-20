package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

//        Transport t1 = new Cars();
//        Transport t2 = new Train();
//        Transport t3 = new Airplane();
//
//        t1.bookTicket(t1);
//        t1.bookTicket(t2);
//        t1.bookTicket(t3);

//        t1.bookTicket(3);
//        t2.bookTicket(2);
//        t3.bookTicket(1);
//        System.out.println("Car price: " + t1.calculatePrice(3));
//        System.out.println("Train price: " + t2.calculatePrice(2));
//        System.out.println("Airplane price: " + t3.calculatePrice(1));

//        vehicleRentalSystem :

        Scanner input = new Scanner(System.in);
        List<Vehicle> rentedVehicle = new ArrayList<>();
        int userChoice = 0;

        do {

            try {
                
                System.out.print("welcome ToTuq Car dealership please press : \n" +
                        "1. to rent a car\n" +
                        "2. to rent a bike\n" +
                        "3. to rent a Truck\n" +
                        "4. to view Rented Vehicles\n" +
                        "5. to exit\n" +
                        "your choice:");
                userChoice = input.nextInt();
                input.nextLine();

                if (userChoice == 1) {

                    System.out.print("Enter Car Model: ");
                    String carModel = input.nextLine();

                    System.out.print("Enter number of rental days: ");
                    int days = input.nextInt();

                    Vehicle car = new Car(carModel, days);
                    rentedVehicle.add(car);
                    System.out.println("\ndone the Car rented successfully!");
                    car.displayDetails();

                } else if (userChoice == 2) {

                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = input.nextLine();

                    System.out.print("Enter number of rental hours: ");
                    int hours = input.nextInt();

                    Vehicle bike = new Bike(bikeBrand, hours);
                    rentedVehicle.add(bike);
                    System.out.println("\ndone the Bike rented successfully!");
                    bike.displayDetails();

                } else if (userChoice == 3) {

                    System.out.print("Enter Truck Type: ");
                    String truckType = input.nextLine();

                    System.out.print("Enter number of rental weeks: ");
                    int weeks = input.nextInt();

                    Vehicle truck = new Truck(truckType, weeks);
                    rentedVehicle.add(truck);
                    System.out.println("\ndone the Truck rented successfully!");
                    truck.displayDetails();

                } else if (userChoice == 4) {

                    for (Vehicle v : rentedVehicle) {
                        System.out.println("-------------------------------------------------");
                        v.displayDetails();
                    }

                } else if (userChoice == 5) {

                    System.out.println("Thank you for using ToTuq Car dealership appplication");

                } else {

                    System.out.println("invalid input !! ");

                }
            }catch (InputMismatchException e){
                System.out.println("invald input please follow instrucion correctly");
                input.nextLine();
            }
          } while (userChoice != 5);

    }
}