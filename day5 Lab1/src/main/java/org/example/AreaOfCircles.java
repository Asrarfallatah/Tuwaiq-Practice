package org.example;

import java.util.Scanner;

public class AreaOfCircles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("what is the value of the radius: ");
        double ridus = input.nextDouble();
        double pi = 3.14159265358979323846 ;
        double perimeter = 2 * pi * ridus;
        double area = (ridus * ridus) * pi ;

        System.out.println("Perimeter is = "+ perimeter);
        System.out.println("Area is = "+ area);



    }
}
