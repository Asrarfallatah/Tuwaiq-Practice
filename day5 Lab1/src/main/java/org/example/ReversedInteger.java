package org.example;

import java.util.Scanner;

public class ReversedInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a set of integer numbers : ");
        int mynumbers = input.nextInt();
        String reversednumbers = "";

       String mystringnumbers = String.valueOf(mynumbers);

       for (int i = 0 ; i < mystringnumbers.length() ;i++){
           reversednumbers = mystringnumbers.charAt(i) + reversednumbers ;
       }

        System.out.print("Here is the reversed digits : "+ reversednumbers);

    }
}
