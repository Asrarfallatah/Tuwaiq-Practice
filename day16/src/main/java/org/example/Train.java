package org.example;

class Train extends Transport {
    @Override
    double calculatePrice(int passengers) {
        return passengers * 20;
    }
    @Override
    void bookTicket() {
        System.out.println("Booking a train seat");
    }
}