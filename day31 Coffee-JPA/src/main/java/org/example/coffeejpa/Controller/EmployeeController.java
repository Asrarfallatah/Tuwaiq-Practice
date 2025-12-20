package org.example.coffeejpa.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.coffeejpa.Api.ApiResponse;
import org.example.coffeejpa.Model.Employee;
import org.example.coffeejpa.Service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    // get
    @GetMapping("/get")
    public ResponseEntity<?> getEmployee(){

        if (employeeService.getAllEmployees().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("there is no data within the DataBase yet ! "));
        }

        return ResponseEntity.status(200).body(employeeService.getAllEmployees());
    }


    // add
    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@Valid @RequestBody Employee employee, Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        employeeService.addEmployee(employee);
        return ResponseEntity.status(200).body(new ApiResponse("Employee information has been added to the DataBase Successfully ! "));

    }



    // update
    @PutMapping("/update/{employeeId}")
    public ResponseEntity<?> updateEmployee(@PathVariable Integer employeeId , @Valid @RequestBody Employee employee, Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean check =  employeeService.updateEmployee (employeeId,employee);
        if (!check){
            return ResponseEntity.status(400).body(new ApiResponse("no Employee with that id within the data base to update its information  ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("Employee information  has been updated in the DataBase Successfully ! "));
    }


    //delete
    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Integer employeeId){

        boolean check =  employeeService.deleteEmployee (employeeId);
        if (!check) {
            return ResponseEntity.status(400).body(new ApiResponse("no employee with that id within the data base to delete its information  ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("Employee information has been deleted from the DataBase Successfully ! "));

    }

    // extra end point
    @GetMapping("/get-by-range/{min}/{max}")
    public ResponseEntity<?> getEmployeeBySalaryRange(@PathVariable Integer min ,@PathVariable Integer max ){


        List<Employee> employees = employeeService.getEmployeeBySalaryRange(min , max);

        if (employees == null){
            return ResponseEntity.status(400).body(new ApiResponse("there is no employee who have salary within the given range within the DataBase yet ! "));
        }

        return ResponseEntity.status(200).body(employeeService.getAllEmployees());
    }




}
