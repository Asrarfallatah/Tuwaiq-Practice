package org.example;

public class Book extends Product{

    private String auther;

    // constructor :
    public Book(){}

    public Book(
            String name,
            double price,
            String auther
    ){
        super(  name,
                price);
        this.auther=auther;
    }

    //setter
    public void setAuther(String auther) {
        this.auther = auther;
    }
    //getter
    public String getAuther() {
        return auther;
    }

    //methods
    @Override
    public double getDiscount() {
        return Math.round((getPrice() - ((12.22 * getPrice() )/ 100 ) ) * 100.0) / 100.0 ;
    }
}
