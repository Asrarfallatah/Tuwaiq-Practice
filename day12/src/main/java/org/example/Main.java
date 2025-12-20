package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Person  p1 = new Person("Ibrahim","Fallatah","IbrahimFallatah21@gmail.com","0545774754",61);
//        Person  p2 = new Person("Mairyam","Fallatah","MairyamFallatah21@gmail.com","0545774754",55);
//        Person  p3 = new Person("nana","Fallatah","NanaFallatah21@gmail.com","0545774754",81);
//
//        Student s1 = new Student("Anwaar","Fallatah","AnwaarFallatah21@gmail.com","0545774754",23,"JAVA",4);
//        Student s2 = new Student("Asrar","Fallatah","AsrarFallatah21@gmail.com","0545774754",23,"python",3.47);
//        Student s3 = new Student("Alaa","Fallatah","AlaaFallatah21@gmail.com","0545774754",28,"HTML",3.20);
//
//        Teacher t1 = new Teacher("Reham","Fallatah","RehamFallatah21@gmail.com","0545774754",27,20500);
//        Teacher t2 = new Teacher("Refal","Fallatah","RefalFallatah21@gmail.com","0545774754",21,11500);
//        Teacher t3 = new Teacher("Noraan","Fallatah","NoraanFallatah21@gmail.com","0545774754",16,4500);
//
//        FullTime full1 = new FullTime("Ashwaaq","Aljohni","Ashwaaq@gmail.com","0545774754",24,1500,300);
//        PartTime part1 = new PartTime("Deem","Aljohni","Deem@gmail.com","0545774754",25,1500,9);
//
//        System.out.println("welcom to TX academy : ");
//        System.out.println("our head department CEO : "+p3.getFirstName() + " "+p3.getLastName()+
//                        "        Age : "+p3.getAge()+
//                        "        email : "+p3.getEmail()+
//                        "           Phone number : "+p3.getPhoneNumber()+
//                        "\nour managers are : Mr. "+ p1.getFirstName() +" "+p1.getLastName()+
//                        "        Age : "+p1.getAge()+
//                        "        email : "+p1.getEmail()+
//                        "        Phone number : "+p1.getPhoneNumber()+
//                        "\n                   Ms. "+ p2.getFirstName() +" "+p2.getLastName()+
//                        "        Age : "+p2.getAge()+
//                        "        email : "+p2.getEmail()+
//                        "        Phone number : "+p2.getPhoneNumber()
//                            );
//
//        System.out.println("our Teacher Staff  :"+
//                "\n                   Ms. "+ t1.getFirstName() +" "+t1.getLastName()+
//                "          Age : "+t1.getAge()+
//                "        email : "+t1.getEmail()+
//                "          Phone number : "+t1.getPhoneNumber()+
//                "\n                   Ms. "+ t2.getFirstName() +" "+t2.getLastName()+
//                "          Age : "+t2.getAge()+
//                "        email : "+t2.getEmail()+
//                "          Phone number : "+t2.getPhoneNumber()+
//                "\n                   Ms. "+ t3.getFirstName() +" "+t3.getLastName()+
//                "         Age : "+t3.getAge()+
//                "        email : "+t3.getEmail()+
//                "         Phone number : "+t3.getPhoneNumber()
//        );
//
//        System.out.println("our Students info  :"+
//                "\n                   Ms. "+ s1.getFirstName() +" "+s1.getLastName()+
//                "         Age : "+s1.getAge()+
//                "        email : "+s1.getEmail()+
//                "         Phone number : "+s1.getPhoneNumber()+
//                "         GPA : "+s1.getGPA()+
//                "         bootCamp Name : "+s1.getBootCampName()+
//                "\n                   Ms. "+ s2.getFirstName() +" "+s2.getLastName()+
//                "          Age : "+s2.getAge()+
//                "        email : "+s2.getEmail()+
//                "          Phone number : "+s2.getPhoneNumber()+
//                "         GPA : "+s2.getGPA()+
//                "        bootCamp Name : "+s2.getBootCampName()+
//                "\n                   Ms. "+ s3.getFirstName() +" "+s3.getLastName()+
//                "           Age : "+s3.getAge()+
//                "        email : "+s3.getEmail()+
//                "           Phone number : "+s3.getPhoneNumber()+
//                "         GPA : "+s3.getGPA()+
//                "         bootCamp Name : "+s3.getBootCampName()
//        );
//
//        System.out.println("\n-----------------------------------------\n");
//        System.out.println("our full time teacher  Staff  :"+
//                "\n                   Ms. "+ full1.getFirstName() +" "+full1.getLastName()+
//                "          Age : "+full1.getAge()+
//                "        email : "+full1.getEmail()+
//                "          Phone number : "+full1.getPhoneNumber()+
//                "          Salary is : "+full1.getSalary()+
//                "\nour part time teacher  Staff  :"+
//                "\n                   Ms. "+ part1.getFirstName() +" "+part1.getLastName()+
//                "             Age : "+part1.getAge()+
//                "        email : "+part1.getEmail()+
//                "             Phone number : "+part1.getPhoneNumber()+
//                "          Salary is : "+part1.getSalary()
//        );
//

        Square square1 = new Square(11,"Pink",true);
        Square square2 = new Square(22);
        Square square3 = new Square();

        System.out.println("------------------ class Square object : square1  in Main ------------------");
        System.out.println(square1.toString());
        System.out.println("------------------ class Square object : square2  in Main ------------------");
        System.out.println(square2.toString());
        System.out.println("------------------ class Square object : square3  in Main ------------------");
        System.out.println(square3.toString());

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(33,10,"Black",false);
        Rectangle rectangle3 = new Rectangle(44,20);

        System.out.println("------------------ class Rectangle  : rectangle1  in Main ------------------");
        System.out.println(rectangle1.toString());
        System.out.println("------------------ class Rectangle  : rectangle2  in Main ------------------");
        System.out.println(rectangle2.toString());
        System.out.println("------------------ class Rectangle  : rectangle3  in Main ------------------");
        System.out.println(rectangle3.toString());

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(23);
        Circle circle3 = new Circle(55,"Blue",true);

        System.out.println("------------------ class Circle  : circle1 in Main ------------------");
        System.out.println(circle1.toString());
        System.out.println("------------------ class Circle  : circle2 in Main  ------------------");
        System.out.println(circle2.toString());
        System.out.println("------------------ class Circle  : circle3  in Main ------------------");
        System.out.println(circle3.toString());

        Shape shape1 = new Shape();
        Shape shape2 = new Shape("purple",true);

        System.out.println("------------------ class Square Shape : shape1  in Main ------------------");
        System.out.println(shape1.toString());
        System.out.println("------------------ class Square Shape : shape2  in Main ------------------");
        System.out.println(shape2.toString());



    }
}