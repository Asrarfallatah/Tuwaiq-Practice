package org.example;

import java.util.Scanner;

public class SentnceReplacable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to SentenceReplaceable Application ");

        System.out.print("what is your Sentence ? ");
        String mysentence = input.nextLine();
        System.out.print("which words from your Sentence  you would like to replace ? ");
        String mytarget = input.nextLine();
        System.out.print("what is the replacement words for it ? ");
        String myreplacement = input.nextLine();

        mysentence = mysentence.replace(mytarget,myreplacement);
        System.out.println("Your new Sentence is : "+mysentence);

    }
}
