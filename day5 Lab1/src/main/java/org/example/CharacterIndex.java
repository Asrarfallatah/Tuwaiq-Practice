package org.example;

import java.util.Scanner;

public class CharacterIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nInput a string: ");
        String senctnce = input.nextLine();
        System.out.print("Input a number: ");
        int number = input.nextInt();

        System.out.println(senctnce.charAt(number));

}}
