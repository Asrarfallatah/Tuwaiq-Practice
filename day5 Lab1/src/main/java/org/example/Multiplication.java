package org.example;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = input.nextInt();

        for (int i = 0; i <= 10 ; i++){
            System.out.println(number+" X "+i +" = "+ (number * i) );
        }

    }
}
