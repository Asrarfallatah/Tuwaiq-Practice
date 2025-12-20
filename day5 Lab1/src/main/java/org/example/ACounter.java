package org.example;

import java.util.Scanner;

public class ACounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a sentnce : ");
        String mysentnce = input.nextLine();
        mysentnce= mysentnce.toLowerCase();
        int counter = 0;

        for (int i = 0 ; i < mysentnce.length(); i++){
            String mysentncechecker= String.valueOf(mysentnce.charAt(i));
            if (mysentncechecker.equals("a")){
                counter += 1;
            }
        }
        System.out.print("Number of a's: "+counter);
    }
}
