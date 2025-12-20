package org.example;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Obtained Mark calculator ");

        System.out.print("Enter your marks : ");
        double marks = input.nextDouble();
        System.out.print("Total marks : ");
        double totalmark = input.nextDouble();

        System.out.print("Your percentage marks = ");
        double result = (marks/totalmark ) *100;
        System.out.printf("%.1f%%", result);

    }
}
