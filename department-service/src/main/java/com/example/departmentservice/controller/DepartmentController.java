package com.example.departmentservice.controller;


import com.example.departmentservice.client.EmployeeClient;
import com.example.departmentservice.model.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    /*@Autowired
    private EmployeeClient employeeClient;*/

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        LOGGER.info("adding department with id {}", department.getId());
        return departmentRepository.addDepartment(department);
    }


    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        LOGGER.info("find department by id : {}",id);
        return departmentRepository.findById(id);
    }

    @GetMapping
    public List<Department> findAll(){
        LOGGER.info("find all departments");
        return departmentRepository.findALl();
    }
}
