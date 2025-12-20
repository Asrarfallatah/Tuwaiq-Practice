package org.example;

public abstract class Product {

    private String name;
    private double price;

    //constructor
    public Product(){

    }

    public Product(String name, double price){
            this.name = name;
            this.price = price;
    }

    //getter
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // methods :
    public abstract double getDiscount();

}
