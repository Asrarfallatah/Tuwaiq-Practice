package org.example;

import java.util.Scanner;

public class LargeandSmall {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0, largest = 0 , smallest = 0 ;
        String choice = "";

        while(true){

            System.out.println("enter number : ");
            number = input.nextInt();

            if (largest < number ){
                largest = number;
            }

            if (smallest > number){
                smallest = number;
            }

            input.nextLine();
            System.out.println("do you want to add another one ? (press n or no to exit) ");
            choice = input.nextLine();
            choice = choice.toLowerCase();

            if (choice.equalsIgnoreCase("n")  || choice.equalsIgnoreCase("no")) {
                    break;
            }

        }

        System.out.println("The largest number is : "+largest);
        System.out.println("The Smallest number is : "+smallest);

    }
}
