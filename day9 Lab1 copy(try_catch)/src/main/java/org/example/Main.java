package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Exercise.1 :

//        double first_number = 0.0 , second_number = 0.0 ;
//        while (true){
//            try {
//                System.out.print("Input first number: ");
//                first_number = input.nextDouble();
//                System.out.print("Input second number: ");
//                second_number = input.nextDouble();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter numbers only !!");
//                input.nextLine();
//            }
//        }
//        System.out.println(first_number +" + "+ second_number +" = "+ (first_number + second_number) );
//        System.out.println(first_number +" - "+ second_number +" = "+ (first_number - second_number) );
//        System.out.println(first_number +" X "+ second_number +" = "+ (first_number * second_number) );
//        System.out.println(first_number +" / "+ second_number +" = "+ (first_number / second_number) );
//        System.out.println(first_number +" % "+ second_number +" = "+ (first_number % second_number) );

        // Exercise.2 :

//        double check_number = 0.0 ;
//        System.out.print("Please enter a number: ");
//        while (true){
//            try {
//                check_number = input.nextDouble();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter numbers only !!");
//                input.nextLine();
//            }
//        }
//        for (int i = 0; i <= 10 ; i++){
//            System.out.println(check_number +" X "+i +" = "+ (check_number * i) );
//        }

        // Exercise.3 :

//        double ridus = 0, pi = 3.14 , area = 0, perimeter = 0 ;
//        char s ;
//        while (true){
//            try {
//                System.out.print("what is the value of the radius: ");
//                ridus = input.nextDouble();
//                if (ridus < 0) {
//                    throw new Exception("Radius cannot be negative!");
//                }
//                perimeter = 2 * pi * ridus;
//                area = (ridus * ridus) * pi ;
//                System.out.println("Perimeter is = "+ perimeter);
//                System.out.println("Area is = "+ area);
//                break;
//            }  catch (InputMismatchException e){
//                System.out.println("invalid input please enter a number !! ");
//                input.nextLine();
//                continue;
//            } catch (Exception e ){
//                System.out.println(e.getMessage());
//                continue;
//            }
//        }

        // Exercise.4 :

//        while (true) {
//            try {
//                System.out.print("Enter how many numbers you will enter : ");
//                int count = input.nextInt();
//                if (count == 0) {
//                    throw new Exception("we can't continue operations with ZERO numbers entered !!  ");
//                }
//                double number = 0, sum = 0;
//                for (int i = 1; i <= count; i++) {
//                    System.out.print("please enter number " + i +" : ");
//                    number = input.nextDouble();
//                    sum += number;
//                }
//                double avrege = sum / count;
//                System.out.println("the average of the numbers you entered are : " + avrege);
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("please enter integer number only and follow instructions!!!! ");
//                input.nextLine();
//            }catch (Exception e ){
//                System.out.println(e.getMessage());
//                input.nextLine();
//            }
//
//        }

        // Exercise.5 :

//        System.out.println("does the sum of these number is equal to the third integer ?");
//        int firstnumber = 0 , secondnumber = 0 , thirdnumber = 0 ;
//        while (true){
//            try {
//                System.out.print("Input the first number : ");
//                firstnumber = input.nextInt();
//                System.out.print("Input the second number: ");
//                secondnumber = input.nextInt();
//                System.out.print("Input the third number : ");
//                thirdnumber = input.nextInt();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter an integer number ! ");
//                input.nextLine();
//            }
//        }
//        int sumtow = firstnumber + secondnumber;
//        try {
//            if (sumtow == thirdnumber){
//                System.out.print("The result is: true");
//            }else {
//                throw new Exception("The result is: false");
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        // Exercise.6 :

//        System.out.print("please enter a word: ");
//        String word = input.nextLine();
//        word= word.toLowerCase();
//        String reversed = "";
//
//        for (int i = 0 ; i < word.length(); i++){
//            reversed = word.charAt(i) + reversed;
//        }
//        System.out.print("Reverse word: "+reversed);


        // Exercise.7 :

