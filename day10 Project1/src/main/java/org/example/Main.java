package org.example;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int count = 1 ;
    public static int Rounds = 1 ;

    public static void printBoard(String [][] printBoard ){
        for (String[] stringColumn : printBoard) {
            for (String stringRow : stringColumn) {
                System.out.print(stringRow);
            }
            System.out.println();
        }
    }

    public static boolean isPlaceAvailable(String [][] checkBoard , int cpuChoiceCheck){

        if (cpuChoiceCheck == 1 ){
            return checkBoard[1][1].equals( " 1 ");
        } else if (cpuChoiceCheck == 2) {
            return checkBoard[1][3].equals( " 2 ");
        }else if (cpuChoiceCheck == 3) {
            return checkBoard[1][5].equals( " 3 ");
        }else if (cpuChoiceCheck == 4) {
            return checkBoard[3][1].equals( " 4 ");
        }else if (cpuChoiceCheck == 5) {
            return checkBoard[3][3].equals( " 5 ");
        }else if (cpuChoiceCheck == 6) {
            return checkBoard[3][5].equals( " 6 ");
        }else if (cpuChoiceCheck == 7) {
            return checkBoard[5][1].equals( " 7 ");
        }else if (cpuChoiceCheck == 8) {
            return checkBoard[5][3].equals( " 8 ");
        }else if (cpuChoiceCheck == 9) {
            return checkBoard[5][5].equals( " 9 ");
        }
        return false;

    }

    public static boolean playerDesitions(String [][] boardPlace , int myChoice){

        int row , column ;

        if (myChoice == 1 ){
            row = 1;
            column = 1;
        } else if (myChoice == 2) {
            row = 1;
            column = 3;
        }else if (myChoice == 3) {
            row = 1;
            column = 5;
        }else if (myChoice == 4) {
            row = 3;
            column = 1;
        }else if (myChoice == 5) {
            row = 3;
            column = 3;
        }else if (myChoice == 6) {
            row = 3;
            column = 5;
        }else if (myChoice == 7) {
            row = 5;
            column = 1;
        }else if (myChoice == 8) {
            row = 5;
            column = 3;
        }else if (myChoice == 9) {
            row = 5;
            column = 5;
        }else {
            System.out.println(" Invalid input :) ");
            return false;
        }

        if (!isPlaceAvailable(boardPlace, myChoice)) {
            System.out.println("the spot is already taken ! please try again ");
            return false;
        }

        boardPlace[row][column] = " x ";
        count += 1;
        return true;

    }

    public static boolean cpuDesitions(String [][] boardPlaceCpu , int cpuChoice){
        int cpuRow = 0, cpuColumn = 0;

        if(cpuChoice == 1){
            cpuRow = 1;
            cpuColumn = 1;
        } else if (cpuChoice == 2) {
            cpuRow = 1;
            cpuColumn = 3;
        } else if (cpuChoice == 3) {
            cpuRow = 1;
            cpuColumn = 5;
        } else if (cpuChoice == 4) {
            cpuRow = 3;
            cpuColumn = 1;
        } else if (cpuChoice == 5) {
            cpuRow = 3;
            cpuColumn = 3;
        } else if (cpuChoice == 6) {
            cpuRow = 3;
            cpuColumn = 5;
        } else if (cpuChoice == 7) {
            cpuRow = 5;
            cpuColumn = 1;
        } else if (cpuChoice == 8) {
            cpuRow = 5;
            cpuColumn = 3;
        } else if (cpuChoice == 9) {
            cpuRow = 5;
            cpuColumn = 5;
        }

        boardPlaceCpu[cpuRow][cpuColumn] = " O ";
        count += 1;
        return true;
    }

    public static String winnerCheck(String [][] checkWinnerBoard ){

        if     (checkWinnerBoard[1][1].equals(" x ") && checkWinnerBoard[1][3].equals(" x ") && checkWinnerBoard[1][5].equals(" x ") ||
                checkWinnerBoard[3][1].equals(" x ") && checkWinnerBoard[3][3].equals(" x ") && checkWinnerBoard[3][5].equals(" x ") ||
                checkWinnerBoard[5][1].equals(" x ") && checkWinnerBoard[5][3].equals(" x ") && checkWinnerBoard[5][5].equals(" x ") ||

                checkWinnerBoard[1][1].equals(" x ") && checkWinnerBoard[3][1].equals(" x ") && checkWinnerBoard[5][1].equals(" x ") ||
                checkWinnerBoard[1][3].equals(" x ") && checkWinnerBoard[3][3].equals(" x ") && checkWinnerBoard[5][3].equals(" x ") ||
                checkWinnerBoard[1][5].equals(" x ") && checkWinnerBoard[3][5].equals(" x ") && checkWinnerBoard[5][5].equals(" x ") ||

                checkWinnerBoard[1][1].equals(" x ") && checkWinnerBoard[3][3].equals(" x ") && checkWinnerBoard[5][5].equals(" x ") ||
                checkWinnerBoard[1][5].equals(" x ") && checkWinnerBoard[3][3].equals(" x ") && checkWinnerBoard[5][1].equals(" x ")){
            return "player";
        }
        else if (checkWinnerBoard[1][1].equals(" O ") && checkWinnerBoard[1][3].equals(" O ") && checkWinnerBoard[1][5].equals(" O ") ||
                checkWinnerBoard[3][1].equals(" O ") && checkWinnerBoard[3][3].equals(" O ") && checkWinnerBoard[3][5].equals(" O ") ||
                checkWinnerBoard[5][1].equals(" O ") && checkWinnerBoard[5][3].equals(" O ") && checkWinnerBoard[5][5].equals(" O ") ||

                checkWinnerBoard[1][1].equals(" O ") && checkWinnerBoard[3][1].equals(" O ") && checkWinnerBoard[5][1].equals(" O ") ||
                checkWinnerBoard[1][3].equals(" O ") && checkWinnerBoard[3][3].equals(" O ") && checkWinnerBoard[5][3].equals(" O ") ||
                checkWinnerBoard[1][5].equals(" O ") && checkWinnerBoard[3][5].equals(" O ") && checkWinnerBoard[5][5].equals(" O ") ||

                checkWinnerBoard[1][1].equals(" O ") && checkWinnerBoard[3][3].equals(" O ") && checkWinnerBoard[5][5].equals(" O ") ||
                checkWinnerBoard[1][5].equals(" O ") && checkWinnerBoard[3][3].equals(" O ") && checkWinnerBoard[5][1].equals(" O ")){
            return "CPU";
        }
        return "no one" ;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int counter = 1;
        int cpuWinsCounter = 0 , myWinsCounter = 0 , noOneWins = 0 ;


        while (true) {
            try {
                System.out.println("dear user how many rounds you want to play ? ");
                Rounds = input.nextInt();

                if (Rounds > 0) {
                    break;
                } else {
                    throw new Exception("please enter a positive integer numbers only that are greater than  zero  ! ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter how many number round you want (note that only use integer number )");
                input.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }


        while ( counter <= Rounds){

            System.out.println("\n ***********************************");
            System.out.println("\n round number " + counter + " starts now good luck :) ");
            System.out.println("\n ***********************************");

            count = 1 ;

            // 2D arrays :

            String [][] myBoard = {
                    {"--","--", "-",  "---", "-", "--","--"},
                    {"|"," 1 ", "|", " 2 ", "|", " 3 ","|"},
                    {"|"," __", "+",  "___", "+", "__"," |"},
                    {"|"," 4 ", "|", " 5 ", "|", " 6 ","|"},
                    {"|"," __", "+",  "___", "+", "__"," |"},
                    {"|"," 7 ", "|", " 8 ", "|", " 9 ","|"},
                    {"--","--", "-",  "---", "-", "--","--"},
            };

            printBoard(myBoard);
            int myChoice = 0 ,cpuChoice = 0 ;
            String winner = "";

            while (count <= 9 ) {

                try {
                    System.out.print("please enter where do you want to put you X : ");
                    myChoice = input.nextInt();

                    if (myChoice < 1 || myChoice > 9) {
                        printBoard(myBoard);
                        throw new Exception("please enter a number with the board game range above ");
                    }

                    if (!isPlaceAvailable(myBoard, myChoice)) {
                        printBoard(myBoard);
                        System.out.println("the place is taken please choose another place please ! ");
                        continue;
                    }

                    playerDesitions(myBoard,myChoice);
                    printBoard(myBoard);

                }catch (InputMismatchException e ){
                    System.out.println("please enter an integer number only ! ");
                    input.nextLine();
                    continue;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    continue;
                }

                winner = winnerCheck(myBoard);
                if( winner.equalsIgnoreCase("player")){
                    System.out.println("congratulations , You win :)");
                    myWinsCounter ++;
                    break;
                }

                if (count >= 9  && winner.equals("no one") ) {
                    System.out.println("it's a tie :/ ");
                    noOneWins ++;
                    break;
                }

                System.out.println("CPU turn to put O : ");
                do {
                    cpuChoice = random.nextInt(9)+ 1;
                } while (!isPlaceAvailable(myBoard, cpuChoice));

                cpuDesitions(myBoard,cpuChoice);
                printBoard(myBoard);

                winner = winnerCheck(myBoard);
                if (winner.equalsIgnoreCase("cpu")) {
                    System.out.println("CPU wins, Sadly you lost :(");
                    cpuWinsCounter ++;
                    break;
                }

            }

            counter ++ ;
        }

        System.out.println("\n ***********************************\n");
        System.out.println("number of you winning are = "+myWinsCounter);
        System.out.println("number of ties are = "+noOneWins);
        System.out.println("number of CPU wins are = "+cpuWinsCounter);
        System.out.println("\n ***********************************\n");

    }


}

/// 2D array Syntax :
//String [][] myBoard = {
//                    {"--","--", "-",  "---", "-", "--","--"},
//                    {"|"," 1 ", "|", " 2 ", "|", " 3 ","|"},
//                    {"|"," __", "+",  "___", "+", "__"," |"},
//                    {"|"," 4 ", "|", " 5 ", "|", " 6 ","|"},
//                    {"|"," __", "+",  "___", "+", "__"," |"},
//                    {"|"," 7 ", "|", " 8 ", "|", " 9 ","|"},
//                    {"--","--", "-",  "---", "-", "--","--"},
//            };

///  FOR LOOP Syntax
//        for (int i = 0; i < my2DArray.length; i++) {
//            for (int j = 0; j < my2DArray[i].length; j++) {
//                System.out.print(my2DArray[i][j] + " | ");
//            }
//            System.out.println();
//        }

/// FOR EACH LOOP Syntax  :
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
//        for (String row [] :my2DArray){
//            for (String column : row){
//                System.out.print(column + " | ");
//            }
//            System.out.println();
//        }
