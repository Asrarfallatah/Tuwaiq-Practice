package org.example;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

    private int quantity;
    private List<Review> reviews = new ArrayList<>();

    //constructor :
    public Book(){}

    public Book(
            String title,
            String auteur,
            String ISBN,
            double price,
            int quantity,
            List<Review> reviews
    ){
        super(
               title,
               auteur,
               ISBN,
               price  );
        this.quantity = quantity;
        this.reviews = reviews;
    }

    //setter
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    //getter
    public int getQuantity() {
        return quantity;
    }
    public List<Review> getReviews() {
        return reviews;
    }

    //methods
    public void addReview(Review review){
         reviews.add(review);
    }
    public double getAverageRating(){
        if (reviews.isEmpty()) {
            return 0;
        }
        double total = 0;
        for(Review review : reviews){
            total += review.getRating();
        }
        return ( total / reviews.size() );
    }
    public void purchase(User user){
        if (quantity > 0) {
            user.getPurchasedMedia().add(this);
            quantity--;
        } else {
            System.out.println("sorry it is out of stock");
        }
    }
    public boolean isBestSeller(){
           return( getAverageRating() >= 4.5 );
    }
    public void reStock(int quantityInStock){
         quantity += quantityInStock;
        System.out.println("the "+getTitle()+" item number is in stock ");
    }
    @Override
    public String getMediaType() {
        if(isBestSeller()){
            return "Bestselling book";
        }else {
            return "Book";
        }
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nin stock : "+quantity+
                "\navrege rating : "+getAverageRating();
    }
}
