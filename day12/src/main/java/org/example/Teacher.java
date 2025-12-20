package org.example;

public class Teacher extends Person{
    private double salary;

   public Teacher(){

   }
    public Teacher(String firstName,
                   String lastName,
                   String email,
                   String phoneNumber,
                   int age,
                   double salary
    ){
        super(   firstName,
                lastName,
                email,
                phoneNumber,
                age );
        this.salary = salary;
    }

    // setter
    public void setSalary(double salary){
        this.salary = salary;
    }

    // getter
    public double getSalary(){
        return salary;
    }



}
