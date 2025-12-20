package org.example;

import java.util.List;

public class Novel extends Book{

    private String genre;

    //constructor :
    public Novel(){}

    public Novel(
            String title,
            String auteur,
            String ISBN,
            double price,
            int quantity,
            List<Review> reviews,
            String genre
    ){
        super(    title,
                  auteur,
                  ISBN,
                  price,
                  quantity,
                  reviews);
        this.genre=genre;

    }
    //setter
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //getter
    public String getGenre() {
      return genre;
    }


    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5){
            return "best selling novel";
        }else{
            return "novel";
        }
    }
    @Override
    public String toString() {
        return super.toString()+
               "\ngenre : " + genre ;
    }
}
