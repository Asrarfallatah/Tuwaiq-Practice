package org.example;

import java.util.Scanner;

public class SignChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number : ");
        int number = input.nextInt();

        if (number < 0 ){
            System.out.print("Number is negative. ");
        } else if (number == 0) {
            System.out.print("Number is Zero. ");
        }else {
            System.out.print("Number is positive. ");
        }

    }
}
