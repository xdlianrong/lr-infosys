package com.xdlr.infosys.repo;

import com.xdlr.infosys.model.LeaveInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveInfoRepository extends CrudRepository<LeaveInfo,Integer> {
    List<LeaveInfo> findByReaded(Boolean readed);
}
