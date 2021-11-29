package com.xdlr.infosys.member;

import com.xdlr.infosys.model.Member;
import com.xdlr.infosys.repo.MemberRepository;
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
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MemberService memberService;
    Logger logger = LoggerFactory.getLogger(MemberController.class);

    @GetMapping("/members")
    public List<Member> getAllEmployees(){
        return memberRepository.findAll();
    }

    @PostMapping("/members")
    public String createEmployee(String name, String phone,
                                   String email, String sex,
                                 String department,
                                   String position, String identityNumber,
                                   String entryTime){
        logger.debug("name is " + name);
        //why i return this object to front end
        Member addedEmployee = memberService.registerNewEmployee(name, phone, email, sex, department, position,identityNumber, entryTime);
//        memberService.addManage(addedEmployee);
        return "添加用户完成";
    }

    @GetMapping("/members/{id}")
    public ResponseEntity<Member> getEmployeeById(@PathVariable(value = "id") String id){
        Member member = memberRepository.findFirstById(Long.parseLong(id));
        return ResponseEntity.ok().body(member);
    }

    @DeleteMapping("/members/{id}")
    public ResponseEntity<Member> deleteEmployeeById(@PathVariable(value = "id") String id){
        Member member = memberRepository.findFirstById(Long.parseLong(id));
        member.setDeleted(true);
        return ResponseEntity.ok().body(member);
    }

    @PostMapping("/member/login")
    public ModelAndView login(String id, String password){
        if(memberService.login(new Long(id), password) != null) return new ModelAndView("index");
        else return new ModelAndView("error");
    }

}
