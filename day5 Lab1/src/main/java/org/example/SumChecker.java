package org.example;

import java.util.Scanner;

public class SumChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("does the sum of these number is equal to the third integer ?");
        System.out.print("Input the first number : ");
        int firstnumber = input.nextInt();

        System.out.print("Input the second number: ");
        int secondnumber = input.nextInt();

        System.out.print("Input the third number : ");
        int thirdnumber = input.nextInt();

        int sumtow = firstnumber + secondnumber;

        if (sumtow == thirdnumber){
            System.out.print("The result is: true");
        }else {
            System.out.print("The result is: false");
        }


    }
}
