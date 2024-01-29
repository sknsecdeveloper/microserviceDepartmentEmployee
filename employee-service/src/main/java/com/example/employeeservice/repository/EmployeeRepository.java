package com.example.employeeservice.repository;

import com.example.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {

    List<Employee> employeeList = new ArrayList<>();

    public Employee saveEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public Employee getEmployeeById(Long employeeId) {
        return employeeList.stream().filter(emp -> emp.getId().equals(employeeId)).findFirst()
                .orElseThrow();
    }

    public List<Employee> getAllEmployee(){
        return employeeList;
    }

    public List<Employee> getEmployeesByDepartmentId(Long departmentId) {
        return employeeList.stream().filter(emp -> emp.getDepartmentId().equals(departmentId))
                .collect(Collectors.toList());
    }

}
