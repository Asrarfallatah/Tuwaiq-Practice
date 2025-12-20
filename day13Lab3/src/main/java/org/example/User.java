package org.example;

import java.util.ArrayList;
import java.util.List;


public class User {

    private String userName ;
    private String email ;
    private  List <Media> purchasedMedia =  new ArrayList<>();
    private  List <Media> shoppingCart =  new ArrayList<>();

    //constructor :
    public User() {}

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.purchasedMedia = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public User(String userName, String email, List<Media> purchasedMedia, List<Media> shoppingCart) {
        this.userName = userName;
        this.email = email;
        this.purchasedMedia = purchasedMedia;
        this.shoppingCart = shoppingCart;
    }


    //setter
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPurchasedMedia(List <Media> purchasedMedia) {
        this.purchasedMedia = purchasedMedia;
    }
    public void setShoppingCart(List <Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    // getter
    public String getUserName() {
        return userName;
    }
    public List <Media> getPurchasedMedia() {
        return purchasedMedia;
    }
    public String getEmail() {
        return email;
    }
    public List <Media> getShoppingCart() {
        return shoppingCart;
    }

    // methods :
    public void addToCart(Media media){
            shoppingCart.add(media);
    }
    public void removeFormCart(Media media){
            shoppingCart.remove(media);
    }
    public void checkOut(){
        purchasedMedia.addAll(shoppingCart);
        shoppingCart.clear();
        System.out.println("your purchase is completed.");
    }

}
