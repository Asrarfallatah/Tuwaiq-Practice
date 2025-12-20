package org.example;

public class Review {

    private String username;
    private int rating;
    private String comments;

    //constructor :
    public Review (){}

    public Review (
            String username,
            int rating,
            String comments
    ){
        this.username= username;
        this.rating =rating;
        this.comments = comments;
    }

    //setter
    public void setUsername(String username) {
        this.username = username;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    //getter
    public String getUsername() {
        return username;
    }
    public String getComments() {
        return comments;
    }
    public int getRating() {
        return rating;
    }

}
