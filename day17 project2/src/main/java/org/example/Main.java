package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Routes route1 = new Routes("yanbu", "madinah", 202000.22);
        Routes route2 = new Routes("riyadh", "meccah", 404000.44);

        Car car1 = new Car("7653 | TNJ", route1, 4);
        Car car2 = new Car("4565 | KSA", route2, 0);

        ArrayList <Passenger> myPassengers = new ArrayList<>();

        myPassengers.add(new SubscribePassengers("Asrar  fallatah", "Fall2002"));
        myPassengers.add(new SubscribePassengers("Anwaar fallatah", "Fall2002"));

        myPassengers.add(new NonSubscribePassengers("Reham  fallatah", "Fall2002", false));
        myPassengers.add(new NonSubscribePassengers("Refal  fallatah", "Fall2002", true));


        Passenger passengerToReserve = myPassengers.get(0);
        Passenger passengerToFail = myPassengers.get(3);


        System.out.println("\nwelcome to car pooling system ");
        System.out.println( "⢀⣀⣀⣀⠀⠀⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⢸⣿⣿⡿⢀⣠⣴⣾⣿⣿⣿⣿⣇⡀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⢸⣿⣿⠟⢋⡙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣿⡿⠓⡐⠒⢶⣤⣄⡀⠀\n" +
                            "⠸⠿⠇⢰⣿⣿⡆⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿⡷⠈⣿⣿⣉⠁\n" +
                            "⠀⠀⠀⠀⠈⠉⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠈⠉⠁⠀⠈⠉⠉⠀\n" +
                            "\nreversing status : ");

        for (Passenger p : myPassengers) {

            try {

                p.reserveCar(car1);
                System.out.println("done for " + p.getPassengerName() + " reserved Car " + car1.getCode() + " successfully. Remaining Capacity: " + car1.getMaxCapacity());

            } catch (IllegalArgumentException e) {

                System.out.println("there is a reservse error for " + p.getPassengerName() + "  : " + e.getMessage());

            }

        }

        System.out.println(" ");

        try {

            System.out.println("reserveing car " + car2.getCode() + " with a Capacity : " + car2.getMaxCapacity() + "  for " + passengerToFail.getPassengerName() );
            passengerToFail.reserveCar(car2);

            System.out.println("done reserveing the car " + car2.getCode() + " successfully .");

        }catch (IllegalArgumentException e) {

            System.out.println("there is a reservse error wich is : " + e.getMessage());
        }

        System.out.println("\n-------------------------------------\n");

            System.out.println("all passengers Information  :  \n");

            for (Passenger p : myPassengers) {

                System.out.println(p);
                System.out.print("----\n");

            }

    }

}