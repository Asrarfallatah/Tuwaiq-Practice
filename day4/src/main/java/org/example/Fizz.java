package org.example;

import java.util.Scanner;

public class Fizz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Here is a schedule for 100 numbers :");
        for (int i = 0; i <= 100; i++) {
            if (( i % 5 == 0) && (i % 3 == 0 )) {
                System.out.println(" FizzBuzz" );
            }else if (i % 5 == 0) {
                System.out.println(" Buzz");
            }else if (i % 3 == 0 ){
                System.out.println(" Fizz");
            }else {
                System.out.println(i);
            }
        }

    }
}
