package org.example;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter temperature in Centigrade: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 1.8)+32 ;

        System.out.println("Temperature in Fahrenheit is: "+ fahrenheit);


}}
