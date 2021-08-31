package com.xdlr.infosys.register;

import com.xdlr.infosys.model.Employee;
import com.xdlr.infosys.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;


@Service
public class RegisterService {
    Logger logger = LoggerFactory.getLogger(RegisterService.class);
    @Autowired
    EmployeeRepository employeeRepository;
    public boolean registerNewEmployee( String name, String sex,
                                         String phone, String idCardNumber,
                                        String department,
                                         String position, String job,
                                        String entryTime){
        String password = idCardNumber.substring(12);

        LocalDate birthday = LocalDate.of(Integer.parseInt(idCardNumber.substring(6,10)),
                Integer.parseInt(idCardNumber.substring(10,12)),
                Integer.parseInt(idCardNumber.substring(12,14)));

        LocalDate entry = LocalDate.of(Integer.parseInt(entryTime.substring(0,4)),
                Integer.parseInt(entryTime.substring(5,7)),
                Integer.parseInt(entryTime.substring(8,10)));

        Employee employee = new Employee(name, password, idCardNumber, phone,
                sex, job, department, position,birthday, entry);
        employeeRepository.save(employee);

        return true;
    }

}
