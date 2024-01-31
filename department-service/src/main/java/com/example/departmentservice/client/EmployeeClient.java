package com.example.departmentservice.client;

import com.example.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

//@HttpExchange
public interface EmployeeClient {

    @GetMapping("employee/department")
    public List<Employee> getEmployeesByDepartmentId(@RequestParam Long departmentId);
}
