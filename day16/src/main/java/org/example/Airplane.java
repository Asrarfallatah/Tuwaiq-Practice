package org.example;


class Airplane extends Transport {
    @Override
    double calculatePrice(int passengers) {
        return passengers * 200;
    }
    @Override
    void bookTicket() {
        System.out.println("Booking a flight ticket");
    }
}