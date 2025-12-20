package org.example;

import java.util.Scanner;

public class StringCalculator {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to String Calculator ");

    System.out.print("what is your String ? ");
    String mystring = input.nextLine();

    StringBuilder sb = new StringBuilder(mystring);

    System.out.println("your string length is :  "+  sb.length());

    sb.reverse();
    System.out.println("your string after reversing it : "+ sb.toString());

}}

