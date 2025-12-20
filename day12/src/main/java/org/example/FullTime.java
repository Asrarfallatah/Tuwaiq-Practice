package org.example;

public class FullTime extends Teacher{
    public double bounce ;

    public FullTime (String firstName,
                     String lastName,
                     String email,
                     String phoneNumber,
                     int age,
                     double salary,
                     double bounce
    ){
        super (   firstName,
                lastName,
                email,
                phoneNumber,
                age,
                salary);
        this.bounce = bounce;
        setSalary(salary);
    }

    public void setSalary(double salary){
        super.setSalary(salary + bounce);
    }
    public double getSalary(){
        return super.getSalary();
    }
}
