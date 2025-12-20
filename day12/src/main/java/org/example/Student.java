package org.example;

public class Student extends Person{

    private double GPA;
    private String bootCampName;

    public Student(){

    }
    public Student(
            String firstName,
            String lastName,
            String email,
            String phoneNumber,
            int age,
            String bootCampName,
            double GPA
    ){
        super(   firstName,
                 lastName,
                 email,
                 phoneNumber,
                 age );
        this.bootCampName = bootCampName;
        this.GPA = GPA;
    }

    //setter
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public void setBootCampName(String bootCampName){
        this.bootCampName = bootCampName;
    }

    // getter
    public double getGPA(){
        return GPA;
    }
    public String getBootCampName(){
        return bootCampName;
    }

}
