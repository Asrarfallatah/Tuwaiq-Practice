package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //conditional statement

        //1-if statement :
        System.out.println("welcome to the Almannara Gym female section\n" +
                "our rules and conditions : \n" +
                "Female only , No entry for men above 12 years old \n" +
                "Please keep the place clean \n" +
                "no eating next to the training devices");

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("what is your gender: (write female or male ) : ");
        String gender = input.nextLine();

        if (gender.equals("male")) {
            System.out.print("Dear "+name+" Please go to men section ");
            if (age <= 11)
                System.out.print("or wait for a female companion");
        }

        //if - else

        if (gender.equals("female")) {
            System.out.print("Dear "+name+" thank you for registering to our Gym");
            if (age >= 12) {
                System.out.print("Please keep the place clean and use the training device wisely");
            }else   {
                System.out.print("You need a companion to use the training devices ");
            }
        }

        //if - else 2
        String sentence = " my menu : Rice , burger , pizza , potato , coffee , tea , chiken naggit  ";
        System.out.print("Enter your what you would like to order PLease : ");
        String mykeyword = input.nextLine();
        sentence = sentence.toLowerCase();
        mykeyword = mykeyword.toLowerCase();
        if(sentence.contains(mykeyword)){
            System.out.println("your order is "+ mykeyword+" and it is ready ");
        }else {
            System.out.println("your order is "+ mykeyword+" and it is not ready ");
        }

        // if -  else if - else

        System.out.print("Dear user this 911  what is your emergency?  : \n" +
                "Press 1 for Fire Forces \n" +
                "Press 2 for Policemen \n" +
                "press 3 for Ambulance \n");
        int emergency = input.nextInt();
        if ( emergency== 1){
            System.out.println("Please wait. The fire fighters are in their way");
        }
        else if (emergency== 2){
            System.out.println("Please wait. The police are in their way ");
        }
        else if (emergency == 3){
            System.out.println("Please wait. The ambulance is in their way ");
        }
        else {
            System.out.println("Invalid selection. Please call again if this is an emergency.");
        }

        // switch statement

        System.out.print("Dear customer you can book your appointment from this list  : \n" +
                "A. dentice \n" +
                "B. blastic sergry \n" +
                "c. liser \n");
        char choice = input.nextLine().charAt(0);
        switch (choice){
            case 'A':
                System.out.print("the price is $200 for any dental assistance do you wanna confirm ?");
                break;
            case 'B':
                System.out.print("the price is $200000 for any plastic surgry assistance do you wanna confirm ?");
                break;
            case 'C':
                 System.out.print("the price is $200000 for any plastic surgry assistance do you wanna confirm ?");
                    break;
            default:
                System.out.println("Invalid choice");
        }

        // challenges 1 :

        System.out.print("Enter a number ");
        int num = input.nextInt();
        if ((num  % 2) == 0){
            System.out.print("its even ");
        }else  {
            System.out.print("its odd");
        }

        //challenge 2 :

        System.out.print("Enter a number ");
        int num1 = input.nextInt();
        if (num1 > 0 &&  (num1 * 2 > 100)){
            System.out.print("big ");
        }else  {
            System.out.print("small");
        }

        //challenge 3 :

        System.out.print("Enter a number1 : ");
        int number1 = input.nextInt();
        System.out.print("Enter a number2 : ");
        int number2 = input.nextInt();

        int result2 = number1 + number2;

        if (((result2 % 2 ) == 0) && ((result2 % 4 ) == 0)){
            System.out.print("special addition ");
        }else  {
            System.out.print("regular addition");
        }

        // challenge 4 :

        System.out.print("please select a choice  : \n" +
                "1- check if a number is a multiple of 5\n" +
                "2- check if a number is odd or even" +
                "3- exit ");
        int choices = input.nextInt();
        switch (choices) {
            case 1:
                System.out.print("Enter a number ");
                int nuumbercheck = input.nextInt();

                switch (nuumbercheck % 5 ){
                    case 0:
                    System.out.print("the number is a multiple of 5 ");
                    break;
                    default:
                    System.out.print("the number is not a multiple of 5 ");
                }
                break;
            case 2:
                System.out.print("Enter a number ");
                 nuumbercheck = input.nextInt();
               switch (nuumbercheck % 2 ){
                   case 0:
                    System.out.print("the number is even ");
                break;
                default:
                    System.out.print("the number is odd ");
                    break;
                }
                break;
            case 3:
                System.out.println("exit application");
                break;
                default:
                    System.out.println("Invalid choice");
        }

        // challenge 5
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

        // challenge 6

        Random rand = new Random();

        System.out.println("please guess a nummber :");
        int guess = input.nextInt();

        int cpuguess =  rand.nextInt(10)+1;
        System.out.print("the cpu guess is :"+ cpuguess);

        if (guess == cpuguess){
            System.out.print("good job");
        }else if (guess > cpuguess)  {
        System.out.print("your guess is bigger");
        }else if (guess < cpuguess) {
            System.out.print("your guess is smaller");
        }
    }
}