package org.pyarts.springdatasolr.repository;

import org.pyarts.springdatasolr.model.Employee;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface EmployeeRepository extends SolrCrudRepository<Employee, Long> {
    Employee findByName(String name);
}
