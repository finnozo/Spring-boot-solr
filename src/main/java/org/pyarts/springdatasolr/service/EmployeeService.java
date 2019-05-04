package org.pyarts.springdatasolr.service;

import org.pyarts.springdatasolr.model.Employee;

import java.util.List;

public interface EmployeeService {
    void save(List<Employee> employees);

    Iterable<Employee> findAll();

    Employee findByName(String name);
}
