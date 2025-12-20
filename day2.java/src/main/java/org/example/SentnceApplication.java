package org.example;

import java.util.Scanner;

public class SentnceApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sentence Application ");
        System.out.print("Enter Your Sentence PLease : ");
        String sentence = input.nextLine();

        System.out.print("at what index do you want the sub-Sentence start : ");
        int sentenceStart = input.nextInt();

        System.out.print("at what index do you want the sub-Sentence end : ");
        int sentenceEnd = input.nextInt();
        sentence = sentence.substring(sentenceStart, sentenceEnd);

        System.out.println("Your Sub-Sentence is : "+sentence);





    }
}
