package org.example.coffeejpa.Repository;


import org.example.coffeejpa.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findEmployeeByEmployeeID(Integer employeeID);

    // 1- find employees with a specific salary range
    @Query("SELECT e FROM Employee e WHERE e.getEmployeeSalary BETWEEN ?1 AND ?2")
    List<Employee> findByRange(Integer min, Integer max);


}
