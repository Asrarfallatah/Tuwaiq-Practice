package org.example;

class Transport {
    void bookTicket() {
        System.out.println("Booking a general transport ticket");
    }

    void bookTicket(int passengers) {
        System.out.println("Booking for " + passengers + " passengers");
    }

    double calculatePrice(int passengers) {
        return passengers * 50;
    }

    void bookTicket(Transport transport){
        transport.bookTicket();
    }
}