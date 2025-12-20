package org.example;

public abstract class Teacher extends Person{

    private double salary;
    private String nationalID;

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public final void checkID(String nationalID){
        if(nationalID.length() != 10 ){
            System.out.println("invalid national id");
        }else {
            System.out.println("valid national id :) ");

        }
    }

//   public Teacher(){
//
//   }
//    public Teacher(String firstName,
//                   String lastName,
//                   String email,
//                   String phoneNumber,
//                   int age,
//                   double salary
//    ){
//        super(   firstName,
//                lastName,
//                email,
//                phoneNumber,
//                age );
//        this.salary = salary;
//    }

    // setter
    public abstract void setSalary(double salary) ;

    // getter
    public double getSalary(){
        return salary;
    }

    public void updateSalary(double salary) {
        this.salary = salary;
    }


}
