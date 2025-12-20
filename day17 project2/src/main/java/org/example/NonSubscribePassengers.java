package org.example;

public class NonSubscribePassengers extends Passenger{

    private boolean discountCoupon ;

    //constructor
    public NonSubscribePassengers (){}
    public NonSubscribePassengers(String passengerName, String passengerID, boolean discountCoupon) {
        super(passengerName, passengerID);
        this.discountCoupon = discountCoupon;
    }

    // methods
    @Override
    public void reserveCar(Car car) {

            if (car.getMaxCapacity() == 0 ){

                throw new IllegalArgumentException("there is no capacity ");

            }

            double basePrice = car.getRoute().getPrice();
            double tripCost;

            if (this.discountCoupon) {
                tripCost = basePrice - (basePrice * 0.1);
            } else {
                tripCost = basePrice;
            }

            car.calculateCapacity();
            setPassengerTripCost(tripCost);
            setPassengerReservedCar(car);

    }


    @Override
    public String toString() {

        String couponStatus = this.discountCoupon ? "Yes for %10 Discount " : "No for Full Price ";

        return "none subscribed passenger information\n" +
                super.toString() +
                "does have a discount Coupon: " + couponStatus + "\n";
    }

    // new if else statement short syntax :  dataType var = condition ? ifTrue : ifFalse

}
