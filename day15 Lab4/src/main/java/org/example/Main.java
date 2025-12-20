package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle circle = new Circle(2.2);
        Rectangle rectangle = new Rectangle(2.2,4.4);
        Triangle triangle = new Triangle(2.2,4.4);

        System.out.print("\ndear user welcome to Shape application " );
      while (true) {

        try {
         System.out.print(  "\nwhich one of these shape do you wanna use " +
                            "\n1- circle  ⠀⃝ " +
                            "\n2- equilateral triangle   ⃤  " +
                            "\n3- Rectangle  ▭ :" +
                            "\n4- end program " +
                            "\nyour choice is : ");

                int choice = input.nextInt();

                if (choice == 1) {

                    System.out.println(".•*   your Shape is :  circle  ⠀⃝      *•. ");
                    System.out.print("what is the radius of your circle ?  ");
                    double radius = input.nextInt();
                    circle.setRadius(radius);
                    System.out.println("Here is some fact about your Shape : ");
                    System.out.println(     "\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                            "\t\t⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠞⠛⠋⠉⠉⠉⠉⠙⠛⠳⠶⣄⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                                            "\t\t⠀⠀⠀⠀⠀⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣄⠀⠀⠀⠀⠀\n" +
                                            "\t\t⠀⠀⠀⢀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⡀⠀⠀⠀\n" +
                                            "\t\t⠀⠀⢠⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⡄⠀⠀\n" +
                                            "\t\t⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⠀⠀\n" +
                                            "\t\t⠀⢸⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡇⠀\n" +
                                            "\t\t⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀\n" +
                                            "\t\t⠀⢸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡇⠀\n" +
                                            "\t\t⠀⠀⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠀⠀\n" +
                                            "\t\t⠀⠀⠘⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠃⠀⠀\n" +
                                            "\t\t⠀⠀⠀⠈⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠁⠀⠀⠀\n" +
                                            "\t\t⠀⠀⠀⠀⠀⠙⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠀⠀⠀⠀⠀\n" +
                                            "\t\t⠀⠀⠀⠀⠀⠀⠀⠈⠙⠶⢦⣤⣄⣀⣀⣀⣀⣠⣤⡴⠶⠋⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                                            "\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("this is a circle\nwith a radius of " + circle.getRadius());
                    System.out.println("the area of this circle is " + circle.calculateArea());
                    System.out.println("the circumference of this circle is " + circle.calculateCircumference());
                    System.out.println("\n ------------------------------------------------------\n");

                } else if (choice == 2) {

                    System.out.println(".•*   your Shape is :  equilateral triangle   ⃤    *•. ");
                    System.out.print("what is the height of your equilateral triangle ?  ");
                    double height = input.nextInt();
                    System.out.print("what is the base of your equilateral triangle ?  ");
                    double base = input.nextInt();
                    triangle.setBase(base);
                    triangle.setHeight(height);
                    System.out.println("Here is some fact about your Shape : ");
                   System.out.println("\n\t\t\t     /\\\n" +
                                        "\t\t\t    /  \\\n" +
                                        "\t\t\t   /    \\\n" +
                                        "\t\t\t  /      \\\n" +
                                        "\t\t\t /________\\");
                    System.out.println("\nthis is an equilateral triangle\nwith a base of " + triangle.getBase() + " and a height of " + triangle.getHeight());
                    System.out.println("the area of this equilateral triangle is " + triangle.calculateArea());
                    System.out.println("the Perimeter of this equilateral triangle is " + triangle.calculateCircumference());
                    System.out.println("\n ------------------------------------------------------\n");

                } else if (choice == 3) {

                    System.out.println(".•*   your Shape is :  Rectangle  ▭    *•. ");
                    System.out.print("what is the height of your Rectangle ?  ");
                    double height1 = input.nextInt();
                    System.out.print("what is the width of your Rectangle ?  ");
                    double width1 = input.nextInt();
                    rectangle.setWidth(width1);
                    rectangle.setHeight(height1);
                    System.out.println("Here is some fact about your Shape : ");
                    System.out.println("\t\t+----------------+\n" +
                            "\t\t|                |\n" +
                            "\t\t|                |\n" +
                            "\t\t|                |\n" +
                            "\t\t+----------------+\n");
                    System.out.println("this is an rectangle\nwith a width of " + rectangle.getWidth() + " and a height of " + rectangle.getHeight());
                    System.out.println("the area of this rectangle is " + rectangle.calculateArea());
                    System.out.println("the perimeter of this rectangle is " + rectangle.calculateCircumference());
                    System.out.println("\n ------------------------------------------------------\n");

                } else if (choice == 4) {
                    System.out.println("Program is \uD835\uDE74\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE97\uD835\uDE90 .........");
                    System.out.println("\n ------------------------------------------------------\n");

                    break;
                } else {
                    throw new Exception("✘ please enter a choice within the menu !!! ✘");
                }


            }catch(InputMismatchException e){
                System.out.println("✘ your choice must be an integer number only ✘");
                input.nextLine();
            }catch(Exception e){
                System.out.println(e.getMessage());
                input.nextLine();
            }

        }

    }
}