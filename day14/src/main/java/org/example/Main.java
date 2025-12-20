package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Person  p1 = new Person("Ibrahim","Fallatah","IbrahimFallatah21@gmail.com",61);
//        Person  p2 = new Person("Mairyam","Fallatah","MairyamFallatah21@gmail.com",55);
//        Person  p3 = new Person("nana","Fallatah","NanaFallatah21@gmail.com",81);
//
////        Student s1 = new Student("Anwaar","Fallatah","AnwaarFallatah21@gmail.com","0545774754",23,"JAVA",4);
////        Student s2 = new Student("Asrar","Fallatah","AsrarFallatah21@gmail.com","0545774754",23,"python",3.47);
////        Student s3 = new Student("Alaa","Fallatah","AlaaFallatah21@gmail.com","0545774754",28,"HTML",3.20);
//
//
//        FullTime full1 = new FullTime(1500,300);
//        PartTime part1 = new PartTime(25,1500);
//
//        System.out.println("\n-----------------------------------------\n");
//        System.out.println("our full time teacher  Staff  after $300 bounce "+
//                " Salary is : "+full1.getSalary()+
//                "\nour part time teacher  Staff that who works for 25 hours "+
//                " Salary is : "+part1.getSalary()
//        );
//
//        System.out.println("\n-----------------------------------------\n");
//
//        full1.checkID("1234567891");

//        Square square1 = new Square(11,"Pink",true);
//        Square square2 = new Square(22);
//        Square square3 = new Square();
//
//        System.out.println("------------------ class Square object : square1  in Main ------------------");
//        System.out.println(square1.toString());
//        System.out.println("------------------ class Square object : square2  in Main ------------------");
//        System.out.println(square2.toString());
//        System.out.println("------------------ class Square object : square3  in Main ------------------");
//        System.out.println(square3.toString());
//
//        Rectangle rectangle1 = new Rectangle();
//        Rectangle rectangle2 = new Rectangle(33,10,"Black",false);
//        Rectangle rectangle3 = new Rectangle(44,20);
//
//        System.out.println("------------------ class Rectangle  : rectangle1  in Main ------------------");
//        System.out.println(rectangle1.toString());
//        System.out.println("------------------ class Rectangle  : rectangle2  in Main ------------------");
//        System.out.println(rectangle2.toString());
//        System.out.println("------------------ class Rectangle  : rectangle3  in Main ------------------");
//        System.out.println(rectangle3.toString());
//
//        Circle circle1 = new Circle();
//        Circle circle2 = new Circle(23);
//        Circle circle3 = new Circle(55,"Blue",true);
//
//        System.out.println("------------------ class Circle  : circle1 in Main ------------------");
//        System.out.println(circle1.toString());
//        System.out.println("------------------ class Circle  : circle2 in Main  ------------------");
//        System.out.println(circle2.toString());
//        System.out.println("------------------ class Circle  : circle3  in Main ------------------");
//        System.out.println(circle3.toString());
//
//        Shape shape1 = new Shape();
//        Shape shape2 = new Shape("purple",true);
//
//        System.out.println("------------------ class Square Shape : shape1  in Main ------------------");
//        System.out.println(shape1.toString());
//        System.out.println("------------------ class Square Shape : shape2  in Main ------------------");
//        System.out.println(shape2.toString());

        Scanner input = new Scanner(System.in);