//        int number = 0;
//        System.out.println("\nplease enter a  number : ");
//        while (true){
//            try {
//                number  = input.nextInt();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter numbers only :");
//                input.nextLine();
//            }
//        }
//        if (number % 2 == 0) {
//            System.out.println("The number is Even");
//        } else {
//            System.out.println("The number is Odd");
//        }

        // Exercise.8 :

//        double celsius;
//        System.out.println("\nEnter temperature in Centigrade: ");
//        while (true){
//            try {
//                celsius = input.nextDouble();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter a number ! ");
//                input.nextLine();
//            }
//        }
//        double fahrenheit = (celsius * 1.8)+32 ;
//        System.out.println("Temperature in Fahrenheit is: "+ fahrenheit);

        // Exercise.9 :

//         String sentence= " ";
//       while (true){
//        try {
//            System.out.print("\nplease enter a string: ");
//            sentence = input.nextLine();
//            System.out.print("please enter a number from 0 up til "+ (sentence.length()-1) + " ");
//            int number = input.nextInt();
//            System.out.println("the litter at index number "+number+" is "+sentence.charAt(number));
//            break;
//        }catch (InputMismatchException e){
//            System.out.println("Please follow the instructions and enter a number !! ");
//            input.nextLine();
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("please enter a number that is within the range limit and follow the instructions " );
//            input.nextLine();
//        }
//       }

        // Exercise.10 :

//        double width , height , area , perimeter ;
//        while (true){
//            try {
//                System.out.print("\nplease enter the Width = ");
//                width = input.nextDouble();
//                System.out.print("please enter the Height = ");
//                height = input.nextDouble();
//                area = height * width;
//                perimeter = 2 *(height + width);
//                System.out.printf("Area is %.1f * %.1f = %.2f", width,height,area);
//                System.out.print("\nPerimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
//                break;
//            }catch (InputMismatchException e){
//                System.out.print("\n PLEASE ENTER A NUMBER !! \n");
//                input.nextLine();
//            }
//        }

        // Exercise.11 :

//        int seconednumber ,   firstnumber ;
//        while (true) {
//            try {
//                System.out.print("\nInput first integer: ");
//                firstnumber = input.nextInt();
//                System.out.print("\nInput second integer: ");
//                seconednumber = input.nextInt();
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("please enter numbers only !!!!!");
//                input.nextLine();
//            }
//        }
//        System.out.print("\n");
//        if (firstnumber != seconednumber){
//            System.out.println(firstnumber+" != "+seconednumber );
//        }
//        if (firstnumber == seconednumber){
//            System.out.println(firstnumber+" == "+seconednumber );
//        }
//        if (firstnumber < seconednumber){
//            System.out.println(firstnumber+" < "+seconednumber );
//        }
//        if (firstnumber <= seconednumber){
//            System.out.println(firstnumber+" <= "+seconednumber );
//        }
//        if (firstnumber > seconednumber){
//            System.out.println(firstnumber+" > "+seconednumber );
//        }
//        if (firstnumber >= seconednumber) {
//            System.out.println(firstnumber+" >= "+seconednumber );
//        }

        // Exercise.12 :

//        System.out.print("\nPlease enter total seconds: ");
//        int sec;
//        while (true){
//            try {
//                sec = input.nextInt();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter an Integer number ! ");
//                input.nextLine();
//            }
//        }
//        int hour = sec / 3600;
//        int min = (sec % 3600 ) / 60;
//        int sec2 = sec % 60 ;
//        System.out.printf("\nTime is: %d:%d:%d ",hour,min,sec2);

        // Exercise.13 :

//        double firstnumber =0 , secondnumber = 0,thirdnumber = 0 , fourthnumber = 0 ;
//        while (true){
//            try {
//                System.out.print("Input the first number : ");
//                firstnumber = input.nextInt();
//                System.out.print("Input the second number: ");
//                secondnumber = input.nextInt();
//                System.out.print("Input the third number : ");
//                thirdnumber = input.nextInt();
//                System.out.print("Input the Fourth number : ");
//                fourthnumber = input.nextInt();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter a number ");
//                input.nextLine();
//            }
//        }
//        try {
//            if ((firstnumber == secondnumber)&&(secondnumber==thirdnumber)&&(thirdnumber==fourthnumber)) {
//                System.out.print("Numbers are equal!");
//            } else {
//                throw new Exception("Numbers are not equal!");
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        // Exercise.14 :

