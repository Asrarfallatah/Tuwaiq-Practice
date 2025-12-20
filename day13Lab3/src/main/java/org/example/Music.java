package org.example;

import java.util.ArrayList;
import java.util.List;
public class Music extends Media{

    private String artist ;

    //constructor :
    public Music(){}

    public Music(
            String title,
            String auteur,
            String ISBN,
            double price,
            String artist
    ){
        super(
                title,
                auteur,
                ISBN,
                price
        );
        this.artist = artist;
    }


    //setter
    public void setArtist(String artist) {
        this.artist = artist;
    }

   //getter
    public String getArtist() {
        return artist;
    }

    // methods
    public void listen(User user){
        user.getPurchasedMedia().add(this);
    }
    public void generatePlaylist(ArrayList <Music> musicCatalog){
        System.out.println("the playlist that are made for " + getArtist() + " artist are :");
        for(Music music : musicCatalog ){
            if (music.artist.equals(this.artist) && music != this) {
                System.out.println(music.getTitle());
            }
        }
    }
    @Override
    public String getMediaType() {
        if (getPrice() < 10 ){
            return "Music";
        }else {
            return "Premium Music";
        }
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nartists : "+artist;
    }
}
