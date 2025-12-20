package org.example;

public class SubscribePassengers extends Passenger{

    //constructor

    public SubscribePassengers(){}
    public SubscribePassengers(
            String name,
            String id) {
        super(name, id);
    }

    //method
    @Override
    public void reserveCar(Car car) {

            if (car.getMaxCapacity() == 0 ){

                throw new IllegalArgumentException("error there is no capacity ");

            }

            double basePrice = car.getRoute().getPrice();
            double tripCost = basePrice * 0.50;

            car.calculateCapacity();
            setPassengerTripCost(tripCost);
            setPassengerReservedCar(car);

    }

    @Override
    public String toString() {

        return "subscribed passenger information are : \n" +
                super.toString() +
                "and the discount happened is equal to %50\n";

    }

}
