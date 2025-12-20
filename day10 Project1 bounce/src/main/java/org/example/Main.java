package org.example;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static double addition(ArrayList<Double> nums) {
        double sum = 0;
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }

    public static double subtraction(ArrayList<Double> nums) {
        if (nums.isEmpty()){
            return 0;
        }
        double result = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            result -= nums.get(i);
        }
        return result;
    }

    public static double multiplication(ArrayList<Double> nums) {
        if (nums.isEmpty()){
            return 0;
        }
        double result = 1;
        for (double n : nums){
            result *= n;
        }
        return result;
    }

    public static double division(ArrayList<Double> nums) {
           if (nums.size()< 2){
            throw new IllegalArgumentException("Division requires at least two numbers.");
            }
           double result = nums.get(0);
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) == 0) {
                throw new ArithmeticException("Error: Division by zero is not allowed.");
                }
                 result /= nums.get(i);
             }
        return result;
    }

    public static double modulus(ArrayList<Double> nums) {
        if (nums.size() < 2) {
            throw new IllegalArgumentException("Modulus requires at least two numbers.");
        }
        return nums.get(0) % nums.get(1);
    }

    public static double minimum(ArrayList<Double> nums) {
        if (nums.isEmpty()) {
            throw new IllegalStateException("Error: The results history is empty.");
        }
        return Collections.min(nums);
    }

    public static double maximum(ArrayList<Double> nums) {
        if (nums.isEmpty()) {
            throw new IllegalStateException("Error: The results history is empty.");
        }
        return Collections.max(nums);
    }

    public static double average(ArrayList<Double> nums) {
        if (nums.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double n : nums) {
            sum += n;
        }
        return sum / nums.size();
    }

    public static void printAllResults(ArrayList<Double> nums) {
        if (nums.isEmpty()) {
            System.out.println("there is no results to prints ");
        } else {
            System.out.println("\n  here is all  Results : ");
            for (int i = 0; i < nums.size(); i++) {
                System.out.print("Result "+ (i + 1)+ " : "+ nums.get(i));
            }
            System.out.println("---------------------------\n");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList <Double> myCalculatorHistory = new ArrayList<>();
        int myChoice = -1 ;
        boolean isCorrect ;

        while (true){
            System.out.println(
                           "\n------------------------------------------------------------------\n"+
                            "|                         Calculator                             |\n"+
                            "------------------------------------------------------------------\n"+
                            "|  1-Addition        |  2-Subtraction       |  3-Multiplication  |\n"+
                            "|--------------------+----------------------+--------------------|\n"+
                            "|  4-Division        |  5-Modulus           |  6-Find Minimum    |\n"+
                            "|--------------------+----------------------+--------------------|\n"+
                            "|  7-Find Maximum    |  8-Find Average      |  9-Last Result     |\n"+
                            "|----------------------------------------------------------------|\n"+
                            "|        10-Print All Results        |        0-Exist            |\n"+
                            "------------------------------------------------------------------\n");

            try {
                System.out.print("                   Your choice is =  ");
                myChoice = input.nextInt();

                if(myChoice > 10 || myChoice < 0 ){
                    throw new Exception("please enter a number within the menu ! ");
                }

                if (myChoice == 0) {
                    System.out.println("Thank you for using our Calculator :) ");
                    break;
                }

                double enteredNumber1 = 0, enteredNumber2 = 0 , result = 0 ;
                ArrayList <Double> myCalculator = new ArrayList<>();

                if (myChoice == 1) {
                    while (true) {
                        try {
                            System.out.print("Please enter first number: ");
                            enteredNumber1 = input.nextDouble();
                            myCalculator.add(enteredNumber1);
                            System.out.print("Please enter second number: ");
                            enteredNumber2 = input.nextDouble();
                            myCalculator.add(enteredNumber2);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter numbers only.");
                            input.nextLine();
                        }
                    }

                    System.out.println("here is the result of your of your addition :  "+ addition(myCalculator));
                    myCalculatorHistory.add(addition(myCalculator));
                }

                else if (myChoice == 2) {
                    while (true) {
                        try {
                            System.out.print("Please enter first number: ");
                            enteredNumber1 = input.nextDouble();
                            myCalculator.add(enteredNumber1);
                            System.out.print("Please enter second number: ");
                            enteredNumber2 = input.nextDouble();
                            myCalculator.add(enteredNumber2);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter numbers only.");
                            input.nextLine();
                        }
                    }
                    System.out.println("here is the result of your of your subtraction :  "+ subtraction(myCalculator));
                    myCalculatorHistory.add(subtraction(myCalculator));
                }

                else if (myChoice == 3) {
                    while (true) {
                        try {
                            System.out.print("Please enter first number: ");
                            enteredNumber1 = input.nextDouble();
                            myCalculator.add(enteredNumber1);
                            System.out.print("Please enter second number: ");
                            enteredNumber2 = input.nextDouble();
                            myCalculator.add(enteredNumber2);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter numbers only.");
                            input.nextLine();
                        }
                    }
                    System.out.println("here is the result of your of your multiplication :  "+ multiplication(myCalculator));
                    myCalculatorHistory.add(multiplication(myCalculator));
                }

                else if (myChoice == 4) {
                    while (true) {
                        try {
                            System.out.print("Please enter first number: ");
                            enteredNumber1 = input.nextDouble();
                            myCalculator.add(enteredNumber1);
                            System.out.print("Please enter second number: ");
                            enteredNumber2 = input.nextDouble();
                            myCalculator.add(enteredNumber2);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter numbers only.");
                            input.nextLine();
                        }
                    }
                    System.out.println("here is the result of your of your division :  "+ division(myCalculator));
                    myCalculatorHistory.add(division(myCalculator));
                }

                else if (myChoice == 5) {
                    while (true) {
                        try {
                            System.out.print("Please enter first number: ");
                            enteredNumber1 = input.nextDouble();
                            myCalculator.add(enteredNumber1);
                            System.out.print("Please enter second number: ");
                            enteredNumber2 = input.nextDouble();
                            myCalculator.add(enteredNumber2);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter numbers only.");
                            input.nextLine();
                        }
                    }
                    System.out.println("here is the result of your of your modulus :  "+ modulus(myCalculator));
                    myCalculatorHistory.add(modulus(myCalculator));
                }

                else if (myChoice == 6) {
                    System.out.println("The Minimum result is: :  "+ minimum(myCalculator));
                }

                else if (myChoice == 7) {
                    System.out.println("The Maximum result is: "+ maximum(myCalculator));
                }

                else if (myChoice == 8) {
                    System.out.println("he Average of all results  is:  "+ average(myCalculator));
                }

                else if (myChoice == 9) {
                    if (myCalculatorHistory.isEmpty()) {
                        System.out.println("you did not enter an operation to give the last result ");
                    } else {
                        System.out.println("your last operation result is : " + myCalculatorHistory.get(myCalculatorHistory.size() - 1));
                    }
                }

                else if (myChoice == 10) {
                    printAllResults(myCalculatorHistory);
                }

            }catch (InputMismatchException e){
                System.out.println("please enter an integer number only ! ");
            }catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }


    }
}