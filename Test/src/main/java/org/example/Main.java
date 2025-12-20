package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ///  Excersise 1 :

        System.out.println("-------------------- Ex.1 --------------------\n");
        System.out.print(" Please enter 1st number : ");
        int number1 = input.nextInt();
        System.out.print(" Please enter 2nd number : ");
        int number2 = input.nextInt();
        System.out.print(" Please enter 3rd number : ");
        int number3 = input.nextInt();

        if ( (number1 >= number2 ) && (number1 >= number3 )){
            System.out.println(" the largest number is = "+number1);
        } else if ((number2 >= number1 ) && (number2 >= number3 )) {
            System.out.println(" the largest number is = "+number2);
        } else if ((number3 >= number1 ) && (number3 >= number2 )) {
            System.out.println(" the largest number is = "+number3);
        }

        ///  Esrisise 2 :

        System.out.println("\n-------------------- Ex.2 --------------------\n");
        input.nextLine();
        System.out.print (" Please enter a string : ");
        String myString = input.nextLine();
        System.out.print (" Please enter a number : ");
        int myNumber = input.nextInt();
        int sizeString =  myString.length()-1;

        if(myNumber > myString.length()){
            System.out.print (" Please enter a number that within the string range which is from 0 to "+sizeString +" : " ) ;
            myNumber = input.nextInt();
        }
        System.out.println(" The character in the index number "+myNumber+" is = " + myString.charAt(myNumber));

        ///  Esrisise 3 :

        System.out.println("\n-------------------- Ex.3 --------------------\n");

        double addnumbers = 0, sumnumbers = 0;
        while (true){
            System.out.print ("\n Please enter a number : ");
             addnumbers = input.nextDouble();
             sumnumbers += addnumbers ;

            input.nextLine();

            System.out.print ("\n do you wanna add another one ? (press y to continue and  n to exit ) : ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("n")){
                System.out.print ("\n  program will end  ");
                break;
            } else if (choice.equalsIgnoreCase("y")) {
                continue;
            } else if (!(choice.equalsIgnoreCase("n")) && !(choice.equalsIgnoreCase("y"))) {
                System.out.println ("\n invalid input !!!!! \n (Please pay Attention press y to continue and  n to exit )");
                choice = input.nextLine();

                if (choice.equalsIgnoreCase("n")){
                    System.out.print ("\n  program will end  ");
                    break;
                } else if (choice.equalsIgnoreCase("y")) {
                    continue;
                }else {
                    System.out.println ("\n invalid input program will end !!!!! ");
                    break;
                }
            }
        }

        System.out.println ("\n Sum of entered numbers are : "+sumnumbers);

        ///  Esrisise 4 :

        System.out.println("\n-------------------- Ex.4 --------------------\n");

        int arrayofsign [] = {10, -21 , 30, 31, -25};

        System.out.println("My array elments are "+Arrays.toString(arrayofsign));

        for (int i = 0; i < arrayofsign.length; i++) {
            if (arrayofsign[i] > 0){
                System.out.println(" "+arrayofsign[i] +"\t  is a positive number ");
            } else if (arrayofsign[i] < 0) {
                System.out.println(arrayofsign[i] +"\t  is a negative number ");
            }else {
                System.out.println(arrayofsign[i] +"\t  is Zero ");
            }
        }

        ///  Esrisise 5 :

        System.out.println("\n-------------------- Ex.5 --------------------\n");

        String shortestString [] = {"Tuwaiq", "Bootcamp" , "Student", "JAVA"};
        String shortest = shortestString[0];

        for (int i = 1; i < shortestString.length; i++) {
            if (shortest.length() > shortestString[i].length()){
               shortest =  shortestString[i];
            }
        }
        System.out.println("My array elments are : "+Arrays.toString(shortestString));
        System.out.println("the shortest String in the array is : "+ shortest);

    }
}