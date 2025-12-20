package org.example;

import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        /*     // while loop
        System.out.println("welcome to beutyofX App " +
                "what is your order :\n" +
                "1- Foundation\n" +
                "2- mascara\n" +
                "3- blush \n" +
                "4- contour \n" +
                "5- exit ");

        int mychoice =  in.nextInt();
        int foundation= 0,mascara= 0,contour= 0 ,blush = 0, add = 0;

        while(mychoice != 5) {

            if (mychoice == 1) {
                System.out.println("how many foundation you need ? ");
                 add = in.nextInt();
                 foundation += add ;
                System.out.println("your item has been added to the bag ");
            }else if (mychoice == 2) {
                System.out.println("how many mascara you need ? ");
                 add = in.nextInt();
                 mascara += add ;
                System.out.println("your item has been added to the bag ");
            }else if (mychoice == 3) {
                System.out.println("how many contour you need ? ");
                 add = in.nextInt();
                 contour += add ;
                System.out.println("your item has been added to the bag ");
            }else if (mychoice == 4) {
                System.out.println("how many blush you need ? ");
                 add = in.nextInt();
                 blush += add ;
                System.out.println("your item has been added to the bag ");
            }else{
                System.out.println("please enter a number between 1 and 5 ");
            }
            System.out.println(" " +
                    "what is your order :\n" +
                    "1- Foundation\n" +
                    "2- mascara\n" +
                    "3- blush \n" +
                    "4- contour \n" +
                    "5- exit ");
            mychoice = 0;
             mychoice =  in.nextInt();

        }

        //System.out.println("total items : ");
        System.out.println("thank you for shopping with us ");



        */
    /*
        System.out.println(" \n" +
                "Dear user your shipment is the way please chose an action :\n" +
                "1- location conformation\n" +
                "2- pickup time \n" +
                "3- end  \n" );

        int action = in.nextInt();

        do {
           if (action == 1){
               System.out.println("Please enter your shipment location");
               String location = in.next();
           }else if (action == 2){
               System.out.println("Please enter your pickup time");
               String time = in.next();
           }else if (action == 3){
               System.out.println("Thank you for choosing our service");
               break;
           } else{
               System.out.println("Invalid choice");
           }

            System.out.println(" \n" +
                    "Dear user your shipment is the way please chose an action :\n" +
                    "1- location conformation\n" +
                    "2- pickup time \n" +
                    "3- end  \n" );
             action = in.nextInt();

        }while (action != 3);

        //for loop

        System.out.println("welcome to to truth or dare planner game: ");

        System.out.print("how many member are there in the gathering ?");
        int members = in.nextInt();
        System.out.print("how many round to play ?");
        int rounds = in.nextInt();

        String  choice = " " ;
        int randomchoice = 0 ;
        int playerchoice = 0, playerschoice = 0 ;

        for (int i = 0; i < rounds; i++) {

            System.out.print("Round  "+ (i+1) + " Started\n" );

            for (int j = 0; j < members; j++) {
                randomchoice = rand.nextInt(2) ;
                if (randomchoice == 0 ) {
                    choice = "Dare";
                }else if (randomchoice == 1) {
                    choice = "Truth";
                }
                System.out.println("member "+ (j+1) + " turn to play "+ choice);
                System.out.println("Are you able to do it ? (press 1 for yes/ press 2 for no)");
                playerchoice = in.nextInt();
                if ( playerchoice == 2 ){
                    System.out.println("player turn will be passed :) ");
                    continue;
                }else if (playerchoice == 1){
                    System.out.println("thank you playing");
                }else {
                    System.out.println("please pay attention to the game and make a choice");
                }
            }

            System.out.println("do all players want to continue the next round? (press 1 for yes/ press 2 for no)");
            playerschoice = in.nextInt();
            if ( playerschoice == 2 ){
                System.out.println("game ended :) ");
                break;
            }else {
                System.out.println("new round will start :) ");
            }
        }
        System.out.println("game ended :) ");


        */

        // challenge 1:
        System.out.print("please enter a number to find its multiplication schedule :");
        int num = in.nextInt();
        System.out.print("Here is the multiplication schedule for number :"+ num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x "+ num + " = "+ (i * num) );
        }

        // challenge 2 :


        /*
        // challenge 4
        System.out.print("please enter a number :");
        String number = in.nextLine();
        String reult = " " ;
        number = number.toLowerCase();

        while (!number.equals("stop")){
            System.out.print("please enter a number :");
            number = in.nextLine();
            reult = reult + number + " ";
        }
        System.out.print(reult); */
        }
}