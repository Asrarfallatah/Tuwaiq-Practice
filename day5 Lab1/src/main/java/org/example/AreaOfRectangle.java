package org.example;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nWidth = ");
        Double width = input.nextDouble();
        System.out.print("Height = ");
        Double height = input.nextDouble();

        double  area = height * width;
        double  perimeter = 2 *(height + width);

        System.out.printf("Area is %.1f * %.1f = %.2f", width,height,area);
        System.out.print("\nPerimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
}