package com.xdlr.infosys.repo;

import com.xdlr.infosys.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    List<Employee> findAll();
    Employee findFirstById(Long id);
}
