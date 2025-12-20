package org.example;

import java.util.Random;
import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int day =  rand.nextInt(7)+1;

        System.out.println("the number is :"+ day);

        switch (day){
        case 1:
            System.out.println("the day is Sunday");
            break;
            case 2:
                System.out.println("the day is Monday");
                break;
                case 3:
                    System.out.println("the day is Tuesday");
                    break;
                    case 4:
                    System.out.println("the day is Wednesday");
                    break;
                    case 5:
                    System.out.println("the day is Thursday");
                    break;
                    case 6:
                    System.out.println("the day is Friday");
                    break;
                    case 7:
                        System.out.println("the day is Saturday");
                        break;
                        default:
                            System.out.println("the day is Not a valid day");
        }
    }

}
