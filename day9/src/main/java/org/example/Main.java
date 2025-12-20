package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void mymethod (int day) {

        try {

            if (day < 1 || day > 7) {
                throw new Exception("Invalid number please enter a number from 1 to 7");
            }

        switch (day){
            case 1:
                System.out.println("You entered: " + day + " it is Sun");
                break;
            case 2:
                System.out.println("You entered: " + day + " it is Mon");
                break;
            case 3:
                System.out.println("You entered: " + day + " it is Thur");
                break;
            case 4:
                System.out.println("You entered: " + day + " it is Wed");
                break;
            case 5:
                System.out.println("You entered: " + day + " it is Thur");
                break;
            case 6:
                System.out.println("You entered: " + day + " it is Fri");
                break;
            case 7:
                System.out.println("You entered: " + day + " it is Sat");
                break;
            default:
                System.out.println("You entered: " + day +" it is not a day of the week ");
        }

    }catch (Exception e){
        System.out.println(e.getMessage());
    }

}



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("please enter your age :");
//        int array [] = {1,2,3,4};
//        try {
//            int age = input.nextInt();
//        //    System.out.println(age / 0);
//            System.out.println(array[8]);
//            System.out.println("Helo");
//        }catch (InputMismatchException e){
//            System.out.println("please enter a number ");
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Helo");]


        System.out.println("please enter a number from 1 to 7 :");
        int day = input.nextInt();
        mymethod(day);
        System.out.println("please enter a number from 1 to 7 :");
         day = input.nextInt();
        mymethod(day);


    }
}