package org.example;

public class FullTime extends Teacher{

    public double bounce ;

    public FullTime (){};

    public FullTime (
                     double salary,
                     double bounce
    ){
        this.bounce = bounce;
        setSalary(salary);
    }

    // methods:

    @Override
    public  void setSalary(double salary){
        updateSalary(salary + bounce);
    }

    public double getSalary(){
        return super.getSalary();
    }
}
