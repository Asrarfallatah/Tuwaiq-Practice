package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dear User Please Enter a Word: ");
        String word = input.nextLine();

        String reverse = "";
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }

        if(reverse.equals(word)){
            System.out.println(word+" is Palindrome");
        }else {
            System.out.println(word+" is not Palindrome");
        }

    }
}
