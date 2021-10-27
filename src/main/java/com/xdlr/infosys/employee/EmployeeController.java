package com.xdlr.infosys.employee;

import com.xdlr.infosys.model.Employee;
import com.xdlr.infosys.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api/v0")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeService employeeService;
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public String createEmployee(String name, String phone,
                                   String email, String sex,
                                   String job, String department,
                                   String position, String identityNumber,
                                   String entryTime){
        logger.debug("name is " + name);
        //why i return this object to front end
        Employee addedEmployee = employeeService.registerNewEmployee(name, phone, email, sex, job, department, position,identityNumber, entryTime);
//        employeeService.addManage(addedEmployee);
        return "添加用户完成";
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") String id){
        Employee employee = employeeRepository.findFirstById(Long.parseLong(id));
        return ResponseEntity.ok().body(employee);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployeeById(@PathVariable(value = "id") String id){
        Employee employee = employeeRepository.findFirstById(Long.parseLong(id));
        employee.setDeleted(true);
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employee/login")
    public ModelAndView login(String id, String password){
        if(employeeService.login(new Long(id), password) != null) return new ModelAndView("index");
        else return new ModelAndView("error");
    }

}
