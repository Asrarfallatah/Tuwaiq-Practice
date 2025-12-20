package org.example;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to BMI (Body mass index) calculator ");
        System.out.print("Please enter your height in CM : ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight in KG : ");
        double weight = input.nextDouble();
        double resulet = ( weight / (height * height) ) * 10000;
        System.out.printf("Dear User your BMI is : %.2f",resulet);

        if (resulet < 18.5) {
            System.out.println("\nyou are underweight");
        }else if (resulet >= 18.5 && resulet < 25) {
            System.out.println("\nyou are Healthy");
        }else if (resulet >= 25 && resulet < 30) {
            System.out.println("\nyou are overweight");
        }else if (resulet >= 30 ) {
            System.out.println("\nyou have Obesity ");
        }


    }
}