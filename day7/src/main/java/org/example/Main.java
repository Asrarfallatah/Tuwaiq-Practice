package org.example;

import java.util.Scanner;

public class Main {

//   public static void mymthode1 (){
//       System.out.println("hello you are inside a void methode without arguments ");
//   }
//

//        public static void mymthode (String s){
//        System.out.println("hello user you are inside a methode  with arguments and your name is  "+ s);
//        if (s.length() >= 5){
//            System.out.println("your name is long ");
//        }else {
//            System.out.println("your name is short");
//        }
//    }


//    public static void checkarray(ArrayList<Integer> s){
//        for ( Integer i : s) {
//            if (( i % 2)== 0){
//                System.out.println(i +" elemnet is even "+ i);
//            }
//        }
//    }


//    public static double sum(double a , double b){
//
//        double result = a + b ;
//
//        return result;
//    }
//    public static  double avrege(double result){
//
//        double answer = result / 2 ;
//
//        return answer ;
//    }


//    public static ArrayList check(String s []){
//
//        ArrayList <String> myarraynew  = new ArrayList<>();
//
//        for ( int i =0 ; i < s.length; i++) {
//
//            if (s[i].startsWith("S")){
//                myarraynew.add(s[i]);
//            }
//        }
//        return myarraynew;
//    }



//    public static void addToPlaylist(String song, ArrayList<String> playList){
//        playList.add(song);
//    }
//
//    public static void addToFav(String song, ArrayList<String> favorite){
//        favorite.add(song);
//    }


    //// EXEERSISE 1 :
//    public static double smallest (int a , int b, int c ){
//        double smallestnumber = 0 ;
//        if ((a <= b)&& (a <= c)) {
//            smallestnumber = a ;
//        } else if ((b <= a )&& (b <= c)) {
//            smallestnumber = b;
//        }else {
//            smallestnumber = c;
//        }
//        return smallestnumber;
//    }

    //// EXEERSISE 2 :
//    public static void checknegative (int a ){
//        if (a  > 0){
//            System.out.println(" the number "+ a +" is positive ");
//        } else if (a  < 0) {
//            System.out.println(" the number "+ a +" is negative ");
//        } else if (a  == 0) {
//            System.out.println(" the number "+ a +" is zero ");
//        }
//    }

    ///  EXEERSISE 3 :
    public static boolean  checkstring(String a ){
        boolean isTrue = true;
        int isNumber = 0;

        if (a.length() < 8){
            isTrue = false;
        }

        for(int i = 0 ; i < a.length(); i++){
            char check = a.charAt(i);
            if ( !Character.isLetterOrDigit(check) ){
                isTrue = false;
            }
            if (Character.isDigit(check)){
                isNumber ++;
            }
        }

        if (isNumber < 2){
            isTrue = false;
        }

        return isTrue ;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("\nhello you are inside Main methode in the class ");
//
//        mymthode1();
//
//       System.out.println("what is your name : ");
//       String names = input.nextLine();
//       mymthode(names);
//
//        System.out.println("");
//        System.out.println("what is your name : ");
//         names = input.nextLine();
//
//        mymthode(names);

//
//        ArrayList <Integer> myarray  = new ArrayList<>();
//
//        myarray.add(4);
//        myarray.add(5);
//        myarray.add(10);
//        myarray.add(1);
//        myarray.add(2);
//        myarray.add(17);
//
//
//        System.out.println("my array in main method : "+ myarray);
//        checkarray(myarray);


//        System.out.print("please enter the first number : ");
//        double first = input.nextDouble();
//        System.out.print("please enter the 2nd number : ");
//        double seconed = input.nextDouble();
//
//        double trying = sum(first,seconed);
//
//        System.out.println("the result of adding two number is : "+first +" + "+ seconed+" = "+ trying);
//
//        System.out.println("the avrege : "+ avrege(trying));


//        String array []= {"Sarah","Majd","Sama","Huda"};
//
//        System.out.println("my array is : "+check(array));

//
//        ArrayList<String> playList = new ArrayList<>();
//        ArrayList<String> favorite = new ArrayList<>();
//
//        int choice;
//        do {
//
//            System.out.println(("What do you want to do\n1-Add song to play list\n2-Add song to favorite libary \nenter 3 to exit"));
//            choice = input.nextInt();
//            input.nextLine();
//
//            switch (choice) {
//                case 1 :
//                    System.out.println("Enter the name of the song: ");
//                    String add = input.nextLine();
//                    addToPlaylist(add, playList);
//                    System.out.println("Song added to playlist");
//                    System.out.println("--------------------------------------------------------------");
//                    break;
//
//
//                case 2 :
//                    System.out.println("Enter the name of the song: ");
//                    String fav = input.nextLine();
//                    addToFav(fav, favorite);
//                    System.out.println("Song added to favorite");
//                    System.out.println("--------------------------------------------------------------");
//                    break;
//
//                case 3 :
//                    break;
//
//                default:
//                    System.out.println("invalid input");
//                    System.out.println("--------------------------------------------------------------");
//            }
//
//
//        } while (choice != 3);
//
//        System.out.println("here is your play list: " + playList);
//        System.out.println("here is your favorite list" + favorite);


        // EXCERSIE 1 :

//        System.out.println("please enter the 1st number :");
//        int first = input.nextInt();
//        System.out.println("please enter the 2nd number :");
//        int seconed = input.nextInt();
//        System.out.println("please enter the 3rd number :");
//        int third = input.nextInt();
//        System.out.println("The smallest value is "+smallest(first,seconed,third));

        // EXCERSIE 2 :

//        System.out.println("please enter the 1st number :");
//        int number = input.nextInt();
//        checknegative(number);



        // EXCERSIE 3 :

        System.out.println("please enter a password that follows these rules:\n" +
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits\n" +
                "4. Note that by typing this passowrds (You are agreeing to the above Terms and Conditions.):");

        String passwords = input.nextLine();
        System.out.println(" your passwords is : "+ passwords);

        boolean checked = checkstring(passwords);
        if (checked ){
            System.out.println(" your passowrd is valid ");
        }else {
            System.out.println(" your passowrd is not valid ");
        }

    }
}