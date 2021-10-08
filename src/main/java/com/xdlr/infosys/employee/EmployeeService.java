package com.xdlr.infosys.employee;

import com.xdlr.infosys.model.Employee;
import com.xdlr.infosys.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee registerNewEmployee( String name, String sex, String phone, String idCardNumber, String department,
                                        String position, String job, String entryTime){
        String password = idCardNumber.substring(12);

        LocalDate birthday = LocalDate.of(Integer.parseInt(idCardNumber.substring(6,10)),
                Integer.parseInt(idCardNumber.substring(10,12)),
                Integer.parseInt(idCardNumber.substring(12,14)));

        LocalDate entry = LocalDate.of(Integer.parseInt(entryTime.substring(0,4)),
                Integer.parseInt(entryTime.substring(5,7)),
                Integer.parseInt(entryTime.substring(8,10)));

        Employee employee = new Employee(name, password, idCardNumber, phone,
                sex, job, department, position,birthday, entry);
        return employeeRepository.save(employee);
    }

    public Employee login(Long id, String password){
        if(!employeeRepository.existsById(id)) return null;
        Employee employee = employeeRepository.findFirstById(id);
        if(employee.getPassword().equals(password)) return employee;
        return null;
    }
}
