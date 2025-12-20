package org.example.bankingmanagementsystem.Repository;

import org.example.bankingmanagementsystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {

    Employee findEmployeeById (Integer id);
}
