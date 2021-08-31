package com.xdlr.infosys.repo;

import com.xdlr.infosys.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
