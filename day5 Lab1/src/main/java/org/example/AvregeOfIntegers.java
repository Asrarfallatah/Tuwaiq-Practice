package org.example;

import java.util.Scanner;

public class AvregeOfIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the count of numbers: ");
        double count = input.nextDouble();
        double number = 0 , sum = 0;

        for (int i = 0; i < count ; i++){
            System.out.println("Enter an integer: ");
            number = input.nextInt();
            sum += number;
        }

        double avrege = sum/count;

        System.out.println("The average is: "+ avrege);

    }
}
