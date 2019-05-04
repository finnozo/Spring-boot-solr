package org.pyarts.springdatasolr.controller;

import org.pyarts.springdatasolr.model.Employee;
import org.pyarts.springdatasolr.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostConstruct
    public void addEmployees(){
        List<Employee> employees = Arrays.asList(
                new Employee(1L,"Sushil Dangi",new String[]{"Pg","Yamal devi"}),
                new Employee(2L,"Sandeep Kumar",new String[]{"BTM","Layout"}),
                new Employee(3L,"Avinash Singh",new String[]{"Silk","Board"}),
                new Employee(4L,"Test Test ",new String[]{"JP Nagar","Banaglore"})

        );

        employeeService.save(employees);
    }


    @GetMapping("/employees")
    public Iterable<Employee> findAllEmployee(){
        return employeeService.findAll();
    }


    @GetMapping("/employee/{name}")
    public Employee findEmployeeByName(@PathVariable("name") String name){
        return employeeService.findByName(name);
    }


















}
