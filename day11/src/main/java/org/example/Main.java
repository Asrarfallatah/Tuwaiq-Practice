package org.example;

// OOP is like a programming paradise

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//
//        Person myInformation = new Person();
//
//        System.out.println("------------------- My family information ----------------");
//
//        myInformation.setName("As");
//        myInformation.setAge(23);
//        myInformation.setCity("yanbu");
//        myInformation.setCollegeName("Yanbu Industrial College");
//        myInformation.setGpa((int) 3.47);
//        myInformation.setEmail("AsrarFallatah21gmail.com");
//        myInformation.setPhoneNumber("0545754");
//        myInformation.setMajor("Computer engineering");
//
//        System.out.println("-----------------------------------");
//        System.out.println("my name is : "+myInformation.getName()+
//                "\ni am  : "+myInformation.getAge()+" years old"+
//                "\ni live in : "+myInformation.getCity()+
//                "\ni studied "+ myInformation.getMajor() +" in : "+myInformation.getCollegeName()+
//                "\ngraduated with "+myInformation.getMajor()+" GPA"+ myInformation.getGpa()+
//                "\nmy email : "+myInformation.getEmail()+
//                "\nmy phone number : "+myInformation.getPhoneNumber()
//        );
//
//        Person mySisterInformation = new Person();
//        mySisterInformation.setName("Anwaaar Ibrahim Fallatah");
//        mySisterInformation.setAge(23);
//        mySisterInformation.setCity("yanbu");
//        mySisterInformation.setCollegeName("Taibah Univercity ");
//        mySisterInformation.setGpa((int) 4.66);
//        mySisterInformation.setEmail("AnwaaarFallatah21@gmail.com");
//        mySisterInformation.setPhoneNumber("0545774754");
//        mySisterInformation.setMajor("Respiratory Therapist");
//
//        System.out.println("-----------------------------------");
//        System.out.println("my name is : "+mySisterInformation.getName()+
//                "\ni am  : "+mySisterInformation.getAge()+" years old"+
//                "\ni live in : "+mySisterInformation.getCity()+
//                "\ni studied "+ mySisterInformation.getMajor() +" in : "+mySisterInformation.getCollegeName()+
//                "\ngraduated with "+mySisterInformation.getMajor()+" GPA"+ mySisterInformation.getGpa()+
//                "\nmy email : "+mySisterInformation.getEmail()+
//                "\nmy phone number : "+mySisterInformation.getPhoneNumber()
//        );
//
//        Person myCousinInformation = new Person();
//        myCousinInformation.setName(" Reham Fahad Fallatah");
//        myCousinInformation.setAge(28);
//        myCousinInformation.setCity("yanbu");
//        myCousinInformation.setCollegeName("Taibah Univercity ");
//        myCousinInformation.setGpa((int) 4.95);
//        myCousinInformation.setEmail("RehamFallatah21@gmail.com");
//        myCousinInformation.setPhoneNumber("0545774754");
//        myCousinInformation.setMajor("Biology");
//        System.out.println("-----------------------------------");
//        System.out.println("my name is : "+myCousinInformation.getName()+
//                "\ni am  : "+myCousinInformation.getAge()+" years old"+
//                "\ni live in : "+myCousinInformation.getCity()+
//                "\ni studied "+ myCousinInformation.getMajor() +" in : "+myCousinInformation.getCollegeName()+
//                "\ngraduated with "+myCousinInformation.getMajor()+" GPA"+ myCousinInformation.getGpa()+
//                "\nmy email : "+myCousinInformation.getEmail()+
//                "\nmy phone number : "+myCousinInformation.getPhoneNumber()
//        );
//
//        Person myBrotherInformation= new Person("Ahmed Ibrahim Fallatah", "Yanbu", "Yanbu Industrial College","AhmedFallatah@gmail.com","electrical engineering","054337659",27,2.0);
//
//        System.out.println("-----------------------------------");
//        System.out.println("my name is : "+myBrotherInformation.getName()+
//                "\ni am  : "+myBrotherInformation.getAge()+" years old"+
//                "\ni live in : "+myBrotherInformation.getCity()+
//                "\ni studied "+ myBrotherInformation.getMajor() +" in : "+myBrotherInformation.getCollegeName()+
//                "\ngraduated with "+myBrotherInformation.getMajor()+" GPA"+ myBrotherInformation.getGpa()+
//                "\nmy email : "+myBrotherInformation.getEmail()+
//                "\nmy phone number : "+myBrotherInformation.getPhoneNumber()
//        );
//
//        Person myMotherInformation= new Person("Mariam Mohammad Fallatah", "Yanbu", "Umalquraa","MariamFallatah@gmail.com","islamic studies","0545365914",45,4);
//        System.out.println("-----------------------------------");
//        System.out.println("my name is : "+myMotherInformation.getName()+
//                "\ni am  : "+myMotherInformation.getAge()+" years old"+
//                "\ni live in : "+myMotherInformation.getCity()+
//                "\ni studied "+ myMotherInformation.getMajor() +" in : "+myCousinInformation.getCollegeName()+
//                "\ngraduated with "+myMotherInformation.getMajor()+" GPA"+ myCousinInformation.getGpa()+
//                "\nmy email : "+myMotherInformation.getEmail()+
//                "\nmy phone number : "+myMotherInformation.getPhoneNumber()
//        );
//
//        Person myFatherInformation= new Person("Ibrahim Ahmed Fallatah", "Yanbu", "Umalquraa","IbrahimFallatah@gmail.com","electrical engineering ","0505349510",57,100);
//        System.out.println("-----------------------------------");
//        System.out.println("my name is : "+myFatherInformation.getName()+
//                "\ni am  : "+myFatherInformation.getAge()+" years old"+
//                "\ni live in : "+myFatherInformation.getCity()+
//                "\ni studied "+ myFatherInformation.getMajor() +" in : "+myFatherInformation.getCollegeName()+
//                "\ngraduated with "+myFatherInformation.getMajor()+" GPA"+ myFatherInformation.getGpa()+
//                "\nmy email : "+myFatherInformation.getEmail()+
//                "\nmy phone number : "+myFatherInformation.getPhoneNumber()
//        );

        /// ex 1 :
        System.out.println("\nwelcome to SFA Bank transactions and deposit money section  : ");
        Account myFreindAccount = new Account("4211452","Ashwaq",4500);
        System.out.println(myFreindAccount);

        Account myAccount = new Account("4211398","Asrar");
        System.out.println(myAccount);

        System.out.println("");
        myFreindAccount.accountCredit(200);
        myFreindAccount.accountDebit(500);
        System.out.println("");
        myFreindAccount.transferTo(myAccount, 1500);

        System.out.println("\n------------------------After transactions:------------------------");
        System.out.println(myFreindAccount);
        System.out.println(myAccount);

        /// ex 2 :
        Employee myEmployee1 = new Employee("4211398","Asrar Fallatah",3500);
        System.out.println( "\n------------------------welcome to employee monthly performance evaluation : ------------------------ \n "+myEmployee1.toString()+
                            "\nemployee current salary is : "+myEmployee1.getEmployeeSalary()+"$"+
                            "\nemployee new salary after %5 increase is : "+myEmployee1.raisedSalary(5)+"$"+
                            "\nemployee Annual salary is going to be : "+ myEmployee1.getAnnualSalary()+"$"
                            );


}
}