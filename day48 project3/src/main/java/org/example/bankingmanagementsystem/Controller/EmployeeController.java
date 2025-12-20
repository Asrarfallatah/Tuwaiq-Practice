package org.example.bankingmanagementsystem.Controller;


import lombok.RequiredArgsConstructor;
import org.example.bankingmanagementsystem.Api.ApiResponse;
import org.example.bankingmanagementsystem.Model.Employee;
import org.example.bankingmanagementsystem.Service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/get")
    public ResponseEntity<?> getAllEmployees() {
        return ResponseEntity.status(200).body(employeeService.getAllEmployees());
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return ResponseEntity.status(200).body(new ApiResponse("Employee added successfully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {

        employeeService.updateEmployee(id, employee);
        return ResponseEntity.status(200).body(new ApiResponse("Employee updated successfully"));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.status(200).body(new ApiResponse("Employee deleted successfully"));
    }
}
