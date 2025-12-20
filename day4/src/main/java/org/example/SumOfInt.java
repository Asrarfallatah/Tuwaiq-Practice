package org.example;

import java.util.Scanner;

public class SumOfInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("how many numbers do you want to add: ");
        int totalnumbers = input.nextInt();

        int sum = 0, number = 0, even = 0, odd = 0;

        for (int i = 1; i <= totalnumbers; i++) {
            System.out.print("Enter number " + i + ": ");
             number = input.nextInt();

             if (number % 2 == 0) {
                 even += number;
                 System.out.println("this number is even");
             }else{
                 odd += number;
                 System.out.println("this number is odd");
             }
             sum += number;
        }
        System.out.println("The sum of all numbers is " + sum);
        System.out.println("The sum of even numbers is " + even);
        System.out.println("The sum of odd numbers is " + odd);
    }
}
