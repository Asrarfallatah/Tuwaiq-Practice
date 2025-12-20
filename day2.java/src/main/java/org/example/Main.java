package org.example;
import java.util.Scanner;

/*
       review and recall basic Java concepts such as :
       "single and Multi Line comments , Data type , variables , connections "+" , Scanner
       new Information :
       1-to specify float in java you must add f to the numbers
       2- to have a clean code variables always start with small litter and classes Capital litter
       3- Strings are actually an object that contains methods that can perform certain operations on strings
       4- the difference between the preparative and non-preparative methods :
               -> if the methode Has capital litter like "toUpperCase" then preparative
               -> if the methode Has all small litter like "length" then non-preparative
*/

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Saudi Bank ");

        // data type and variables in Java :

        String first_name = "Asrar" ;
        char middle_name = 'I';
        String last_name = "Fallatah";
        int age = 23 ;
        float salary = 1300.67f ;
        long national_id = 1111111646 ;
        boolean jobStatus =true ;

       System.out.print("User info :\nname :" + first_name +" " + middle_name  +" " + last_name + "\nnational ID :" + national_id + "\nAge:"+ age +"\nAre you working right now ? " + jobStatus +"\nIf True what is user salary : " + salary);

       // using Scanner methods :
       System.out.print("\n ------------------------------------------------ \n ");
       System.out.print("\nwhat is you first name : ");
       first_name = input.nextLine();
       System.out.print("what is you middle name  : " );
       middle_name = input.next().charAt(0);
       input.nextLine(); // this because how Scanner handles input buffering so the compile skip the last name
       System.out.print("what is you last name : ");
       last_name = input.nextLine();
       System.out.print("what is you national ID : ");
       national_id = input.nextLong();
       System.out.print("what is you age : ");
       age = input.nextInt();
       System.out.print("do you have a job ? (true or false) : ");
       jobStatus = input.nextBoolean();
       System.out.print("if True what is you salary : (write zero if false) : " );
       salary = input.nextFloat();

        System.out.print("new User info :\nname :" + first_name +" " + middle_name  +" " + last_name + "\nnational ID :" + national_id + "\nAge:"+ age +"\nAre you working right now ? " + jobStatus +"\nIf True what is user salary : " + salary);

        // operations (logical / arithmetic / comparison )

        double num1 = 2 ;
        double num2 = 22;
        double num3 = 200;
        double num4 = 220;
        double result = (num2 / num1 ) + (num2 * num1) - (num2 % num1)  ;

        // arithmetic :
        System.out.print("\n ------------------------------------------------ \n");
        System.out.println("result of arithmetic operation " +  (num2 / num1 ) + " + " + (num2 * num1) + " - " + (num2 % num1) + " = " + result );

       // comparison :
        System.out.print("\n ------------------------------------------------ \n");
        System.out.println("comparing result : " );
        System.out.println("between "+ num1 +" > " + num2+" result is " +(num1 > num2) );
        System.out.println("between "+ num1 +" < " + num2+" result is " +(num1 < num2) );
        System.out.println("between "+ num1 +" >= " + num2+" result is " +(num1 >= num2) );
        System.out.println("between "+ num1 +" <= " + num2+" result is " + (num1 <= num2) );
        System.out.println("between "+ num1 +" != " + num2+" result is " + (num1 != num2) );
        System.out.println("between "+ num1 +" == " + num2+" result is " +(num1 == num2) );

        // logical
        System.out.print("\n ------------------------------------------------ \n");
        System.out.println("logical result : " );
        System.out.println("between "+ num1 +" > " + num2+" and "+ num1 +" < " + num2+" result is "+ ((num1 > num2)&&(num1 < num2)) );
        System.out.println("between "+ num1 +" > " + num2+" or "+ num1 +" < " + num2+" result is "+ ((num1 > num2)||(num1 < num2)) );
        System.out.println("for ! ( "+ num1 +" > " + num2+" ) result is "+ !(num1 > num2) );

        //String methods :
        System.out.print("\n ------------------------------------------------ \n");
        first_name = "    Asrar Ibrahim Ahmed Fallatah    " ;
        System.out.println("my name is : ["+first_name+"]");
        System.out.println("changing name to Upper Case : " + first_name.toUpperCase());
        System.out.println("changing name to lower Case : " + first_name.toLowerCase());
        System.out.println("trimming the name : [" +first_name.trim()+"]"); // remove extra line before and after the strings
        System.out.println("replacing  Asrar with Anwaar  : " +first_name.replace(" Asrar", "Anwaar"));
        System.out.println("replacing Asrar with dash : " +first_name.replaceAll(" Asrar ", " ----- "));
        System.out.println("does the name start with Asrar? " +first_name.startsWith("    Asrar"));
        System.out.println("does the name end with Asrar? " +first_name.endsWith("    Asrar"));
        System.out.println("the location of Ahmed ? " +first_name.indexOf("Ahmed"));
        System.out.println("the litter at  24 position of the String is  ? " +first_name.charAt(24));

        // special character:
        System.out.print("\n ------------------------------------------------ \n");
        System.out.println(" having (\\t) between Asrar fallatah -> Asrar \t fallatah ");
        System.out.println(" having (\\) between Asrar fallatah ->  Asrar \\ fallatah ");
        System.out.println(" having (\\n) between Asrar fallatah ->  Asrar \n fallatah ");
        System.out.println(" having (\") between Asrar fallatah ->  Asrar \" fallatah ");
        System.out.println(" having (\') between Asrar fallatah ->  Asrar \' fallatah ");
        input.close();
    }
}