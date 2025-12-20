package org.example.bankingmanagementsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.bankingmanagementsystem.Api.ApiException;
import org.example.bankingmanagementsystem.Model.Employee;
import org.example.bankingmanagementsystem.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        if (employeeRepository.findAll().isEmpty()) {
            throw new ApiException("No employees found yet");
        }
        return employeeRepository.findAll();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Integer id, Employee employee) {
        Employee oldEmployee = employeeRepository.findEmployeeById(id);
        if (oldEmployee == null) {
            throw new ApiException("Employee not found");
        }

        oldEmployee.setPosition(employee.getPosition());
        oldEmployee.setSalary(employee.getSalary());
        employeeRepository.save(oldEmployee);
    }

    public void deleteEmployee(Integer id) {
        Employee employee = employeeRepository.findEmployeeById(id);
        if (employee == null) {
            throw new ApiException("Employee not found");
        }
        employeeRepository.delete(employee);
    }
}