//        int number = 0;
//        System.out.print("enter an integer number : ");
//        while (true){
//            try{
//                number = input.nextInt();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter an integer number ! ");
//                input.nextLine();
//            }
//        }
//        if (number < 0 ){
//            System.out.print("Number is negative. ");
//        } else if (number == 0) {
//            System.out.print("Number is Zero. ");
//        }else {
//            System.out.print("Number is positive. ");
//        }

        // Exercise.15 :

//        System.out.println("dear user enter any number (note that to exit enter -1)  : ");
//        int status =  1 ;
//        int totalnigative = 0 , totalpositive = 0 , totalzero = 0;
//        int number = 0 ;
//        for ( ; ; ){
//            try {
//                number = input.nextInt();
//                if (number == 0) {
//                    totalzero += 1 ;
//                }
//                if (number < 0 ) {
//                    if (number == -1){
//                        break;}
//                    totalnigative += 1 ;
//                }
//                if (number > 0) {
//                    totalpositive += 1 ;
//                }
//            }catch (InputMismatchException e){
//                System.out.println("please enter a number !! ");
//                input.nextLine();
//            }
//        }
//        System.out.println("Number of positives : " + totalpositive);
//        System.out.println("Number of Zeros : "+totalzero);
//        System.out.println("Number of negatives : "+totalnigative);


        // Exercise.16 :

//        System.out.print("Please enter a set of integer numbers : ");
//        int mynumbers = 0;
//        while (true){
//            try {
//                mynumbers = input.nextInt();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("please enter integer numbers only !!");
//                input.nextLine();
//            }
//        }
//        String mystringnumbers = String.valueOf(mynumbers);
//        String reversednumbers = "";
//        for (int i = 0 ; i < mystringnumbers.length() ;i++){
//            reversednumbers = mystringnumbers.charAt(i) + reversednumbers ;
//        }
//        System.out.print("Here is the reversed digits : "+ reversednumbers);

        // Exercise.17 :

//        int number = 0, largest = 0 , smallest = 0 ;
//        String choice = "";
//        while(true){
//            System.out.println("enter number : ");
//            while (true){
//                try {
//                    number = input.nextInt();
//                    break;
//                }catch (InputMismatchException e){
//                    System.out.println("please enter numbers only :");
//                    input.nextLine();
//                }
//            }
//            if (largest < number ){
//                largest = number;
//            }
//            if (smallest > number){
//                smallest = number;
//            }
//            input.nextLine();
//            while (true){
//                try {
//                    System.out.println("do you want to add another one ? (press n or no to exit y  or yes to continue) ");
//                    choice = input.nextLine().trim().toLowerCase();
//                    if (choice.equalsIgnoreCase("n")  || choice.equalsIgnoreCase("no")) {
//                        System.out.println("The largest number is : "+largest);
//                        System.out.println("The Smallest number is : "+smallest);
//                        return;
//                    }else if (choice.equalsIgnoreCase("y")  || choice.equalsIgnoreCase("yes")){
//                        break;
//                    }else {
//                        throw new Exception("please follow instructions correctly ");
//                    }
//                }catch (Exception e){
//                    System.out.println(e.getMessage());
//                }
//            }
//        }

        // Exercise.18 :

//        System.out.print("Please enter a sentence : ");
//        String mysentnce = "";
//        mysentnce = input.nextLine();
//        mysentnce= mysentnce.toLowerCase();
//        int counter = 0;
//        String spellchecker ="";
//        try {
//            for (int i = 0 ; i < mysentnce.length(); i++){
//                spellchecker= String.valueOf(mysentnce.charAt(i));
//
//                if (spellchecker.equals("a")){
//                    counter += 1;
//                }
//            }
//            if (counter == 0) {
//                throw new Exception("There are no 'a's in the sentence :(");
//            }
//            System.out.println("Number of 'A's in the sentnce is : " + counter);
//        }catch (Exception e ){
//            System.out.println(e.getMessage());
//        }



    }
}
