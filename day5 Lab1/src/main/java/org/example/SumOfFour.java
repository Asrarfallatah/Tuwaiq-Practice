package org.example;

import java.util.Scanner;

public class SumOfFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int firstnumber = input.nextInt();

        System.out.print("Input the second number: ");
        int secondnumber = input.nextInt();

        System.out.print("Input the third number : ");
        int thirdnumber = input.nextInt();

        System.out.print("Input the Fourth number : ");
        int fourthnumber = input.nextInt();

        if ((firstnumber == secondnumber)&&(secondnumber==thirdnumber)&&(thirdnumber==fourthnumber)) {
            System.out.print("Numbers are equal!");
        } else {
            System.out.print("Numbers are not equal!");
        }


    }
}
