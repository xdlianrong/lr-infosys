package com.xdlr.infosys.member;

import com.xdlr.infosys.model.Member;
import com.xdlr.infosys.model.Manage;
import com.xdlr.infosys.repo.MemberRepository;
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
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    ManageRepository manageRepository;
    Logger logger = LoggerFactory.getLogger(MemberService.class);
    public Member registerNewEmployee(String name, String phone, String email, String sex, String department, String position, String identityNumber, String entryTime){
        String password = identityNumber.substring(12);

        LocalDate birthday = LocalDate.of(Integer.parseInt(identityNumber.substring(6,10)),
                Integer.parseInt(identityNumber.substring(10,12)),
                Integer.parseInt(identityNumber.substring(12,14)));

        LocalDate entry = LocalDate.of(Integer.parseInt(entryTime.substring(0,4)),
                Integer.parseInt(entryTime.substring(5,7)),
                Integer.parseInt(entryTime.substring(8,10)));

        Member employee = new Member(name,email, password, identityNumber, phone,
                sex, department, position,birthday, entry);
        return memberRepository.save(employee);
    }
    public String addManage(Member addedEmployee){
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
            Member manager;
            logger.debug("" + i);
            if(i == 1){
                manager =  memberRepository.findEmployeeByPosition("技术总监");
            }else{
                logger.debug(manageDepartment.get(i));
                manager = memberRepository.findEmployeeByDepartment(manageDepartment.get(i));
            }
            Long managerId = manager.getId();
            String managerName = manager.getName();
            Manage manage = new Manage(employeeId,employeeName,managerId,managerName);
            manageRepository.save(manage);
        }
        return "添加关系完成";
    }

    public Boolean login(Long id, String password){
        if(!memberRepository.existsById(id)) return false;
        logger.debug("user exists");
        Member employee = memberRepository.findFirstById(id);
        logger.debug("password from db is " + employee.getPassword());
        if(employee.getPassword().equals(password)) return true;
        return false;
    }
}
