package org.example;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Dear User please Enter a positive number: ");
        int number = input.nextInt();

        for ( ; ; ) {

            if (number < 1) {
                System.out.print(" X ERROR INCORRECT INPUT X  \nPlease enter a positive number : ");
                number = input.nextInt();
            }else  {
                System.out.println(" CORRECT INPUT :) ");
                break;
            }

        }

         // check if it prime :

        if (number == 2) {
            System.out.println("the number is prime");
        } else if (number == 1) {
            System.out.println("the number is not prime");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("the number is not prime");
                break;
            } else if (i == (number - 1) ){
                System.out.println("the number is prime");
            }
        }
    }
}
