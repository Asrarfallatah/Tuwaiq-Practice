package org.example;

public class Routes {

    private String startAddress ;
    private String destinationAddress ;
    private double price ;

    //constructor
    public Routes(){}
    public Routes(
              String startAddress ,
              String destinationAddress ,
              double price
    ){
         this.startAddress =startAddress;
         this.destinationAddress =destinationAddress;
        this.price = price;
    }

    //setter
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }
    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    //getter
    public double getPrice() {
        return price;
    }
    public String getDestinationAddress() {
        return destinationAddress;
    }
    public String getStartAddress() {
        return startAddress;
    }

    //methods

}
