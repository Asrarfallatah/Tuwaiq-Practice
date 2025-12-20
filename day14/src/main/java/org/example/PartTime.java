package org.example;

public class PartTime extends Teacher{

    private int Hour ;
    public PartTime (
                      int Hour,
                      double salary
    ){
       this.Hour = Hour;
       setSalary(salary);
    }

    // methods:
    public void setBaseSalary(double salary) {
        this.setSalary(salary);
    }

    public void setHour(int hour) {
       this.Hour = hour;
    }
    public int getHour() {
        return Hour;
    }

    @Override
    public void setSalary(double salary){
        updateSalary(50 * Hour);
    }
    public double getSalary(){
        return super.getSalary();
    }


}
