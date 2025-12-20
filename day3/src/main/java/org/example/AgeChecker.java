package org.example;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age < 13) {
            System.out.println("You are a child");
        }else if(age >= 13 && age <= 19) {
            System.out.println("You are a teenager");
        }else {
            System.out.println("You are adult");
        }
    }
}
