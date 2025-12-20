package org.example;

import java.util.Scanner;

public class GreatestCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();

        int thegreatest ;

        if(firstNumber >= secondNumber && firstNumber >= thirdNumber ){
        thegreatest = firstNumber;
        }else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
            thegreatest = secondNumber;
        }else{
            thegreatest = thirdNumber ;
        }
        System.out.print("the greatest number is :"+ thegreatest);
    }
}
