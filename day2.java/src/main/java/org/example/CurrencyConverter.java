package org.example;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter ");

        System.out.print("Enter amount in USD: ");
        double usdamount = input.nextDouble();

        System.out.print("Enter exchange rate (USD to EUR): ");
        double exchangerate =  input.nextDouble();

        double result = (usdamount * exchangerate) / 100 ;
        System.out.println("Your EUR amount is: " + result);


    }
}
