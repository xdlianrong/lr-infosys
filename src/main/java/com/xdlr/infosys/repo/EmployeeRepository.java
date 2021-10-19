package com.xdlr.infosys.repo;

import com.xdlr.infosys.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    List<Employee> findAll();
    Employee findFirstById(Long id);
    Boolean existsById(Long id);
    Employee findEmployeeByPosition(String position);
    Employee findEmployeeByDepartment(String department);
}
