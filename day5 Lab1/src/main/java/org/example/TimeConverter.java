package org.example;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nInput seconds: ");
        int sec = input.nextInt();
        int hour = sec / 3600;
        int min = (sec % 3600 ) / 60;
        int sec2 = sec % 60 ;

        System.out.printf("\nTime is: %d:%d:%d ",hour,min,sec2);

    }
}