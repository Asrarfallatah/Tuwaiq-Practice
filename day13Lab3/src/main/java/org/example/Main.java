package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // users :
        User me = new User();
        me.setUserName("Asrar");
        me.setEmail("AsrarFallatah@gmail.com");
        me.setPurchasedMedia(new ArrayList<>());
        me.setShoppingCart(new ArrayList<>());

        User mother = new User("mariam",
                "MariamFallatah@gmail.com");

        User sister = new User("Anwaar",
                "Anwaarfallatah@gmail.com",
                new ArrayList<>(),
                new ArrayList<>());

        // reviw :

        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review("Asrar",
                5,
                "good"));
        reviews.add(new Review("Anwaar",
                4,
                "i love it "));
        reviews.add(new Review("mariam",
                1,
                "did not like it "));

       // book :

        Novel novel1 = new Novel("romeo and juliet",
                "shakespeare",
                "N001",
                15.0,
                7,
                reviews,
                "romance");
        Novel novel2 = new Novel("the Notebook",
                "nicholas sparks",
                "N002",
                20.0,
                5,
                new ArrayList<>(),
                "drama");
        Novel novel3 = new Novel("pride and prejudice",
                "jane Austen",
                "N003",
                18.0,
                6,
                new ArrayList<>(),
                "classic romance");

        AcademicBook academicBook1 = new AcademicBook("JAVA 101",
                "Ms. Majd",
                "A001",
                 55.0,
                3,
                new ArrayList<>(),
                "computer engineering");
        AcademicBook academicBook2 = new AcademicBook("data structures",
                "Dr. Noor",
                "A002",
                48.0,
                5,
                new ArrayList<>(),
                "software engineering");
        AcademicBook academicBook3 = new AcademicBook("network fundamentals",
                "Dr. Ahmed",
                "A003",
                52.0,
                4,
                new ArrayList<>(),
                "computer networks");


        // movie
        Movie movie1 = new Movie("13 Going on 30",
                "Gary Winick",
                "MOV001",
                12.5,
                98);
        Movie movie2 = new Movie("the proposal",
                "Anne Fletcher",
                "MOV002",
                14.0,
                108);
        Movie movie3 = new Movie("How to Lose a Guy in 10 Days",
                "Donald Petrie",
                "MOV003",
                13.0,
                116);

        //songs
        Music song1 = new Music("I Will Always Love You",
                "Whitney Houston",
                "mmm121",
                9.5,
                "Whitney Houston");
        Music song2 = new Music("Wonderwall",
                "Oasis",
                "MUS002",
                8.0,
                "mmm131");
        Music song3 = new Music("My Heart Will Go On",
                "Celine Dion",
                "mmm141",
                10.5,
                "Celine Dion");

        //store

        ArrayList<User> storeUsers = new ArrayList<>();
        storeUsers.add(me);
        storeUsers.add(mother);
        storeUsers.add(sister);

        ArrayList<Media> storeMedia = new ArrayList<>();
        storeMedia.add(novel1);
        storeMedia.add(novel2);
        storeMedia.add(novel3);
        storeMedia.add(academicBook1);
        storeMedia.add(academicBook2);
        storeMedia.add(academicBook3);
        storeMedia.add(movie1);
        storeMedia.add(movie2);
        storeMedia.add(movie3);
        storeMedia.add(song1);
        storeMedia.add(song2);
        storeMedia.add(song3);

        Store store = new Store(storeUsers, storeMedia);

        System.out.print("-------------------------------------------------");
        System.out.print("\n welcome to riyad store purches history  :\n ");
        System.out.print("-------------------------------------------------");
        System.out.println("\nBefore any purchases:");
        System.out.println("User " + me.getUserName() + " has " + me.getPurchasedMedia().size() + " purchased items");
        System.out.println("User " + mother.getUserName() + " has " + mother.getPurchasedMedia().size() + " purchased items");
        System.out.println("User " + sister.getUserName() + " has " + sister.getPurchasedMedia().size() + " purchased items");

        me.addToCart(movie1);
        me.addToCart(song1);

        mother.addToCart(academicBook1);
        mother.addToCart(movie2);

        sister.addToCart(novel1);
        sister.addToCart(academicBook2);

        me.checkOut();
        mother.checkOut();
        sister.checkOut();

        movie3.watch(me);
        song3.listen(mother);
        
        System.out.println("after : ");

        System.out.println("User " + me.getUserName() + " purchased: " + me.getPurchasedMedia());
        System.out.println("User " + mother.getUserName() + " purchased: " + mother.getPurchasedMedia());
        System.out.println("User " + sister.getUserName() + " purchased: " + sister.getPurchasedMedia());

        System.out.print("-------------------------------------------------");
        System.out.print("\n                   media   :\n ");
        System.out.println("-------------------------------------------------");
        System.out.println(movie1.getTitle() + " : " + movie1.getMediaType());
        System.out.println(song3.getTitle() + " : " + song3.getMediaType());
        System.out.println(novel1.getTitle() + " : " + novel1.getMediaType());
        System.out.println(academicBook1.getTitle() + " : " + academicBook1.getMediaType());


        System.out.print("-------------------------------------------------");
        System.out.print("\n                   what is  in store    :\n ");
        System.out.println("-------------------------------------------------");
        store.displayMedia(store.getMedia());

        System.out.print("-------------------------------------------------");
        System.out.print("\n                  registed user     :\n ");
        System.out.println("-------------------------------------------------");
        store.displayUser();

    }
}