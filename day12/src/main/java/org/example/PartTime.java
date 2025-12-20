package org.example;

public class PartTime extends Teacher{

    private int Hour ;
    public PartTime (String firstName,
                     String lastName,
                     String email,
                     String phoneNumber,
                     int age,
                     double salary,
                     int Hour
    ){
       super (   firstName,
                 lastName,
                 email,
                 phoneNumber,
                 age,
                 salary);
       this.Hour = Hour;
       setSalary(salary);
    }

    public void setHour(int hour) {
       this.Hour = hour;
    }
    public void setSalary(double salary){
        super.setSalary( 50 * Hour) ;
    }
    public double getSalary(){
        return super.getSalary();
    }

    public int getHour() {
        return Hour;
    }
}
