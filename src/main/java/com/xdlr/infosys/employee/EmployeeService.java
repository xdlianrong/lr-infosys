package com.xdlr.infosys.employee;

import com.xdlr.infosys.model.Employee;
import com.xdlr.infosys.model.Manage;
import com.xdlr.infosys.repo.EmployeeRepository;
import com.xdlr.infosys.repo.ManageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@ResponseBody
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    ManageRepository manageRepository;
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
    public String addManage(Employee addedEmployee){
        Long employeeId= addedEmployee.getId();
        String employeeName = addedEmployee.getName();
        List<String> manageDepartment = new ArrayList<>();

        String employeeDepartment = addedEmployee.getDepartment();
        switch (employeeDepartment){
            case "研发部":{
                manageDepartment.add("综合部");
                manageDepartment.add("技术部");
                break;
            }
            case "管理层":{
                break;
            }
            default :{
                manageDepartment.add("管理层");
            }
        }

        for(int i = 0;i < manageDepartment.size();i++){
            Employee manager;
            logger.debug("" + i);
            if(i == 1){
                manager =  employeeRepository.findEmployeeByPosition("技术总监");
            }else{
                logger.debug(manageDepartment.get(i));
                manager = employeeRepository.findEmployeeByDepartment(manageDepartment.get(i));
            }
            Long managerId = manager.getId();
            String managerName = manager.getName();
            Manage manage = new Manage(employeeId,employeeName,managerId,managerName);
            manageRepository.save(manage);
        }
        return "添加关系完成";
    }

    public Employee login(Long id, String password){
        if(!employeeRepository.existsById(id)) return null;
        Employee employee = employeeRepository.findFirstById(id);
        if(employee.getPassword().equals(password)) return employee;
        return null;
    }
}
