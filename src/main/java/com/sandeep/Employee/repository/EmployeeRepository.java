package com.sandeep.Employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.sandeep.Employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
