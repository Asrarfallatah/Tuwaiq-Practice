package org.example;


import java.util.Scanner;

public class Main {

//    public static void firstmethod (int [] array){
//        System.out.println("my Reversed Array : ");
//
//        for (int i = array.length-1 ; i >= 0 ; i--) {
//            System.out.print( array[i]+ " ");
//        }
//
//    }

//    public static int seconedmethod(int min, int max) {
//        Random random = new Random();
//        return random.nextInt(max - min + 1) + min;
//    }


//    public static int seconedmethod(String password) {
//        int length = password.length();
//        int lengthchecked ;
//        if (length >= 8) {
//            lengthchecked = 3;
//        } else if (length >= 6) {
//            lengthchecked = 2;
//        } else {
//            lengthchecked = 0;
//        }
//        return lengthchecked ;
//    }
//    public static int thirdmethod(String password) {
//        int checkedchar;
//        if (password.matches(".*[^a-zA-Z0-9].*")) {
//            checkedchar =  2;
//        } else {
//            checkedchar = 0;
//        }
//        return checkedchar;
//    }
//    public static int fourthmethod(String password) {
//        boolean upparcase = false;
//        boolean lowercase = false;
//        for (char c : password.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                upparcase = true;
//            } else if (Character.isLowerCase(c)) {
//                lowercase = true;
//            }
//            if (upparcase && lowercase) {
//                return 3;
//            }
//        }
//        return (upparcase && lowercase) ? 3 : 0;
//    }
//    public static String fifthmethod(String password) {
//        int lengthScore = seconedmethod(password);
//        int specialCharScore = thirdmethod(password);
//        int caseScore = fourthmethod(password);
//        int totalScore = lengthScore + specialCharScore + caseScore;
//        String classification;
//        if (totalScore >= 8) {
//            classification = "strong.";
//        } else if (totalScore >= 5) {
//            classification = "moderately strong.";
//        } else {
//            classification = "weak.";
//        }
//        return classification;
//    }


    public static void fibonacci(int n) {
        System.out.println("Fibonacci sequence with " + n + " terms:");
        if (n <= 0) {
            System.out.println();
            return;
        }
        int a = 0;
        int b = 1;

        if (n == 1) {
            System.out.println(a);
            return;
        }

        System.out.print(a + " " + b);

        for (int i = 3; i <= n; ++i) {
            int c = a + b;

            System.out.print(" " + c);

            a = b;
            b = c;
        }
        System.out.println();
    }





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /// Ex1 :

//        String dictionary[] = {"cat", "dog", "red", "is", "am"};
//        int checklength = 0;
//
//        AbstractList <String> longestindictionary = new ArrayList<>() ;
//
//        System.out.println("\nmy dictionary elments are : "+Arrays.toString(dictionary));
//
//        for (String checkelments : dictionary) {
//
//            int length = checkelments.length();
//
//            if (length > checklength) {
//                checklength = length;
//                longestindictionary.clear();
//                longestindictionary.add(checkelments);
//            } else if (length == checklength) {
//                longestindictionary.add(checkelments);
//            }
//
//        }
//
//        System.out.println("\nlongest words in my dictionary is : "+longestindictionary);


        /// Ex2 :

//        int occurrences[] = {1,1,1,3,3,5};
//
//        for (int i = 0; i < occurrences.length; i++) {
//
//            int numberoccurrences = occurrences[i];
//            int numbercounter = 0;
//            int cnumbercheck ;
//            boolean numberchecked = false ;
//
//            for (int s = 0; s < i; s++) {
//                if (occurrences[s] == numberoccurrences) {
//                    numberchecked = true;
//                    break;
//                }
//            }
//
//            if (numberchecked) {
//                continue;
//            }
//
//            for(int j = 0; j < occurrences.length; j++) {
//                 cnumbercheck = occurrences[j];
//                if (numberoccurrences == cnumbercheck){
//                    numbercounter ++;
//                }
//            }
//            System.out.println(occurrences[i]+" occurs "+numbercounter+" times");
//        }