//        Hero h = new Hero("witch ", 50);
//        Dragon d = new Dragon("dragon", 80);
//
//        System.out.println(" Welcome to Beat The Dragon Game");
//
//        while (h.isAlive() && d.isAlive()) {
//            System.out.println("\n" + h.getName() + ": " + h.getHealth() + " HP");
//            System.out.println(d.getName() + ": " + d.getHealth() + " HP");
//            System.out.println("----------------------------");
//            System.out.println("Choose Your Action:");
//            System.out.println("1. Attack \n" +
//                    "⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠉⢹⣿⡟⠻⠿⢶⣶⣤⣤⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⢀⣿⡟⠀⠀⠀⢀⣤⣤⣈⠉⠙⠛⠛⠻⠿⠶⣶⣤⣤⣤⣀⣀\n" +
//                    "⣾⣿⡃⠀⠀⢠⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠛\n" +
//                    "⠙⢿⣿⣦⡀⠀⠻⣿⣿⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠙⢿⣿⣶⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣷⣦⣄⣀⣀⣀⣀⣀⣤⡀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⣿⣿⣿⣿⣿⡟⠻⠿⠿⠿⠿⠿⠿⠛⠛⠁⠀⠀⠀\n" +
//                    "⠀⠀⠀⢠⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⢠⣾⣿⣿⣿⠿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⢠⣿⣿⣿⠟⠁⠀⠈⠻⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⢸⣿⡏⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⢸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣷⡄⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⢸⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣦⠀⠀⠀⠀⠀\n" +
//                    "⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀");
//            System.out.println("2. Heal " +
//                    " \n ﮩ٨ـﮩﮩ٨ـ♡ﮩ٨ـﮩﮩ٨ـ ");
//            System.out.println("3. Run Away" +
//                              "\n ('ω' ⊃ )⊃三二一  ");
//            System.out.println("----------------------------");
//
//            int choice = input.nextInt();
//
//            if (choice == 1) {
//                h.attack(d);
//                if (d.isAlive()) d.attack(h);
//            } else if (choice == 2) {
//                h.health();
//                d.health();
//            } else if (choice == 3) {
//                System.out.println("─⋅⋆⁺\uD81A\uDD10 You ran away Game Over.─⋅⋆⁺\uD81A\uDD10");
//                break;
//            } else {
//                System.out.println("\uD835\uDC13\uD835\uDC11\uD835\uDC18 \uD835\uDC00\uD835\uDC06\uD835\uDC00\uD835\uDC08\uD835\uDC0D ﹕↻");
//            }
//        }
//
//        System.out.println("----------------------------");
//        if (!h.isAlive()) {
//            System.out.println(d.getName() + " \n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠟⠋⠻⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠞⠛⠛⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠃⠀⠀⠀⣿⣤⣤⣤⣤⣤⣤⣤⠾⠋⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⢠⡞⠛⠛⠁⠀⠀⠀⠀⠀⠀⣼⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⠟⠻⣦⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⢠⡍⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣄⡀⣴⠏⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⢘⠃⠀⠀⠀⠀⠀⢀⡟⠁⣠⣤⣤⠙⣄⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⣠⡴⠖⠛⠶⣦⡀⠀⠀⠀⠀⠀⢹⡆⠀⠀⠀⠀⠀⢿⡄⠸⣿⣿⡟⠀⣿⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⢰⡏⢠⣾⣿⣶⠀⢻⡄⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠈⠻⢶⣤⣤⣤⠾⠃⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠘⣧⡈⠛⠛⠛⣀⡾⠁⠀⠀⣤⠀⠀⠀⣠⡆⠀⠀⠀⠀⣠⡾⠃⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠙⠛⠛⣿⠻⣤⣀⡀⠀⠘⠃⠀⠀⠋⠀⠀⣀⣤⠾⠋⢀⡼⠃⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠘⠷⣤⠈⠙⠛⠛⠶⠶⠶⠞⠛⠛⠉⠀⣠⠴⡋⠀⠀⠀⠀⢸⡏⠳⣦⣀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⣶⠦⣤⣤⣤⣤⣤⠴⠶⠛⠉⢸⡇⠀⠀⠀⠀⢸⡇⠀⠀⠙⠃⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⠀⠀⠀⠀⠀⣸⠀⠀⠀⣼⠃\n" +
//                    "⠀⠀⠀⣠⡾⠻⣄⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⣸⠇⠀⠀⣼⠏⠀\n" +
//                    "⠀⢀⡾⠋⠀⠀⠙⢷⣄⡀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⢀⣼⠏⠀⢀⣼⡟⠀⠀\n" +
//                    "⠀⠈⠻⣦⡀⠀⠀⠀⠉⠉⠛⠛⠻⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢀⣠⠾⠁⠀⣠⣾⠁⠀⠀⠀\n" +
//                    "⠀⠀⠀⠈⠛⢶⣄⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠁⣀⣤⠾⣫⣿⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠉⠛⠛⠛⠛⠛⠋⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⠶⠟⠋⠁⢰⡇⣿⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⢠⡏⢸⡇⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⢸⡇⢸⡇⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣇⠀⠀⠀⠀⢸⡇⢸⡇⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠀⠀⠀⠀⣼⠀⢸⠃⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⣿⠀⢸⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠀⠀⠀⠀⣿⠀⣿⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢰⡇⠀⣿⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢸⡇⠀⣿⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢸⠇⠀⣿⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⣾⠀⠀⣿⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢠⡟⠀⠀⡿⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢀⡿⠁⠀⠀⡇⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣾⠁⠀⠀⢸⡇⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢀⡾⠃⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⣠⡟⠁⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡇⣰⠏⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠋⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⢀⣠⡴⠶⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⣠⡴⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠶⢦⣄⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⢀⣼⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣷⡀⠀⠀\n" +
//                    "⠀⠀⣠⡟⠁⠀⠀⠀⠀⠀⠀⢀⣠⡴⠞⠛⠋⠉⠉⠛⠛⠶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀\n" +
//                    "⠀⣼⠏⠀⠀⠀⠀⠀⠀⣠⡶⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠃⠀⠀\n" +
//                    "⢼⣇⡀⠀⠀⠀⠀⣠⠞⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠧⣤⣤⣤⣤⠤⠶⠶⠞⠁⠀⠀⠀\n" +
//                    "⠀⠉⠙⠛⠷⠶⠾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" +
//                    "\n wins!");
//        } else if (!d.isAlive()) {
//            System.out.println(h.getName() + " ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠂⢉⣉⠉⠒⠢⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣦⣄⠀⠀⠀⠠⠋⢁⣈⣽⣷⣶⣬⣓⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⣤⠶⠄⠀⠀⠀⠀⢟⣁⠀⠀⠉⢻⣷⣦⣄⡀⠀⠈⠀⠈⠀⠈⠙⠿⡿⣿⣷⣦⣤⠤⣤⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀\n" +
//                    "⠸⣇⣀⣠⣴⣶⣶⣶⣦⣤⣄⣀⣤⣾⣿⣿⣿⣿⣷⣦⣤⣀⡀⠉⣉⣒⣚⡳⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡉⠉⠹⠃⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣆⠀⠀\n" +
//                    "⠀⠈⠉⠛⠻⠿⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣭⣵⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠟⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠿⠛⠉⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠁⠀⠀⠀⠀⠀⠀⠀⠴⠖⠲⡄⠀⠀⢸⣿⣿⡄⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⢀⡾⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⣸⣿⣿⣿⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠁⠀⣼⠋⢉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⢀⣼⣿⣿⣿⣿⣿⠟⠻⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⢠⡇⠀⢠⣿⣿⣿⣿⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠉⢉⣠⣴⣿⣿⣿⠟⠉⠹⣿⣆⠀⠈⠻⣿⣦⣀⠀⠀⠀⠀⠀⠘⣇⠀⣿⣿⣿⣿⣿⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠶⠿⠿⣿⣿⠋⠉⠉⢹⣿⣿⡿⠻⣿⣧⣴⣾⣿⣿⣿⣿⣿⣷⡀⠀⠀⠈⠻⢷⣄⡀⠀⠙⠿⣷⣤⡀⠀⠀⠀⠈⠓⢿⣿⣿⣿⣽⡶⠄\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠸⣿⠟⠁⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⡀⠀⠀⠙⠻⣦⣄⡀⠀⢉⣻⣷⣶⡦⠶⠒⠛⠉⠉⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⠴⠶⠟⠻⠿⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠷⠶⠶⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⢛⣉⣩⣥⣴⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠈⠉⠉⠉⣁⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⡞⠉⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠓⠂⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⠿⠛⢩⣿⣿⣿⣿⣿⣿⣿⠟⠉⢛⣥⣴⡟⠉⢿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⡿⠟⠀⠀⢹⣿⡟⠀⠀⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⠀⠀⠀⠹⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
//                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" +
//                    "\n wins!");
//        }


        // Ex1 :

       Book book1 = new Book();
       book1.setName("Me Before You");
       book1.setAuther("Jojo Moyes");
       book1.setPrice(10.22);

       Book book2 = new Book();
       book2.setName("Twilight");
       book2.setAuther("Stephenie Meyer");
       book2.setPrice(22.22);

       Book book3 = new Book("The Ocean at the End of the Lane", 32.22,"Neil Gaiman");
       Book book4 = new Book("The Waves", 42.22,"Virginia Woolf");

        Movie movie1 = new Movie();
        movie1.setName("13 Going on 30");
        movie1.setDirector("Gary Winick");
        movie1.setPrice(20.22);

        Movie movie2 = new Movie();
        movie2.setName("The Proposal");
        movie2.setDirector("Anne Fletcher");
        movie2.setPrice(24.22);

        Movie movie3 = new Movie("How to Lose a Guy in 10 Days", 30.22,"Donald Petrie");
        Movie movie4  = new Movie("Mean Girls", 34.22,"Rosalind Wiseman");

        System.out.println("------------------------------------------------------");
        System.out.println("|                Welcome to Xte Store                 |");
        System.out.println("------------------------------------------------------");
        System.out.println("| Our Books    :                                      |");
        System.out.println("|   1-"+ book1.getName()+"                                   |");
        System.out.println("|         -by "+book1.getAuther()+"                              |"+
                         "\n|         -on sale for : "+book1.getDiscount()+"                         |"+
                         "\n|         -it was before : "+book1.getPrice()+"                      |"        );
        System.out.println("|   2-"+ book2.getName()+"                                        |");
        System.out.println("|         -by "+book2.getAuther()+"                         |"+
                         "\n|         -on sale for : "+book2.getDiscount()+"                         |"+
                         "\n|         -it was before : "+book2.getPrice()+"                      |"        );
        System.out.println("|   3-"+ book3.getName()+"                |");
        System.out.println("|         -by "+book3.getAuther()+"                             |"+
                         "\n|         -on sale for : "+book3.getDiscount()+"                        |"+
                         "\n|         -it was before : "+book3.getPrice()+"                      |"        );
        System.out.println("|   4-"+ book4.getName()+"                                       |");
        System.out.println("|         -by "+book4.getAuther()+"                          |"+
                         "\n|         -on sale for : "+book4.getDiscount()+"                        |"+
                         "\n|         -it was before : "+book4.getPrice()+"                      |"        );
        System.out.println("| Our Movies    :                                     |");
        System.out.println("|   1-"+ movie1.getName()+"                                  |");
        System.out.println("|         -by "+movie1.getDirector()+"                             |"+
                         "\n|         -on sale for : "+movie1.getDiscount()+"                        |"+
                         "\n|         -it was before : "+movie1.getPrice()+"                      |"        );
        System.out.println("|   2-"+ movie2.getName()+"                                    |"+
                         "\n|         -by "+movie2.getDirector()+"                           |"+
                         "\n|         -on sale for : "+movie2.getDiscount()+"                        |"+
                         "\n|         -it was before : "+movie2.getPrice()+"                      |"        );
        System.out.println("|   3-"+ movie3.getName()+"                    |"+
                         "\n|         -by "+movie1.getDirector()+"                             |"+
                         "\n|         -on sale for : "+movie3.getDiscount()+"                        |"+
                         "\n|         -it was before : "+movie3.getPrice()+"                      |"        );
        System.out.println("|   4-"+ movie4.getName()+"                                      |"+
                         "\n|         -on sale for : "+movie3.getDiscount()+"                        |"+
                         "\n|         -it was before : "+movie3.getPrice()+"                      |"        );
        System.out.println("------------------------------------------------------");


        System.out.println("\n \n ");



        ///  ex2


        System.out.println("------------------------------------------------------");
        System.out.println("         Car1 Statistic before race and after :                          ");
        System.out.println("------------------------------------------------------");
        MoveablePoint car1 = new MoveablePoint();

        System.out.println("1-posing :\n   position: (" + car1.getX() + ", " + car1.getY() + ") meter     speed :(" + car1.getxSpeed() + "to"  + car1.getySpeed() + ") Meter per second ");
        car1.setX(3);
        car1.setxSpeed(9);
        car1.setY(77);
        car1.setySpeed(88);

        car1.moveUp();
        System.out.println("2-moving up :\n   position: (" + car1.getX() + ", " + car1.getY() + ") meter   speed :(" + car1.getxSpeed() + "to"  + car1.getySpeed() + ") Meter per second ");

        car1.moveDown();
        System.out.println("3-moving down :\n   position: (" + car1.getX() + ", " + car1.getY() + ") meter    speed :(" + car1.getxSpeed() + "to" + car1.getySpeed() + ") Meter per second ");

        car1.moveLeft();
        System.out.println("4-moving left :\n   position: (" + car1.getX() + ", " + car1.getY() + ") meter   speed :(" + car1.getxSpeed() + "to"  + car1.getySpeed() + ") Meter per second ");

        car1.moveRight();
        System.out.println("5-moving right :\n   position: (" + car1.getX() + ", " + car1.getY() + ") meter    speed :(" + car1.getxSpeed() + "to" + car1.getySpeed() + ") Meter per second ");

        System.out.println("------------------------------------------------------");
        System.out.println("         Car2 Statistic before race and after :                          ");
        System.out.println("------------------------------------------------------");

        MoveablePoint car2 = new MoveablePoint(2, 22, 44, 4);
        System.out.println("1-posing :\n   position: (" + car1.getX() + ", " + car1.getY() + ") meter     speed :(" + car1.getxSpeed() + "to" + car1.getySpeed() + ") Meter per second ");

        System.out.println("2-moving up :\n   position: (" + car2.getX() + ", " + car2.getY() + ") meter     speed :(" + car2.getxSpeed() + "to"  + car2.getySpeed() + ") Meter per second ");

        car2.moveDown();
        System.out.println("3-moving down :\n   position: (" + car2.getX() + ", " + car2.getY() + ") meter     speed :(" + car2.getxSpeed() + "to"  + car2.getySpeed() + ") Meter per second ");

        car2.moveLeft();
        System.out.println("4-moving left :\n   position: (" + car2.getX() + ", " + car2.getY() + ") meter   speed :(" + car2.getxSpeed() + "to"  + car2.getySpeed() + ") Meter per second ");

        car2.moveRight();
        System.out.println("5-moving right :\n   position: (" + car2.getX() + ", " + car2.getY() + ") meter     speed :(" + car2.getxSpeed() + "to" + car2.getySpeed() + ") Meter per second ");



    }
}