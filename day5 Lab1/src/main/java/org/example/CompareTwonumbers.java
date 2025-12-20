package org.example;

import java.util.Scanner;

public class CompareTwonumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nInput first integer: ");
        int firstnumber = input.nextInt();
        System.out.print("\nInput second integer: ");
        int seconednumber = input.nextInt();

        System.out.print("\n");

        if (firstnumber != seconednumber){
            System.out.println(firstnumber+" != "+seconednumber );
        }
        if (firstnumber == seconednumber){
            System.out.println(firstnumber+" == "+seconednumber );
        }
        if (firstnumber < seconednumber){
            System.out.println(firstnumber+" < "+seconednumber );
        }
        if (firstnumber <= seconednumber){
            System.out.println(firstnumber+" <= "+seconednumber );
        }
        if (firstnumber > seconednumber){
            System.out.println(firstnumber+" > "+seconednumber );
        }
        if (firstnumber >= seconednumber) {
            System.out.println(firstnumber+" >= "+seconednumber );
        }


    }
}