package org.example;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = input.nextLine();
        word= word.toLowerCase();
        String reversed = "";

        for (int i = 0 ; i < word.length(); i++){
            reversed = word.charAt(i) + reversed;
        }
        System.out.print("Reverse word: "+reversed);

    }

    }
