package org.example;

import java.util.ArrayList;

public class Movie extends Media{

    private int duration ;

    //constructor :
    public Movie(){}

    public Movie (
            String title,
            String auteur,
            String ISBN,
            double price,
            int duration
    ){
        super(
                title,
                auteur,
                ISBN,
                price
        );
        this.duration = duration;
    }

    //setter
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //getter
    public int getDuration() {
        return duration;
    }

    //methods :
    public void watch(User user){
        user.getPurchasedMedia().add(this);
    }
    public void recommendSimilarMovie(ArrayList<Movie> movieCatalog){
        System.out.println("the movies that are made by " + getAuteur() + " are :");
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(getAuteur()) && movie != this){
                System.out.println( movie.getTitle());
            }
        }
    }

    @Override
    public String getMediaType() {
        if (duration < 120){
            return " movie is short ";
        }else {
            return " movie is long ";
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
