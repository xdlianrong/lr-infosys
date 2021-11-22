package com.xdlr.infosys.repo;

import com.xdlr.infosys.model.LeaveInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LeaveInfoRepository extends CrudRepository<LeaveInfo,Integer> {
    List<LeaveInfo> findByReaded(Boolean readed);
}