        /// Ex3 :

//        int Largestelment[] = {1, 4, 17, 7, 25, 3, 100};
//        System.out.println("my array is "+Arrays.toString(Largestelment));
//
//        System.out.println("dear user how many Elements do you wanna find ? ");
//        int k = input.nextInt();
//
//        Arrays.sort(Largestelment);
//        int size = Largestelment.length;
//
//        if (k > size){
//            System.out.println("dear user enter a number that is between 0 and "+ size);
//             k = input.nextInt();
//
//            System.out.println(k+" largest elements of the said array are: ");
//            for (int i = size-1 ; i >= size -k ; i--) {
//                System.out.print(" "+ Largestelment[i]);
//            }
//        } else {
//
//            System.out.println(k+" largest elements of the said array are: ");
//            for (int i = size-1 ; i >= size -k ; i--) {
//                System.out.print(" "+ Largestelment[i]);
//            }
//
//        }

        /// Ex4 :

//        int revesedarray [] = {5,4,3,2,1};
//        System.out.println("my array is : "+Arrays.toString(revesedarray));
//        firstmethod(revesedarray);

        /// Ex5 :

//        System.out.print("How many elements you want ? ");
//        int  myelementsize = input.nextInt();
//
//        ArrayList<Integer> myarraylist = new ArrayList<>();
//        int choice = 0;
//
//        while (true) {
//
//            System.out.println("\ndear user please choose one :\n" +
//                    "1. Accept elements of the array\n" +
//                    "2. Display elements of the array\n" +
//                    "3. Search an element in the array\n" +
//                    "4. Sort the Array\n" +
//                    "5. To Stop please enter the size of your array (note array size = "+myelementsize+" )");
//            System.out.print(" your choice is : ");
//             choice = input.nextInt();
//
//            switch (choice) {
//
//                case 1:
//                    for (int i = 1; i <= myelementsize; i++) {
//                        System.out.println("please enter the " + i + " elements : ");
//                        myarraylist.add(input.nextInt());
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("my array elements are : " + myarraylist);
//                    break;
//
//                case 3:
//                    System.out.print("what element are you looking for ? ");
//                    int searchedelement = input.nextInt();
//                    if (myarraylist.contains(searchedelement)) {
//                        System.out.println("the element : " + searchedelement + " is at index " + myarraylist.indexOf(searchedelement));
//                    } else {
//                        System.out.println("the element : " + searchedelement + " is NOT in the array.");
//                    }
//                    break;
//
//                case 4:
//                    Collections.sort(myarraylist);
//                    System.out.println("my array after sorting : " + myarraylist);
//                    break;
//
//                default:
//                        System.out.println(" invalid option!!!!!!! please try again  ");
//                        break;
//            }
//
//            System.out.println(" do you want to Stop ? please enter the size of your array (note array size = "+myelementsize+" ) " +
//                    "\n do you wanna coninue press -1 ");
//            System.out.print(" your choice is : ");
//            choice = input.nextInt();
//            if (myelementsize == choice){
//                System.out.println(" existing the program thank you for using our program :) ");
//                break;
//            } else if (myelementsize == -1) {
//                continue;
//            }else {
//                System.out.println(" invalid option!!!!!!! program will end ");
//                break;
//            }
//
//        }


        /// Ex6 :

//        Random random = new Random();
//        System.out.print("Enter the minimum value of the range: ");
//        int min = input.nextInt();
//        System.out.print("Enter the maximum value of the range: ");
//        int max = input.nextInt();
//        System.out.print("Enter the number of random numbers to generate: ");
//        int limit = input.nextInt();
//        System.out.print("numbers within the specified range:  ");
//        for (int i = 0; i < limit; i++) {
//            int randomNumber = seconedmethod(min, max);
//            System.out.print(randomNumber);
//            if (i < limit - 1) {
//                System.out.print(" - ");
//            }
//        }

        /// Ex7 :

//        System.out.print("please enter a password to checked");
//        String userPassword = input.nextLine();
//        String strength = fifthmethod(userPassword);
//        System.out.println("your password is " + strength);


        /// Ex8:

//        int numbers;
//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        numbers = input.nextInt();
//        fibonacci(numbers);
//
//





    }
}