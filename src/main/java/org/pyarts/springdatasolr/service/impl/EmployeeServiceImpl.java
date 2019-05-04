package org.pyarts.springdatasolr.service.impl;

import org.pyarts.springdatasolr.model.Employee;
import org.pyarts.springdatasolr.repository.EmployeeRepository;
import org.pyarts.springdatasolr.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void save(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findByName(String name) {
        return employeeRepository.findByName(name);
    }
}
