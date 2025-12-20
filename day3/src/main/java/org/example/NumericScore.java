package org.example;

import java.util.Scanner;

public class NumericScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("EWelcom to numeric score calculator \n" +
                "A: 90-100\n" +
                "B: 80-89\n" +
                "C: 70-79\n" +
                "D: 60-69 F:\n" +
                "0-59");
        System.out.print("Enter your numeric score: ");
        int score = input.nextInt();
        System.out.println("your numeric score: "+score);
        char grade = 'A';

        if (score >= 90 && score <= 100) {
            grade = 'A';
            System.out.print("Letter Grade: "+grade);
        }else if (score >= 80 && score <= 89) {
            grade = 'B';
            System.out.print("Letter Grade: "+grade);
        }else if (score >= 70 && score <= 79) {
            grade = 'C';
            System.out.print("Letter Grade: "+grade);
        }else if (score >= 60 && score <= 69) {
            grade = 'D';
            System.out.print("Letter Grade: "+grade);
        }else  {
            grade = 'F';
            System.out.print("Letter Grade: "+grade);
        }

    }
}
