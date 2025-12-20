package org.example;

import java.util.ArrayList;

public class AcademicBook extends Book{

    private String subject;

    //constructor :
    public AcademicBook(){}

    public AcademicBook(
            String title,
            String auteur,
            String ISBN,
            double price,
            int quantity,
            ArrayList<Review> review,
            String subject
    ){
        super(  title,
                auteur,
                ISBN,
                price,
                quantity,
                review);
        this.subject =subject;
    }


    //setter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //getter
    public String getSubject() {
        return subject;
    }

    //methods
    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5){
            return "best selling Academic book";
        }else{
            return "Academic book";
        }
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nsubject : "+subject;
    }

}
