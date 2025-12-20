package org.example;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The first number: ");
        int number = input.nextInt();
        System.out.print("Enter The second number: ");
        int number2 = input.nextInt();

        int result1 = number;
        int result2 = number2;

        for (int i = 1; i < number2; i++) {
            result1 *= number;
        }

        for (int j = 1; j < number; j++) {
            result2 *= number2;
        }
        System.out.println("The first number"+number+" power to "+number2+" is : "+result1);
        System.out.println("The second number"+number+" power to "+number2+" is : "+result2);

    }
}
