package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // array

        String home [] = {"living room", "Bedroom", "Bathroom", "kitchen", "lobby",};

        System.out.print("our home is made of : "+ Arrays.toString(home));

        int [] familyage = new int[4] ;
        familyage [0] = 12;
        familyage [1] = 17;
        familyage [2] = 23;
        familyage [3] = 27;

        System.out.print("\nfamily members ages : ");

        for (int i = 0; i <familyage.length; i++){
            System.out.print("  "+familyage[i]);
        }

        System.out.println("\n ");

        int [] numbers = {1,7,6,8,10} ;

        for (int i = 0; i <numbers.length; i++){
            if ((numbers[i] % 2)== 0 ){
                System.out.println("the number "+ numbers[i]+" is even ");
            }else{
                System.out.println("the number "+ numbers[i]+" is odd ");
            }
        }

        System.out.println("\n ");

        String names [] = {"Sara ", "majd", "suha", "Sameer", "ahmed",};

        for (int i = 0; i <names.length; i++){

           if (names[i].startsWith("s") || names[i].startsWith("S")){

                System.out.println("the name "+ names[i]+" at index "+i+" Starts with S ");

            }else{
               //  System.out.println("the name "+ names[i]+" at index "+i+" does not Starts with S ");
            }
        }

        // for each  syntax : for (array-data-type  aray-data-name  : array-name )

        System.out.println("\n ");

        for (String s : names){

            if ((s.charAt(0)  == 's') || ( s.charAt(0)  == 'S')){

                System.out.println("the name "+ s +" Starts with S ");

            }
        }

        System.out.println("\n ");

        for (int n : numbers)
            if ((n % 2)== 0 ){
                System.out.println("the number "+ n +" is even ");
            }else{
                System.out.println("the number "+ n +" is odd ");
            }

        System.out.println("\n ");

       // ArrayList  is like objects from class Arraylist

        ArrayList <String> students = new ArrayList<>() ;

        System.out.println("the arraylist first initilaized : "+students);

        // add , remove , get , set for  elemente :

        students.add("Asrar");
        students.add("Norah");
        students.add("Meme");
        students.add("Noor");
        students.add(0,"Sarah");

        System.out.println("Array after adding elements : "+students);
        students.set(1,"Reem");
        System.out.println("Array after renaming the first elements : "+students);

        System.out.println();
        students.get(2);

        ArrayList <String> colors = new ArrayList<>() ;

        colors.add("red");
        colors.add("black");
        colors.add("green");
        colors.add("blue");

    //    colors.set(1,"white");
    //    colors.remove("green");

        System.out.println(colors);

        for (String s : colors){
            if ( s.length() > 3){
                System.out.println(s+" is long");
            }else {
                System.out.println(s+" is short");
            }
        }

        System.out.println("\n");

     //arraylist app:

        ArrayList <Integer> cart = new ArrayList<>();
        ArrayList<String>  items = new ArrayList<>();
        ArrayList <Double>  prices = new ArrayList<>();

        items.add("laptop");
        items.add("phone");
        items.add("headphone");

        prices.add(500.99);
        prices.add(922.85);
        prices.add(7.79);

        int choice = 0;
        String stop = "";

        while(true) {

            System.out.println("please enter 1 if you want to sell  an item  \n" +
                    "and 2 if you want to buy from our store  \n" +
                    "and 3 to exit : ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    while (true) {

                        System.out.println("please write what is the name of the device you want to sell : ");
                        String itemtosell = input.nextLine();

                        System.out.println("please write what is the name of the device you want to sell : ");
                        double pricetosell = input.nextDouble();

                        input.nextLine();

                        items.add(itemtosell);
                        prices.add(pricetosell);

                        System.out.println("your device " + itemtosell + "has been added to our store to sell with a price of : " + pricetosell);
                        System.out.println("Do you want to sell another device ? Y/N");
                        stop = input.nextLine();

                        if (stop.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:

                    cart.clear();
                    double totalPrice = 0;
                    System.out.println(" welcome");

                    while (true) {
                        System.out.println("The items list: " + items);
                        System.out.println("Enter the item to bay: ");
                        String item = input.nextLine();

                        //input.nextLine();

                        int id = items.indexOf(item);

                        if (id == -1) {
                            System.out.println("⚠️ Item not found. Please try again.");
                            continue;
                        }

                        cart.add(id);

                        System.out.println("the price of " + item + " is " + prices.get(id));
                        totalPrice += prices.get(id);

                        items.remove(id);
                        prices.remove(id);

                        System.out.println("Do you want to keep shopping? Y/N");
                        stop = input.nextLine();
                        if (stop.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    System.out.println("your cart contains:");
                    for (int ids : cart) {
                        System.out.println("item: " + items.get(ids) + "price: " + prices.get(ids));
                    }

                    System.out.println("total price :" + totalPrice);
                    break;
                case 3:
                    System.out.println("thank you for shopping with us ");
                    break;

                default:
                    System.out.println("incorrect choice! please enter the right number ");
                    break;
            }

            if (choice == 3) {

                break;
            }
        }


/// ////////////////////////////////////////////////////////////

        System.out.println("\n");
        // exsercise 1 :
        int myarray22 [] = {50,-20,0,30,40,60,60};

        System.out.println("my array element are :"+Arrays.toString(myarray22));
        int mysize22 = myarray22.length-1;


        if  (myarray22[0] == myarray22[mysize22]){

            System.out.println("True \nthe first element "+myarray22[0]+" is equals to the last elment ");
        }
        if  (myarray22[0] < myarray22[mysize22]) {
            System.out.println("False\nthe first element "+myarray22[0]+" is less than to the last elment ");
        }
        if (myarray22[0] > myarray22[mysize22]){
            System.out.println("False \nthe first element "+myarray22[0]+" is bigger than to the last elment ");
        }

        System.out.print("\n");
        // exsrsise 2 :

        int myarray[] = {1, 4, 17, 7, 25, 3, 100};

        System.out.println("my array element are :" + Arrays.toString(myarray));

        int mysize = myarray.length;
        int myavrege = 0;

        for(int i = 0; i < myarray.length ; i++){
            myavrege = myarray[i] +myavrege;
        }
        double result = myavrege / mysize ;

        System.out.println("The average of the array element is : " + result);

        for(int i = 0; i < myarray.length ; i++){
            if ( myarray[i] > result){
                System.out.print(myarray[i] +" , ");
            }
        }


        System.out.println("\n");
        // exsrsise 3 :

        int array1[] = {20,30,40};

        System.out.println("my array element are :" + Arrays.toString(array1));

        int biggest = array1[0], smallest = array1[0];

        for(int i = 0; i < array1.length ; i++){

            if (array1[i] > biggest){
                biggest = array1[i] ;
            }

            if (array1[i] < smallest){
                smallest = array1[i] ;
            }

        }

        System.out.println("Larger value between first and last element: " + biggest);

        System.out.println("\n");
        // exsrsise 4 :

        ArrayList <Integer> oldarray = new ArrayList<>() ;

        oldarray.add(20);
        oldarray.add(30);
        oldarray.add(40);

        System.out.println("my old array: " + oldarray);

        ArrayList <Integer> newarray = new ArrayList<>(oldarray) ;

        int mynewsize = oldarray.get(0) ;

        newarray.set(0,(newarray.get(newarray.size() - 1)));
        newarray.set(newarray.size() - 1,mynewsize );

        System.out.println("my new array: " + newarray);


        System.out.println("\n");

        //exsrsise 5 :

        ArrayList <Integer> sortaraay = new ArrayList<>() ;
        sortaraay.add(2);
        sortaraay.add(1);
        sortaraay.add(5);
        sortaraay.add(9);
        sortaraay.add(7);
        sortaraay.add(2);
        sortaraay.add(40);
        sortaraay.add(4);
        sortaraay.add(10);
        sortaraay.add(7);
        System.out.println("my array is  : "+sortaraay);

        ArrayList <Integer> sortedaraay = new ArrayList<>() ;

        for (int i = 0; i < sortaraay.size() ; i ++){
            if( sortaraay.get(i) % 2 == 0){
                sortedaraay.add(0,sortaraay.get(i)) ;
            }
        }

        for (int i = 0; i < sortaraay.size() ; i ++){
            if( sortaraay.get(i) % 2 != 0){
                sortedaraay.add(0,sortaraay.get(i)) ;
            }
        }
        System.out.println("my sorted array is  : "+sortedaraay);


        System.out.println("\n");
        //exsrsise 6 :

        int arrayA [] = {2,3,6,6,4};
        int arrayB [] = {2,3,6,4,6,4};

        System.out.println("my first array is : "+Arrays.toString(arrayA));
        System.out.println("my seconed array is : "+Arrays.toString(arrayB));

        boolean check= false ;

        for (int i = 0; i < arrayA.length ; i ++){
            if (arrayA[i] == arrayB[i]){
                check = true;
            }else {
                check = false;
                break;
            }
        }

        System.out.println("Are they are match ? " + check);




    }
}