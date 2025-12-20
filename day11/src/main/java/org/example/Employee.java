package org.example;

public class Employee {
    private String employeeID ;
    private String employeeName ;
    private int employeeSalary ;


    public Employee(String employeeID,String employeeName,int employeeSalary ){
        this.employeeID =employeeID;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }


    //setter :
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    //getter :
    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    //methods :
    public int getAnnualSalary() {
        return 12 * employeeSalary;
    }

    public int raisedSalary(int percent){
        if (percent > 0) {
            double raiseAmount = this.employeeSalary * (percent / 100.0);
            this.employeeSalary += (int) raiseAmount;
        }
        return this.employeeSalary;
    }

    public String toString(){
        return
                    "\nemployee name = " + employeeName +
                    "\nemployee id = " + employeeID +
                    "\nemployee salary =" + employeeSalary ;
    }

}
