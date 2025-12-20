package org.example.coffeejpa.Service;

import lombok.RequiredArgsConstructor;
import org.example.coffeejpa.Model.Employee;
import org.example.coffeejpa.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {


    private final EmployeeRepository  employeeRepository;

    // get
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // add
    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    // update

    public boolean updateEmployee (Integer employeeId, Employee employee){

        // check if it is there in the database
        Employee oldemployee = employeeRepository.findEmployeeByEmployeeID(employeeId);
        if (oldemployee == null){
            return false;
        }

        //update the old one each variable
        oldemployee.setEmployeeName(employee.getEmployeeName());
        oldemployee.setGetEmployeeSalary(employee.getGetEmployeeSalary());

        // save it
        employeeRepository.save(oldemployee);

        return true;
    }


    // delete
    public boolean deleteEmployee(Integer employeeId){

        // check if it is there in the database
        Employee employee = employeeRepository.findEmployeeByEmployeeID(employeeId);

        //update the old one each variable
        if (employee == null){
            return false;
        }
        // delete it
        employeeRepository.delete(employee);
        return true;
    }


    // extra endpoint

    public List<Employee> getEmployeeBySalaryRange(Integer min , Integer max ){
        List<Employee> employees = employeeRepository.findByRange(min , max);

        if (employees == null){
            return null;
        }
        // delete it

        return employees;
    }


    public Employee getEmployeeByEmployeeID(Integer employeeID ){

        return employeeRepository.findEmployeeByEmployeeID(employeeID);
    }



}
