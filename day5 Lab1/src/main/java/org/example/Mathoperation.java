package org.example;

import java.util.Scanner;

public class Mathoperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstnumber = input.nextInt();

        System.out.print("Input second number: ");
        int secondnumber = input.nextInt();

        System.out.println(firstnumber+" + "+secondnumber +" = "+ (firstnumber + secondnumber) );
        System.out.println(firstnumber+" - "+secondnumber +" = "+ (firstnumber - secondnumber) );
        System.out.println(firstnumber+" X "+secondnumber +" = "+ (firstnumber * secondnumber) );
        System.out.println(firstnumber+" / "+secondnumber +" = "+ (firstnumber / secondnumber) );
        System.out.println(firstnumber+" % "+secondnumber +" = "+ (firstnumber % secondnumber) );

    }
}