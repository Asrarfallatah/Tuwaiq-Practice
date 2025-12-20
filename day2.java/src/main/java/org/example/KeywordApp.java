package org.example;

import java.util.Scanner;

public class KeywordApp {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Welcome to Keyword searcher Application ");
                System.out.print("Enter Your Sentence PLease : ");
                String sentence = input.nextLine();

                System.out.print("Enter the Keyword PLease : ");
                String mykeyword = input.nextLine();

                sentence = sentence.toLowerCase();
                mykeyword = mykeyword.toLowerCase();

                System.out.println("does my Sentence has the keyword"+ mykeyword+" ? "+sentence.contains(mykeyword));
                System.out.println("the keyword "+ mykeyword+" is present in the sentence "+sentence);

    }
}
