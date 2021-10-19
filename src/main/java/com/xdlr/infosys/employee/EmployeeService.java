package com.xdlr.infosys.employee;

import com.xdlr.infosys.model.Employee;
import com.xdlr.infosys.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Service
@ResponseBody
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    public Employee registerNewEmployee(String name, String phone, String email, String sex, String job, String department, String position, String identityNumber, String entryTime){
        String password = identityNumber.substring(12);

        LocalDate birthday = LocalDate.of(Integer.parseInt(identityNumber.substring(6,10)),
                Integer.parseInt(identityNumber.substring(10,12)),
                Integer.parseInt(identityNumber.substring(12,14)));

        LocalDate entry = LocalDate.of(Integer.parseInt(entryTime.substring(0,4)),
                Integer.parseInt(entryTime.substring(5,7)),
                Integer.parseInt(entryTime.substring(8,10)));

        Employee employee = new Employee(name,email, password, identityNumber, phone,
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
