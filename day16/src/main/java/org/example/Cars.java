package org.example;

class Cars extends Transport {

    @Override
    double calculatePrice(int passengers) {
        return passengers * 30;
    }
    @Override
    void bookTicket() {
        System.out.println("Booking a car ride");
    }
}