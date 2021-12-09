package com.xdlr.infosys.repo;

import com.xdlr.infosys.model.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member,Integer> {
    List<Member> findAll();
    Member findFirstById(Integer id);
    Member findEmployeeByPosition(String position);
    Member findEmployeeByDepartment(String department);
}
