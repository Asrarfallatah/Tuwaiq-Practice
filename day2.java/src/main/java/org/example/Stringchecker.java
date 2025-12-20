package org.example;

import java.util.Scanner;

public class Stringchecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to String checker Application ");
        System.out.print("Enter the first string : ");
        String first_name = input.nextLine();
        System.out.print("Enter the second string : ");
        String last_name = input.nextLine();

        first_name = first_name.toLowerCase();
        last_name = last_name.toLowerCase();

        System.out.println(" ignoring the case in mind are the two strings equals ? "+ first_name.equals(last_name));


    }
}
