package org.example;

public class Movie extends Product{

    private String director;

    //constructor
    public Movie (){}

    public Movie(
        String Name,
        double price,
        String director
    ){
        super(  Name,
                price);
        this.director =director;
    }

    //setter
    public void setDirector(String director) {
        this.director = director;
    }

    //getter
    public String getDirector() {
        return director;
    }

    @Override
    public double getDiscount() {
        return Math.round((getPrice() - ((22.22 * getPrice() )/ 100 ) ) * 100.0) / 100.0 ;
    }
}
