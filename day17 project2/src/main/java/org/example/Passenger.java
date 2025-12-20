package org.example;

public abstract class Passenger {

    private String passengerName ;
    private String passengerID;
    private Car    passengerReservedCar;
    private double passengerTripCost;

    //constructor
    public Passenger(){}
    public Passenger(
            String passengerName,
            String passengerID
    ) {
        this.passengerName = passengerName;
        this.passengerID = passengerID;
        this.passengerReservedCar = null;
        this.passengerTripCost = 0.0;
    }
    public Passenger(
              String passengerName ,
              String passengerID,
              Car    passengerReservedCar,
              double passengerTripCost
    ){
        this.passengerName = passengerName;
        this.passengerID =  passengerID;
        this.passengerReservedCar = passengerReservedCar;
        this.passengerTripCost = passengerTripCost;
    }

    //setter
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }
    public void setPassengerReservedCar(Car passengerReservedCar) {
        this.passengerReservedCar = passengerReservedCar;
    }
    public void setPassengerTripCost(double passengerTripCost) {
        this.passengerTripCost = passengerTripCost;
    }

    //getter
    public String getPassengerName() {
        return passengerName;
    }
    public String getPassengerID() {
        return passengerID;
    }
    public double getPassengerTripCost() {
        return passengerTripCost;
    }
    public Car getPassengerReservedCar() {
        return passengerReservedCar;
    }

    // methods
    public abstract void reserveCar(Car car);

    public String toString(){

        String info = "passenger name : " + passengerName + "\n" +
                      "passenger id : " + passengerID + "\n";

        if (passengerReservedCar == null) {
            return info + "there is no car to be reserved.\n";
        }

        return info +
                "reserved car code is : " + passengerReservedCar.getCode() + "\n" +
                "the final cost: $" + String.format("%.2f", passengerTripCost) + "\n";
    }

}
