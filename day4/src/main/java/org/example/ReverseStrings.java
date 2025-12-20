package org.example;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dear User please Enter a sentence or a word: ");
        String mystring = input.nextLine();
        String mystringreversed = " ";
        for(int i = 0 ; i < mystring.length() ; i++){
            mystringreversed = mystring.charAt(i) + mystringreversed;
        }
        System.out.println(mystringreversed);
    }
}
