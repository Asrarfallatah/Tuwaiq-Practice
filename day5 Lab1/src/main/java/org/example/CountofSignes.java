package org.example;

import java.util.Scanner;

public class CountofSignes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number : ");
        int status =  1 ;
        int totalnigative = 0 , totalpositive = 0 , totalzero = 0;
        int number ;
        for ( ; ; ){

            number = input.nextInt();

            if (number == 0) {

                totalzero += 1 ;

            }
            if (number < 0 ) {

                if (number == -1){
                    break;}

                totalnigative += 1 ;

            }
            if (number > 0) {

                totalpositive += 1 ;

            }

        }

        System.out.println("Number of positives : " + totalpositive);
        System.out.println("Number of Zeros : "+totalzero);
        System.out.println("Number of negatives : "+totalnigative);

    }
}
