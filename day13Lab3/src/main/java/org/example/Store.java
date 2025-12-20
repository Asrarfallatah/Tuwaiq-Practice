package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<User> users = new ArrayList<>();
    private List <Media> media = new ArrayList<>();

    //constructor
    public Store (){}

    public Store (
            ArrayList<User> users,
            ArrayList <Media> media
    ){
        this.users = users;
        this.media = media;
    }

    //setter
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }

    //getter
    public List<User> getUsers() {
        return users;
    }
    public List<Media> getMedia() {
        return media;
    }

    //methods
    public void addUser(User user){
        users.add(user);
    }
    public void displayUser(){
        for(User user : users){
            System.out.println("user : "+user.getUserName() + "\n user's email : " + user.getEmail());
        }
    }
    public void addMedia(Media media){
        this.media.add(media);
    }
    public void displayMedia(List<Media> media){
        for(Media media1 : media){
            System.out.println(media1);
        }
    }
    public Book searchBook(String title){
       for (Media media1 : media){
           if((media1 instanceof Book) && (media1.getTitle().equalsIgnoreCase(title)) ){
               return (Book) media1;
           }
       }
        return null;
    }
}
