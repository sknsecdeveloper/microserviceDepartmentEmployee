package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        LOGGER.info("Saving employee with employeeId {}", employee.getId());
        return employeeRepository.saveEmployee(employee);
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeById(@PathVariable Long employeeId) {
        LOGGER.info("Retrieve employee by employeeId {}", employeeId);
        return employeeRepository.getEmployeeById(employeeId);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        LOGGER.info("Retrieving all employee");
        return employeeRepository.getAllEmployee();
    }

    @GetMapping("/department")
    public List<Employee> getEmployeesByDepartmentId(@RequestParam Long departmentId) {
        LOGGER.info("retrieving all employee by departmentId {}", departmentId);
        return employeeRepository.getEmployeesByDepartmentId(departmentId);
    }

}
