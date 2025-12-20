package org.example;

public class Media {

    private String title;
    private String auteur ;
    private String ISBN ;
    private double price ;

    //constructor :
    public Media(){}

    public Media(
             String title,
             String auteur,
             String ISBN,
             double price
    ){
        this.title = title;
        this.auteur =auteur;
        this.ISBN =ISBN;
        this.price = price;
    }

    //setter :
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //getter :
    public String getTitle() {
        return title;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getISBN() {
        return ISBN;
    }
    public double getPrice() {
        return price;
    }

    //methods :
    public String getMediaType(){
        return "Media";
    }
    @Override
    public String toString(){
        return  "\nMedia title : "+title+
                "\nMedia type : "+getMediaType()+
                "\nAuteur Media : "+auteur+
                "\nISBN of Media : "+ISBN+
                "\nMedia Price  : "+price;
    }
}
